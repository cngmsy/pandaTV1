package com.jiyun.qcloud.dashixummoban.ui.broadcast;

import com.jiyun.qcloud.dashixummoban.base.IBasePresenter;
import com.jiyun.qcloud.dashixummoban.base.IBaseView;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.bean.BroadListBean;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.bean.PandaBroad;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class BroadContract {
    interface View extends IBaseView<Presenter> {
        void showBroadListData(PandaBroad pandaBroad);
        void showBroadListBean(BroadListBean listBean);
        void showBroadLoadMore(BroadListBean listBean);
        void playVideo();
        void loadWebView();
    }

    interface Presenter extends IBasePresenter {
        void loadmore(String url, int page);
    }
}
