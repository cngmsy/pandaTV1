package com.jiyun.qcloud.dashixummoban.ui.home;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.base.BaseFragment;
import com.jiyun.qcloud.dashixummoban.entity.PandaHome;
import com.jiyun.qcloud.dashixummoban.ui.home.adapter.HomeRecyclerAdapter;
import com.jiyun.qcloud.dashixummoban.ui.home.entity.InToCctvBean;
import com.jiyun.qcloud.dashixummoban.ui.home.entity.InToGunGunBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by chj on 2017/8/20.
 */

public class HomePageFragment extends BaseFragment implements XRecyclerView.LoadingListener, HomeContract.View,HomeRecyclerAdapter.XItemClickListener {

    @BindView(R.id.rv_home)
    RecyclerView rvHome;
    @BindView(R.id.sfl_home)
    SwipeRefreshLayout sflHome; 
    private HomeContract.Presenter presenter;
    private List<Object> mList = new ArrayList<>();
    private HomeRecyclerAdapter homeAdapter;
    private List<InToCctvBean.ListBean> cctvBeanList = new ArrayList<>();
    private List<InToGunGunBean.ListBean> gunGunBeanList = new ArrayList<>();


    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initData() {
        presenter.start();
        sflHome.setProgressBackgroundColorSchemeResource(android.R.color.white);
        sflHome.setColorSchemeResources(R.color.colorAccent, R.color.colorPrimary, R.color.colorPrimaryDark);
        sflHome.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
            }
        });
    }

    @Override
    protected void initView(View view) {
    }

    @Override
    public void setBundle(Bundle bundle) {

    }

    @Override
    public void showHomeListData(PandaHome pandaHome) {
        //轮播
        List<PandaHome.DataBean.BigImgBean> bigImg = pandaHome.getData().getBigImg();
        //精彩一刻
        PandaHome.DataBean.CctvBean cctv = pandaHome.getData().getCctv();
        //直播中国
        PandaHome.DataBean.ChinaliveBean chinalive = pandaHome.getData().getChinalive();
        //熊猫播报
        PandaHome.DataBean.PandaeyeBean pandaeye = pandaHome.getData().getPandaeye();
        //直播秀场
        PandaHome.DataBean.PandaliveBean pandalive = pandaHome.getData().getPandalive();
        //滚滚视频
        List<PandaHome.DataBean.ListBeanXX> list = pandaHome.getData().getList();

        mList.add(bigImg);
        mList.add(pandaeye);
        mList.add(pandalive);
        mList.add(cctv);
        mList.add(chinalive);
        for (int i = 0; i < list.size(); i++) {
            mList.add(list.get(i));
        }
    }

    @Override
    public void showCctvListData(InToCctvBean cctvBean) {
        cctvBeanList.addAll(cctvBean.getList());
    }

    @Override
    public void showGunGunListData(InToGunGunBean gunGunBean) {
        gunGunBeanList.addAll(gunGunBean.getList());
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext());
        rvHome.setLayoutManager(manager);
        homeAdapter = new HomeRecyclerAdapter(getContext(), mList,cctvBeanList,gunGunBeanList);
        rvHome.setAdapter(homeAdapter);

        homeAdapter.setOnXItemClickListener(this);
    }

    @Override
    public void playVideo() {

    }

    @Override
    public void loadWebView() {

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
    public void setPresenter(HomeContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onRefresh() {
        presenter.start();
    }

    @Override
    public void onLoadMore() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onLunBoListener(int position, List<PandaHome.DataBean.BigImgBean> imgBeanList) {
        Toast.makeText(getContext(), "onLunBoListener", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSplendidListener(int position, View view) {
        Toast.makeText(getContext(), "onSplendidListener", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFristBroadCastListener(View view) {
        Toast.makeText(getContext(), "onFristBroadCastListener", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSecondBroadCastListener(View view) {
        Toast.makeText(getContext(), "onSecondBroadCastListener", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLiveListener(int position, View view) {
        Toast.makeText(getContext(), "onLiveListener", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onGunGunListener(int position, View view) {
        Toast.makeText(getContext(), "onGunGunListener", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onChinaListener(int position, View view) {
        Toast.makeText(getContext(), "onChinaListener", Toast.LENGTH_SHORT).show();
    }
}
