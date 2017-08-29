package com.jiyun.qcloud.dashixummoban.ui.broadcast.model;

import com.jiyun.qcloud.dashixummoban.modle.dataModel.BaseModel;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.bean.BroadListBean;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.bean.PandaBroad;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public interface IPandaBroadModel extends BaseModel{
    void loadBroadList(NetWorkCallBack<PandaBroad> callback);
    void loadBroadBean(NetWorkCallBack<BroadListBean> callBack,String url);
    void loadBroadMore(String url,int page,NetWorkCallBack<BroadListBean> callBack);
}
