package com.jiyun.qcloud.dashixummoban.modle.liveModel;

import com.jiyun.qcloud.dashixummoban.entity.PandaWonderful;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;

/**
 * Created by 82年的笔记本 on 2017/8/24.
 */

public interface IpandaWonderfulModel {
    void loadLiveList(NetWorkCallBack<PandaWonderful> callback);
}
