package com.jiyun.qcloud.dashixummoban.ui.gungun;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.app.App;
import com.jiyun.qcloud.dashixummoban.base.BaseFragment;
import com.jiyun.qcloud.dashixummoban.ui.gungun.activity.GunVideo;
import com.jiyun.qcloud.dashixummoban.ui.gungun.activity.PandaFileActivity;
import com.jiyun.qcloud.dashixummoban.ui.gungun.adapter.GunAdapter;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.PandaGunBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/8/25 0025.
 */

public class GunPageFragment extends BaseFragment implements GunContract.View {
    @BindView(R.id.gun_listview)
    ListView gunListview;
    Unbinder unbinder;
    @BindView(R.id.gun_swipe)
    SwipeRefreshLayout gunSwipe;
    private GunContract.Presenter presenter;
    private GunAdapter adapter;
    private ArrayList<PandaGunBean.ListBean> list;
    private ImageView g_image;
    private TextView g_title;
    private static final int REFRESH_COMPLETE = 0X110;

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case REFRESH_COMPLETE:
                    gunSwipe.setRefreshing(false);
                    break;
            }
        }
    };

    @Override
    public void showProgress() {

    }

    @Override
    public void dimissProgress() {

    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_gun;
    }

    private void swipe() {
        gunSwipe.setColorSchemeResources(android.R.color.holo_blue_light, android.R.color.holo_red_light, android.R.color.holo_green_light);
        gunSwipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                // TODO Auto-generated method stub
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        handler.sendEmptyMessageDelayed(REFRESH_COMPLETE, 2000);
                    }
                }, 3000);
            }

        });

    }

    @Override
    public void showMessage(String msg) {

    }

    @Override
    public void setPresenter(GunContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    protected void initView(View view) {
        list = new ArrayList<>();
        adapter = new GunAdapter(App.mBaseActivity, list);
        gunListview.setAdapter(adapter);
        View inflate = View.inflate(App.mBaseActivity, R.layout.gun_head_image, null);
        g_image = inflate.findViewById(R.id.g_head_image);
        g_title = inflate.findViewById(R.id.g_head_title);
        gunListview.addHeaderView(inflate);
        swipe();
        g_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(App.mBaseActivity, GunVideo.class);
                startActivity(intent);
            }
        });

        gunListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(App.mBaseActivity, PandaFileActivity.class);
                intent.putExtra("id", list.get(i).getId());
                startActivity(intent);
            }
        });
    }

    @Override
    public void showGunListData(PandaGunBean gunBean) {
        List<PandaGunBean.BigImgBean> bigImg = gunBean.getBigImg();
        for (PandaGunBean.BigImgBean imgBean : bigImg) {
            g_title.setText(imgBean.getTitle());
            Glide.with(App.mBaseActivity).load(imgBean.getImage()).into(g_image);
        }
        List<PandaGunBean.ListBean> lists = gunBean.getList();
        list.addAll(lists);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void playVideo() {

    }

    @Override
    public void loadWebView() {

    }

    @Override
    protected void initData() {
        presenter.start();
    }

    @Override
    public void setBundle(Bundle bundle) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
