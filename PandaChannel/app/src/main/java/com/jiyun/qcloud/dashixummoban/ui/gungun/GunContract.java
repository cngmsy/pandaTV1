package com.jiyun.qcloud.dashixummoban.ui.gungun;

import com.jiyun.qcloud.dashixummoban.base.IBasePresenter;
import com.jiyun.qcloud.dashixummoban.base.IBaseView;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.PandaGunBean;

/**
 * Created by Administrator on 2017/8/25 0025.
 */

public class GunContract {
    interface View extends IBaseView<Presenter> {
        void showGunListData(PandaGunBean gunBean);
        void playVideo();
        void loadWebView();
    }

    interface Presenter extends IBasePresenter {

    }
}
