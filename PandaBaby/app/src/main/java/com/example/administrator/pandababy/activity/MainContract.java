package com.example.administrator.pandababy.activity;

import com.example.administrator.pandababy.base.BasePresenter;
import com.example.administrator.pandababy.base.BaseView;
import com.example.administrator.pandababy.model.UpDate;

/**
 * Created by Administrator on 2017/8/23 0023.
 */

public interface MainContract {
    interface View extends BaseView<Presenter> {
        void setResult(UpDate upDate);
    }

    interface Presenter extends BasePresenter {

    }
}