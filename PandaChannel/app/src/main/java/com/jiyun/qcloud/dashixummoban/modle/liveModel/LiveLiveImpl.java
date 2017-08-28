package com.jiyun.qcloud.dashixummoban.modle.liveModel;

import com.jiyun.qcloud.dashixummoban.config.Urls;
import com.jiyun.qcloud.dashixummoban.entity.LiveLive;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;

/**
 * Created by 82年的笔记本 on 2017/8/26.
 */

public class LiveLiveImpl implements ILiveLiveModel {
    @Override
    public void loadLiveList(NetWorkCallBack<LiveLive> callback) {
        iHttp.get(Urls.PANDALIVE, null, callback);
    }
}
