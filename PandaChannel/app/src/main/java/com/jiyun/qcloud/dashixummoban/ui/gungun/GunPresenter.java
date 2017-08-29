package com.jiyun.qcloud.dashixummoban.ui.gungun;

import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.PandaGunBean;
import com.jiyun.qcloud.dashixummoban.ui.gungun.model.IPandaGunModel;
import com.jiyun.qcloud.dashixummoban.ui.gungun.model.IPandaGunModelImpl;

/**
 * Created by Administrator on 2017/8/25 0025.
 */

public class GunPresenter implements GunContract.Presenter{
    private GunContract.View gunview;
    private IPandaGunModel gunModel;

    public GunPresenter(GunContract.View gunview) {
        this.gunview = gunview;
       gunview.setPresenter(this);
        this.gunModel = new IPandaGunModelImpl();
    }


    @Override
    public void start() {
        gunview.showProgress();
        gunModel.loadGunList(new NetWorkCallBack<PandaGunBean>() {
            @Override
            public void onSuccess(PandaGunBean gunBean) {
                gunview.showGunListData(gunBean);
                gunview.dimissProgress();
            }

            @Override
            public void onError(int errorCode, String errorMsg) {
                gunview.showMessage(errorMsg);
                gunview.dimissProgress();
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
