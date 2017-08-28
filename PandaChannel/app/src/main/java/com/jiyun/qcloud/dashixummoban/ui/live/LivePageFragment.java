package com.jiyun.qcloud.dashixummoban.ui.live;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.base.BaseFragment;
import com.jiyun.qcloud.dashixummoban.entity.PandaLive;
import com.jiyun.qcloud.dashixummoban.ui.live.adapter.Live_Adapter;
import com.jiyun.qcloud.dashixummoban.ui.live.file.LiveFilePresenter;
import com.jiyun.qcloud.dashixummoban.ui.live.file.Live_FileFragment;
import com.jiyun.qcloud.dashixummoban.ui.live.live.Live_LiveFragment;
import com.jiyun.qcloud.dashixummoban.ui.live.live.Live_LivePresenter;
import com.jiyun.qcloud.dashixummoban.ui.live.liveWonderful.LiveWonderfulPresenter;
import com.jiyun.qcloud.dashixummoban.ui.live.liveWonderful.Live_WonderfulFragment;
import com.jiyun.qcloud.dashixummoban.ui.live.news.LiveNewsPresenter;
import com.jiyun.qcloud.dashixummoban.ui.live.news.Live_NewsFragment;
import com.jiyun.qcloud.dashixummoban.ui.live.panda.LivePandaPresenter;
import com.jiyun.qcloud.dashixummoban.ui.live.panda.Live_PandaFragment;
import com.jiyun.qcloud.dashixummoban.ui.live.progrem.LiveProgremPresenter;
import com.jiyun.qcloud.dashixummoban.ui.live.progrem.Live_ProgremFragment;
import com.jiyun.qcloud.dashixummoban.ui.live.roll.LiveRollPresenter;
import com.jiyun.qcloud.dashixummoban.ui.live.roll.Live_RollFragment;
import com.jiyun.qcloud.dashixummoban.ui.live.thing.LiveThingPresenter;
import com.jiyun.qcloud.dashixummoban.ui.live.thing.Live_ThingFragment;
import com.jiyun.qcloud.dashixummoban.ui.live.top.LiveTopPresenter;
import com.jiyun.qcloud.dashixummoban.ui.live.top.Live_TopFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


/**
 * Created by chj on 2017/8/20.
 */

public class LivePageFragment extends BaseFragment implements LiveContract.View {
    @BindView(R.id.live_tab)
    TabLayout live_Tab;
    @BindView(R.id.live_vip)
    ViewPager live_Vip;
    private LiveContract.Presenter presenter;
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();
    private Live_Adapter live_viewpagerAdapter;
    private Live_WonderfulFragment live_wonderfulFragment;
    private Live_NewsFragment live_newsFragment;
    private Live_ProgremFragment live_progremFragment;
    private Live_RollFragment live_rollFragment;
    private Live_ThingFragment live_thingFragment;
    private Live_TopFragment live_topFragment;
    private Live_FileFragment live_fileFragment;
    private Live_PandaFragment live_pandaFragment;
    private Live_LiveFragment live_liveFragment;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_live;
    }

    @Override
    protected void initData() {
        presenter.start();
    }

    @Override
    protected void initView(View view) {

        live_viewpagerAdapter = new Live_Adapter(getChildFragmentManager(), fragments, titles);
        live_Vip.setAdapter(live_viewpagerAdapter);
        live_Tab.setTabMode(TabLayout.MODE_SCROLLABLE);
        live_Tab.setupWithViewPager(live_Vip);

        live_liveFragment = new Live_LiveFragment();
        new Live_LivePresenter(live_liveFragment);

        live_wonderfulFragment = new Live_WonderfulFragment();
        new LiveWonderfulPresenter(live_wonderfulFragment);

        live_newsFragment = new Live_NewsFragment();
        new LiveNewsPresenter(live_newsFragment);

        live_progremFragment = new Live_ProgremFragment();
        new LiveProgremPresenter(live_progremFragment);

        live_rollFragment = new Live_RollFragment();
        new LiveRollPresenter(live_rollFragment);

        live_thingFragment = new Live_ThingFragment();
        new LiveThingPresenter(live_thingFragment);

        live_topFragment = new Live_TopFragment();
        new LiveTopPresenter(live_topFragment);

        live_fileFragment = new Live_FileFragment();
        new LiveFilePresenter(live_fileFragment);

        live_pandaFragment = new Live_PandaFragment();
        new LivePandaPresenter(live_pandaFragment);

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
    public void setPresenter(LiveContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showLiveListData(PandaLive pandaLive) {
        List<PandaLive.TablistBean> tablist = pandaLive.getTablist();
        for (PandaLive.TablistBean tablistBean : tablist) {
            String title = tablistBean.getTitle();
            titles.add(title);
        }
        Log.d("LivePageFragment", "titles.size():" + titles.size());
        fragments.add(live_liveFragment);
        fragments.add(live_wonderfulFragment);
        fragments.add(live_pandaFragment);
        fragments.add(live_rollFragment);
        fragments.add(live_fileFragment);
        fragments.add(live_topFragment);
        fragments.add(live_thingFragment);
        fragments.add(live_progremFragment);
        fragments.add(live_newsFragment);
        live_viewpagerAdapter.notifyDataSetChanged();
    }

    @Override
    public void playVideo() {

    }

    @Override
    public void loadWebView() {

    }
}
