package com.jiyun.qcloud.dashixummoban.ui.live.liveWonderful;

import com.jiyun.qcloud.dashixummoban.base.IBasePresenter;
import com.jiyun.qcloud.dashixummoban.base.IBaseView;
import com.jiyun.qcloud.dashixummoban.entity.PandaWonderful;

/**
 * Created by chj on 2017/8/21.
 * 这是难点
 */

public class LiveWonderfulContract {

   public interface View extends IBaseView<Presenter> {
        void showLiveListData(PandaWonderful pandaWonderful);
        void playVideo();
        void loadWebView();
    }

  public   interface Presenter extends IBasePresenter {

  }
}
