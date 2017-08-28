package com.jiyun.qcloud.dashixummoban.ui.live.top;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.app.App;
import com.jiyun.qcloud.dashixummoban.base.BaseFragment;
import com.jiyun.qcloud.dashixummoban.entity.PandaWonderful;
import com.jiyun.qcloud.dashixummoban.ui.live.activity.VideoActivity;
import com.jiyun.qcloud.dashixummoban.ui.live.adapter.Live_Wonderful_Adapter;
import com.jiyun.qcloud.dashixummoban.ui.live.liveWonderful.LiveWonderfulContract;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by 82年的笔记本 on 2017/8/24.
 */

public class Live_TopFragment extends BaseFragment implements LiveWonderfulContract.View {
    @BindView(R.id.listview)
    ListView listview;
    private LiveWonderfulContract.Presenter presenter;

    private List<PandaWonderful.VideoBean> videoBeanList = new ArrayList<>();
    private Live_Wonderful_Adapter adapter;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_wonderful_live;
    }

    @Override
    protected void initData() {
        presenter.start();
    }

    @Override
    protected void initView(View view) {
        adapter = new Live_Wonderful_Adapter(videoBeanList);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(App.mBaseActivity, VideoActivity.class);
                intent.putExtra("video",videoBeanList.get(i));
                startActivity(intent);
            }
        });
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
    public void setPresenter(LiveWonderfulContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showLiveListData(PandaWonderful pandaWonderful) {
        List<PandaWonderful.VideoBean> video = pandaWonderful.getVideo();
        videoBeanList.addAll(video);
        adapter.notifyDataSetChanged();

    }

    @Override
    public void playVideo() {

    }

    @Override
    public void loadWebView() {

    }
}
