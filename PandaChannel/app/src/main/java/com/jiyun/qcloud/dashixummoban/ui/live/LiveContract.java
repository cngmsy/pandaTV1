package com.jiyun.qcloud.dashixummoban.ui.live;

import com.jiyun.qcloud.dashixummoban.base.IBasePresenter;
import com.jiyun.qcloud.dashixummoban.base.IBaseView;
import com.jiyun.qcloud.dashixummoban.entity.PandaLive;

/**
 * Created by chj on 2017/8/21.
 * 这是难点
 */

public class LiveContract {

  public   interface View extends IBaseView<Presenter> {
        void showLiveListData(PandaLive pandaLive);
        void playVideo();
        void loadWebView();
    }

 public   interface Presenter extends IBasePresenter {}
}
