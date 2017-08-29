package com.jiyun.qcloud.dashixummoban.ui.broadcast;

import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.bean.BroadListBean;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.bean.PandaBroad;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.model.IPandaBroadModel;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.model.PandaBroadModelImpl;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class BroadPresenter implements BroadContract.Presenter {
    private BroadContract.View broadview;
    private IPandaBroadModel broadModel;

    public BroadPresenter(BroadContract.View broadview) {
        this.broadview = broadview;
        broadview.setPresenter(this);
        this.broadModel = new PandaBroadModelImpl();
    }

    @Override
    public void start() {
        broadview.showProgress();
        broadModel.loadBroadList(new NetWorkCallBack<PandaBroad>() {
            @Override
            public void onSuccess(PandaBroad pandaBroad) {
                broadview.showBroadListData(pandaBroad);
                broadview.dimissProgress();
            }

            @Override
            public void onError(int errorCode, String errorMsg) {
                broadview.showMessage(errorMsg);
                broadview.dimissProgress();
            }

            @Override
            public void onFail(String netOff) {

            }
        });

    }

    @Override
    public void second(String url) {
        broadModel.loadBroadBean(new NetWorkCallBack<BroadListBean>() {
            @Override
            public void onSuccess(BroadListBean listBean) {
                broadview.showBroadListBean(listBean);
                broadview.dimissProgress();
            }

            @Override
            public void onError(int errorCode, String errorMsg) {
                broadview.showMessage(errorMsg);
                broadview.dimissProgress();
            }

            @Override
            public void onFail(String netOff) {

            }
        }, url);
    }

    @Override
    public void loadmore(String url, int page) {
        broadModel.loadBroadMore(url, page, new NetWorkCallBack<BroadListBean>() {
            @Override
            public void onSuccess(BroadListBean listBean) {
                broadview.showBroadLoadMore(listBean);
                //broadview.dimissProgress();
            }

            @Override
            public void onError(int errorCode, String errorMsg) {
                broadview.showMessage(errorMsg);
            }

            @Override
            public void onFail(String netOff) {

            }
        });
    }
}
