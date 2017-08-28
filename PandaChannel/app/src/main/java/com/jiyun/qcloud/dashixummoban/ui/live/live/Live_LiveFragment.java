package com.jiyun.qcloud.dashixummoban.ui.live.live;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.app.App;
import com.jiyun.qcloud.dashixummoban.base.BaseFragment;
import com.jiyun.qcloud.dashixummoban.entity.LiveLive;
import com.jiyun.qcloud.dashixummoban.entity.MoreLive;
import com.jiyun.qcloud.dashixummoban.entity.MoreLiveITT;
import com.jiyun.qcloud.dashixummoban.modle.net.OkBaseHttpImpl;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;
import com.jiyun.qcloud.dashixummoban.ui.live.activity.PlayVideoActivity;
import com.jiyun.qcloud.dashixummoban.ui.live.live.moreLive.MoreLiveFragment;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

/**
 * Created by 82年的笔记本 on 2017/8/24.
 */

public class Live_LiveFragment extends BaseFragment implements Live_LiveContract.View {
    Live_LiveContract.Presenter presenter;
    @BindView(R.id.tit)
    TextView title;
    @BindView(R.id.image)
    ImageView image;
    @BindView(R.id.context)
    TextView context;
    @BindView(R.id.tablayout)
    TabLayout mTablayout;
    @BindView(R.id.viewpager)
    ViewPager mViewpager;
    @BindView(R.id.jiecao)
    JCVideoPlayer jcVideoPlayer;
    List<Fragment> fragments = new ArrayList<>();
    List<String> titles = new ArrayList<>();
    private MoreLiveFragment moreLiveFragment;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_live_live;
    }

    @Override
    protected void initData() {
        presenter.start();
    }

    @Override
    protected void initView(View view) {
        EventBus.getDefault().register(this);
        moreLiveFragment = new MoreLiveFragment();
//        jcVideoPlayer.setUp("http://ipanda.vtime.cntv.cloudcdn.net:8000/live/flv/channel54?AUTH=teDlZleeu77yw1ZT2SvlPM8boVgF3ImzAm07ij5B8lJwSRQkJ8UscT/YH4b6RAgscurpO5XtQXsnoQoInNKdfw==", "");
        startActivity(new Intent(App.mBaseActivity, PlayVideoActivity.class));
    }

    @Override
    public void setBundle(Bundle bundle) {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void dimissProgress() {

    }

    @Override
    public void showMessage(String msg) {

    }

    @Override
    public void setPresenter(Live_LiveContract.Presenter presenter) {
        this.presenter = presenter;
    }


    @Override
    public void showLiveListData(LiveLive liveLive) {
        List<LiveLive.LiveBean> live = liveLive.getLive();
        title.setText("[正在直播]" + live.get(0).getTitle());
        Log.e("Live_LiveFragment", live.get(0).getTitle());
        context.setText(live.get(0).getBrief());
        LiveLive.BookmarkBean bookmark = liveLive.getBookmark();
        List<LiveLive.BookmarkBean.MultipleBean> multiple = bookmark.getMultiple();
        titles.add(multiple.get(0).getTitle());
        List<LiveLive.BookmarkBean.WatchTalkBean> watchTalk = bookmark.getWatchTalk();
        titles.add(watchTalk.get(0).getTitle());
        fragments.add(moreLiveFragment);
        fragments.add(new Fragment());

        mViewpager.setAdapter(new FragmentPagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return titles.get(position);
            }
        });
        mTablayout.setupWithViewPager(mViewpager);
    }

    @Override
    public void playVideo() {

    }

    @Override
    public void loadWebView() {

    }

    @OnClick(R.id.image)
    public void onViewClicked() {
        int visibility = context.getVisibility();
        if (visibility == View.GONE) {
            image.setImageResource(R.drawable.live_china_detail_down);
            context.setVisibility(View.VISIBLE);
        } else {
            image.setImageResource(R.drawable.live_china_detail_up);
            context.setVisibility(View.GONE);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN) //在ui线程执行
    public void onUserEvent(final MoreLive.ListBean event) {

        OkBaseHttpImpl.getInstance().get("http://vdn.live.cntv.cn/api2/live.do?channel=pa://cctv_p2p_hd" + event.getId() + "&client=iosapp", null, new NetWorkCallBack<MoreLiveITT>() {
            @Override
            public void onSuccess(MoreLiveITT moreLiveITT) {
                String flv1 = moreLiveITT.getFlv_url().getFlv2();
                title.setText("[正在直播]" + event.getTitle());
                jcVideoPlayer.setUp(flv1, event.getTitle());
            }

            @Override
            public void onError(int errorCode, String errorMsg) {
            }

            @Override
            public void onFail(String netOff) {

            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
