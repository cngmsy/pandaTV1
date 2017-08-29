package com.jiyun.qcloud.dashixummoban.campaign.model;

import com.jiyun.qcloud.dashixummoban.campaign.bean.CampaignBean;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;

/**
 * Created by Administrator on 2017/8/29 0029.
 */

public class CamPresenter implements CamContract.Presenter{
    private CamContract.CamView camview;
    private CamModel camModel;

    public CamPresenter(CamContract.CamView camview) {
        this.camview = camview;
        camview.setPresenter(this);
        this.camModel = new CamModelImpl();
    }

    @Override
    public void start() {
        camview.showProgress();
        camModel.loadCamList(new NetWorkCallBack<CampaignBean>() {
            @Override
            public void onSuccess(CampaignBean campaignBean) {
                camview.showCamData(campaignBean);
                camview.dimissProgress();
            }

            @Override
            public void onError(int errorCode, String errorMsg) {
                camview.showMessage(errorMsg);
                camview.dimissProgress();
            }

            @Override
            public void onFail(String netOff) {

            }
        });

    }

    @Override
    public void second(String url) {

    }
}
