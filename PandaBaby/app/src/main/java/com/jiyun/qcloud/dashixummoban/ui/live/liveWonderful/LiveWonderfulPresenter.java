package com.jiyun.qcloud.dashixummoban.ui.live.liveWonderful;


import com.jiyun.qcloud.dashixummoban.entity.PandaWonderful;
import com.jiyun.qcloud.dashixummoban.modle.liveModel.IpandaWonderfulModel;
import com.jiyun.qcloud.dashixummoban.modle.liveModel.PandaWonderfullIMPl;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;

/**
 * Created by xingge on 2017/7/26.
 */

public class LiveWonderfulPresenter implements LiveWonderfulContract.Presenter{

    private LiveWonderfulContract.View liveWondView;
    private IpandaWonderfulModel liveWondModel;

    /*
       在构造方法里面做了什么事情;   初始化了HomeView  这时候的homeView相当于HomePageFragent
       同时在这个构造方法中有初始化了homeModel   HomeModel里面就是网络请求后从服务器返回的bean结果
     */
    public LiveWonderfulPresenter(LiveWonderfulContract.View liveWondView) {
        this.liveWondView = liveWondView;
        liveWondView.setPresenter(this);
        this.liveWondModel = new PandaWonderfullIMPl();
    }

    @Override
    public void start() {
        liveWondView.showProgress();
        liveWondModel.loadLiveList(new NetWorkCallBack<PandaWonderful>() {
            @Override
            public void onSuccess(PandaWonderful pandaWonderful) {
                liveWondView.showLiveListData(pandaWonderful);
                liveWondView.dimissProgress();
            }

            @Override
            public void onError(int errorCode, String errorMsg) {
                liveWondView.showMessage(errorMsg);
                liveWondView.dimissProgress();
            }

            @Override
            public void onFail(String netOff) {

            }
        });
    }
}
