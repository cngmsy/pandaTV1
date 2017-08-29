package com.jiyun.qcloud.dashixummoban.manager;

import android.widget.Toast;

import com.jiyun.qcloud.dashixummoban.app.App;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class ToastManager {
    public static void showToast(String msg){
        Toast.makeText(App.mBaseActivity,msg,Toast.LENGTH_LONG).show();
    }
}
