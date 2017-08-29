package com.jiyun.qcloud.dashixummoban.ui.broadcast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.app.App;
import com.jiyun.qcloud.dashixummoban.base.BaseFragment;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.activity.BroadPlay;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.adapter.BroadAdapter;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.bean.BroadListBean;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.bean.PandaBroad;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/8/23 0023.
 */

public class BroadPageFragment extends BaseFragment implements XRecyclerView.LoadingListener, BroadContract.View{
    @BindView(R.id.broad_recyclerview)
    XRecyclerView broadRecyclerview;
    private BroadContract.Presenter presenter;
    Unbinder unbinder;
    private ImageView b_head_image;
    private TextView b_head_title;
    private ArrayList<BroadListBean.ListBean> list;
    private BroadAdapter adapter;
    int page = 1;
    private String listurl;


    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_broad;
    }

    @Override
    protected void initData() {
        presenter.start();
    }

    @Override
    protected void initView(View view) {
        View inflate = View.inflate(App.mBaseActivity, R.layout.broad_head_image, null);
        b_head_image = inflate.findViewById(R.id.b_head_image);
        b_head_title = inflate.findViewById(R.id.b_head_title);
        broadRecyclerview.addHeaderView(inflate);
        list = new ArrayList<>();
        RecyclerView.LayoutManager manager = new LinearLayoutManager(App.mBaseActivity);
        broadRecyclerview.setLayoutManager(manager);
        adapter = new BroadAdapter(App.mBaseActivity, list);
        broadRecyclerview.setAdapter(adapter);

        b_head_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(App.mBaseActivity, BroadPlay.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void setBundle(Bundle bundle) {

    }

    @Override
    public void onRefresh() {
        presenter.start();
        broadRecyclerview.refreshComplete();
    }

    @Override
    public void onLoadMore() {
        page++;
        presenter.loadmore(listurl, page);

    }

    @Override
    public void showBroadLoadMore(BroadListBean listBean) {
        if (listBean != null) {
            List<BroadListBean.ListBean> list1 = listBean.getList();
            list.addAll(list1);
            adapter.notifyDataSetChanged();
        }
        broadRecyclerview.loadMoreComplete();
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
    public void setPresenter(BroadContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showBroadListData(PandaBroad pandaBroad) {
        if (pandaBroad != null) {
            PandaBroad.DataBean data = pandaBroad.getData();
            listurl = pandaBroad.getData().getListurl();
            List<PandaBroad.DataBean.BigImgBean> bigImg = data.getBigImg();
            for (PandaBroad.DataBean.BigImgBean bigbean : bigImg) {
                Glide.with(App.mBaseActivity).load(bigbean.getImage()).into(b_head_image);
                b_head_title.setText(bigbean.getTitle());
            }
            presenter.second(pandaBroad.getData().getListurl());

        }
        Log.e("TAG", "**********");
    }

    @Override
    public void showBroadListBean(BroadListBean listBean) {
        List<BroadListBean.ListBean> list1 = listBean.getList();
        list.addAll(list1);
        adapter.notifyDataSetChanged();

    }

    @Override
    public void playVideo() {

    }

    @Override
    public void loadWebView() {

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
