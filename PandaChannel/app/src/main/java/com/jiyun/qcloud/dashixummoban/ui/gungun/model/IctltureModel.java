package com.jiyun.qcloud.dashixummoban.ui.gungun.model;

import com.jiyun.qcloud.dashixummoban.modle.dataModel.BaseModel;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.FileBean;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.SplendBean;

import java.util.Map;

/**
 * Created by Administrator on 2017/8/23.
 */

public interface IctltureModel extends BaseModel {

    void getpin(Map<String, String> map, NetWorkCallBack<SplendBean> callBack);
    void getMo(Map<String, String> map, NetWorkCallBack<FileBean> callBack);
}
