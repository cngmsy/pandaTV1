package com.jiyun.qcloud.dashixummoban.campaign.model;

import com.jiyun.qcloud.dashixummoban.base.IBasePresenter;
import com.jiyun.qcloud.dashixummoban.base.IBaseView;
import com.jiyun.qcloud.dashixummoban.campaign.bean.CampaignBean;

/**
 * Created by Administrator on 2017/8/28 0028.
 */

public interface CamContract {
    interface CamView extends IBaseView<Presenter> {
        void showCamData(CampaignBean campaignBean);

    }

    interface Presenter extends IBasePresenter {

    }
}
