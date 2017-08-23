package com.example.administrator.pandababy.base;

/**
 * Created by Administrator on 2017/8/23 0023.
 */

public interface BaseView<T> {
    void showProgress();
    void dimissProgress();
    void showMessage(String msg);
    void setPresenter(T t);
}
