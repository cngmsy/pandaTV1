package com.jiyun.qcloud.dashixummoban.ui.gungun.model;

import com.jiyun.qcloud.dashixummoban.base.IBasePresenter;
import com.jiyun.qcloud.dashixummoban.base.IBaseView;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.FileBean;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.SplendBean;

import java.util.Map;

/**
 * Created by Administrator on 2017/8/27.
 */

public interface XiangContract {
    interface TopView extends IBaseView<XiangPresenter>{
        void getResult(SplendBean splendBean);
        void getFail(FileBean fileBean);
    }
    interface XiangPresenter extends IBasePresenter{
            void mapData(Map<String, String> map);
        void mapFail(Map<String, String> map);
    }

}
