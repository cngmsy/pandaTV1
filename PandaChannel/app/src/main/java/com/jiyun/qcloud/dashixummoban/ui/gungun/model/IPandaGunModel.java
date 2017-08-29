package com.jiyun.qcloud.dashixummoban.ui.gungun.model;

import com.jiyun.qcloud.dashixummoban.modle.dataModel.BaseModel;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.PandaGunBean;

/**
 * Created by Administrator on 2017/8/25 0025.
 */

public interface IPandaGunModel extends BaseModel{
    void loadGunList(NetWorkCallBack<PandaGunBean> callback);
}
