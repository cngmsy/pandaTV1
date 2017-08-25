package com.jiyun.qcloud.dashixummoban.ui.live.live;


import com.jiyun.qcloud.dashixummoban.entity.PandaLive;
import com.jiyun.qcloud.dashixummoban.modle.liveModel.IpandaLiveModel;
import com.jiyun.qcloud.dashixummoban.modle.liveModel.PandaLiveModelImpl;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;

/**
 * Created by xingge on 2017/7/26.
 */

public class LivePresenter implements LiveContract.Presenter {

    private LiveContract.View liveView;
    private IpandaLiveModel liveModel;

    /*
       在构造方法里面做了什么事情;   初始化了HomeView  这时候的homeView相当于HomePageFragent
       同时在这个构造方法中有初始化了homeModel   HomeModel里面就是网络请求后从服务器返回的bean结果
     */
    public LivePresenter(LiveContract.View liveView) {
        this.liveView = liveView;
        liveView.setPresenter(this);
        this.liveModel = new PandaLiveModelImpl();
    }

    @Override
    public void start() {
        liveView.showProgress();
        liveModel.loadLiveList(new NetWorkCallBack<PandaLive>() {
            @Override
            public void onSuccess(PandaLive pandaLive) {
                liveView.showLiveListData(pandaLive);
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
