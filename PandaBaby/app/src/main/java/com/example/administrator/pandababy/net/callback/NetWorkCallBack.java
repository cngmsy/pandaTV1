package com.example.administrator.pandababy.net.callback;

/**
 * Created by Administrator on 2017/8/23 0023.
 */

public interface NetWorkCallBack<T> {
    void onSuccess(T t);
    void onError(int errorCode,String errorMsg);
}