package com.jiyun.qcloud.dashixummoban.ui.gungun.model;

import com.jiyun.qcloud.dashixummoban.config.Urls;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.PandaGunBean;

/**
 * Created by Administrator on 2017/8/25 0025.
 */

public class IPandaGunModelImpl implements IPandaGunModel{
    @Override
    public void loadGunList(NetWorkCallBack<PandaGunBean> callback) {
        iHttp.get(Urls.GUNGUN,null,callback);
    }
}
