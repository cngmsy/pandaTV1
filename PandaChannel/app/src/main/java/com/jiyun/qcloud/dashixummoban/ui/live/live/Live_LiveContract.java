package com.jiyun.qcloud.dashixummoban.ui.live.live;

import com.jiyun.qcloud.dashixummoban.base.IBasePresenter;
import com.jiyun.qcloud.dashixummoban.base.IBaseView;
import com.jiyun.qcloud.dashixummoban.entity.LiveLive;

/**
 * Created by chj on 2017/8/21.
 * 这是难点
 */

public class Live_LiveContract {

  public   interface View extends IBaseView<Presenter> {
        void showLiveListData(LiveLive liveLive);
        void playVideo();
        void loadWebView();
    }

 public   interface Presenter extends IBasePresenter {}
}
