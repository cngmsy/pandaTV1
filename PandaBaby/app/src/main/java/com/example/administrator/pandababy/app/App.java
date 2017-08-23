package com.example.administrator.pandababy.app;

import android.app.Application;

import com.example.administrator.pandababy.base.BaseActivity;

/**
 * Created by Administrator on 2017/8/23 0023.
 */

public class App extends Application {
    public static BaseActivity context = null;


    @Override
    public void onCreate() {
        super.onCreate();

    }
}
