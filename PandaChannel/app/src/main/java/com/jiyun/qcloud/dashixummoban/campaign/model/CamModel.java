package com.jiyun.qcloud.dashixummoban.campaign.model;

import com.jiyun.qcloud.dashixummoban.campaign.bean.CampaignBean;
import com.jiyun.qcloud.dashixummoban.modle.dataModel.BaseModel;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;

/**
 * Created by Administrator on 2017/8/29 0029.
 */

public interface CamModel extends BaseModel{
    void loadCamList(NetWorkCallBack<CampaignBean> callback);
}
