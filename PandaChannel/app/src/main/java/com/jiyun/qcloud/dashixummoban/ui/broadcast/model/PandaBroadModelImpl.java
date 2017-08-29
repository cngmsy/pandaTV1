package com.jiyun.qcloud.dashixummoban.ui.broadcast.model;

import com.jiyun.qcloud.dashixummoban.config.Urls;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.bean.BroadListBean;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.bean.PandaBroad;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class PandaBroadModelImpl implements IPandaBroadModel{
    @Override
    public void loadBroadList(NetWorkCallBack<PandaBroad> callback) {
        iHttp.get(Urls.BROAD,null,callback);
    }

    @Override
    public void loadBroadBean(NetWorkCallBack<BroadListBean> callBack, String url) {
        iHttp.get(url,null,callBack);
    }

    @Override
    public void loadBroadMore(String url, int page, NetWorkCallBack<BroadListBean> callBack) {
        iHttp.get(url+"&pageSize=6&page="+page,null,callBack);
    }

}
