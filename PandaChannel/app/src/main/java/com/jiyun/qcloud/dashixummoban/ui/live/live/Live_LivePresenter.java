package com.jiyun.qcloud.dashixummoban.ui.live.live;


import com.jiyun.qcloud.dashixummoban.entity.LiveLive;
import com.jiyun.qcloud.dashixummoban.modle.liveModel.ILiveLiveModel;
import com.jiyun.qcloud.dashixummoban.modle.liveModel.LiveLiveImpl;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;

/**
 * Created by xingge on 2017/7/26.
 */

public class Live_LivePresenter implements Live_LiveContract.Presenter {

    private Live_LiveContract.View liveView;
    private ILiveLiveModel liveModel;

    /*
       在构造方法里面做了什么事情;   初始化了HomeView  这时候的homeView相当于HomePageFragent
       同时在这个构造方法中有初始化了homeModel   HomeModel里面就是网络请求后从服务器返回的bean结果
     */
    public Live_LivePresenter(Live_LiveContract.View liveView) {
        this.liveView = liveView;
        liveView.setPresenter(this);
        this.liveModel = new LiveLiveImpl();
    }

    @Override
    public void start() {
        liveView.showProgress();
        liveModel.loadLiveList(new NetWorkCallBack<LiveLive>() {
            @Override
            public void onSuccess(LiveLive liveLive) {
                liveView.showLiveListData(liveLive);
                liveView.dimissProgress();
            }

            @Override
            public void onError(int errorCode, String errorMsg) {
                liveView.showMessage(errorMsg);
                liveView.dimissProgress();
            }

            @Override
            public void onFail(String netOff) {

            }
        });
    }
}
