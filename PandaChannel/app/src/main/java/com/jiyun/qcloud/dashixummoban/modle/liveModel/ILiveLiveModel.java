package com.jiyun.qcloud.dashixummoban.modle.liveModel;

import com.jiyun.qcloud.dashixummoban.entity.LiveLive;
import com.jiyun.qcloud.dashixummoban.modle.baseModel.BaseModel;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;

/**
 * Created by 82年的笔记本 on 2017/8/26.
 */

public interface ILiveLiveModel extends BaseModel{
    void loadLiveList(NetWorkCallBack<LiveLive> callback);
}
