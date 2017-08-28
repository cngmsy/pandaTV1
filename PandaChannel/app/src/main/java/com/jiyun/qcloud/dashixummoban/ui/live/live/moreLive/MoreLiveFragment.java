package com.jiyun.qcloud.dashixummoban.ui.live.live.moreLive;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.base.BaseFragment;
import com.jiyun.qcloud.dashixummoban.entity.MoreLive;
import com.jiyun.qcloud.dashixummoban.modle.net.OkBaseHttpImpl;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;
import com.jiyun.qcloud.dashixummoban.ui.live.adapter.LiveGridAdapter;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by 82年的笔记本 on 2017/8/26.
 */

public class MoreLiveFragment extends BaseFragment {
    @BindView(R.id.gridview)
    GridView gridview;
    List<MoreLive.ListBean> listBeen = new ArrayList<>();
    private LiveGridAdapter liveGridAdapter;


    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_live_more;
    }

    @Override
    protected void initData() {
        liveGridAdapter = new LiveGridAdapter(listBeen);
        gridview.setAdapter(liveGridAdapter);
        gridview.setOverScrollMode(View.OVER_SCROLL_NEVER);
        OkBaseHttpImpl.getInstance().get("http://www.ipanda.com/kehuduan/PAGE14501769230331752/PAGE14501787896813312/index.json", null, new NetWorkCallBack<MoreLive>() {
            @Override
            public void onSuccess(MoreLive moreLive) {
                List<MoreLive.ListBean> list = moreLive.getList();
                listBeen.addAll(list);
                liveGridAdapter.notifyDataSetChanged();
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
    protected void initView(View view) {
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                EventBus.getDefault().post(listBeen.get(i));
            }
        });
    }

    @Override
    public void setBundle(Bundle bundle) {

    }


}
