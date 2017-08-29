package com.jiyun.qcloud.dashixummoban.campaign.model;

import com.jiyun.qcloud.dashixummoban.campaign.bean.CampaignBean;
import com.jiyun.qcloud.dashixummoban.config.Urls;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;

/**
 * Created by Administrator on 2017/8/29 0029.
 */

public class CamModelImpl implements CamModel{
    @Override
    public void loadCamList(NetWorkCallBack<CampaignBean> callback) {
        iHttp.get(Urls.MOVIE,null,callback);
    }
}
