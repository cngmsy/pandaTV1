package com.jiyun.qcloud.dashixummoban.modle.liveModel;

import com.jiyun.qcloud.dashixummoban.entity.PandaLive;
import com.jiyun.qcloud.dashixummoban.modle.baseModel.BaseModel;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;

/**
 * Created by 82年的笔记本 on 2017/8/24.
 */

public interface IpandaLiveModel extends BaseModel {
    void loadLiveList(NetWorkCallBack<PandaLive> callback);
}
