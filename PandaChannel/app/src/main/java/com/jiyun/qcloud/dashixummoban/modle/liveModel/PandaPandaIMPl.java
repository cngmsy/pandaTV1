package com.jiyun.qcloud.dashixummoban.modle.liveModel;

import com.jiyun.qcloud.dashixummoban.config.Urls;
import com.jiyun.qcloud.dashixummoban.entity.PandaWonderful;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;

import static com.jiyun.qcloud.dashixummoban.modle.baseModel.BaseModel.iHttp;

/**
 * Created by 82年的笔记本 on 2017/8/24.
 */

public class PandaPandaIMPl implements IpandaWonderfulModel {
    @Override
    public void loadLiveList(NetWorkCallBack<PandaWonderful> callback) {
        iHttp.get(Urls.PANDA, null, callback);
    }
}
