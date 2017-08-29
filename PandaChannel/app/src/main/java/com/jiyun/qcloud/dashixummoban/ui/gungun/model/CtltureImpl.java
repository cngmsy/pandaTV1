package com.jiyun.qcloud.dashixummoban.ui.gungun.model;

import com.jiyun.qcloud.dashixummoban.config.Urls;
import com.jiyun.qcloud.dashixummoban.modle.net.HttpFactory;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.FileBean;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.SplendBean;

import java.util.Map;

/**
 * Created by Administrator on 2017/8/23.
 */

public class CtltureImpl implements IctltureModel {

    @Override
    public void getpin(Map<String, String> map, NetWorkCallBack<SplendBean> callBack) {
        HttpFactory.createOK().get(Urls.SPLENDURL,map,callBack);
    }

    public void getMo(Map<String, String> map, NetWorkCallBack<FileBean> callBack) {
        HttpFactory.createOK().get(Urls.MOVIE,map,callBack);
    }


}
