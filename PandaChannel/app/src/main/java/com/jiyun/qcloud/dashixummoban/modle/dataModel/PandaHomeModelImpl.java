package com.jiyun.qcloud.dashixummoban.modle.dataModel;


import com.jiyun.qcloud.dashixummoban.config.Urls;
import com.jiyun.qcloud.dashixummoban.entity.PandaHome;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;
import com.jiyun.qcloud.dashixummoban.ui.home.entity.InToCctvBean;
import com.jiyun.qcloud.dashixummoban.ui.home.entity.InToGunGunBean;

/**
 * Created by xingge on 2017/7/26.
 */

public class PandaHomeModelImpl implements IPandaHomeModel {



    @Override
    public void loadHomeList(NetWorkCallBack<PandaHome> callback) {
        iHttp.get(Urls.PANDAHOME,null,callback);
    }
    @Override
    public void loadCctvList(NetWorkCallBack<InToCctvBean> callback) {
        iHttp.get(Urls.CCTVLIST,null,callback);
    }

    @Override
    public void loadGunGunList(NetWorkCallBack<InToGunGunBean> callBack) {
        iHttp.get(Urls.GUNGUN,null,callBack);
    }
}
