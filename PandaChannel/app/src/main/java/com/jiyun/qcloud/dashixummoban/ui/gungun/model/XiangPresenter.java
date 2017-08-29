package com.jiyun.qcloud.dashixummoban.ui.gungun.model;

import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.FileBean;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.SplendBean;

import java.util.Map;

/**
 * Created by Administrator on 2017/8/27.
 */

public class XiangPresenter implements XiangContract.XiangPresenter {
    private XiangContract.TopView xiangeview;
    private CtltureImpl ctltureModel;

    public XiangPresenter(XiangContract.TopView xiangeview) {
        this.xiangeview = xiangeview;
        xiangeview.setPresenter(this);
        ctltureModel = new CtltureImpl();
    }

    @Override
    public void mapFail(Map<String, String> map) {
        ctltureModel.getMo(map, new NetWorkCallBack<FileBean>() {
            @Override
            public void onSuccess(FileBean fileBean) {
                xiangeview.getFail(fileBean);
            }

            @Override
            public void onError(int errorCode, String errorMsg) {

            }

            @Override
            public void onFail(String netOff) {

            }
        });
    }

    @Override
    public void mapData(Map<String, String> map) {
        ctltureModel.getpin(map, new NetWorkCallBack<SplendBean>() {
            @Override
            public void onSuccess(SplendBean splendBean) {
                xiangeview.getResult(splendBean);
            }

            @Override
            public void onError(int errorCode, String errorMsg) {

            }

            @Override
            public void onFail(String netOff) {

            }
        });

    }

    @Override
    public void start() {

    }

    @Override
    public void second(String url) {

    }
}
