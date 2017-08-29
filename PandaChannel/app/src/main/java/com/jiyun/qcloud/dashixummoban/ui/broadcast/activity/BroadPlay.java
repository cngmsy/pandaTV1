package com.jiyun.qcloud.dashixummoban.ui.broadcast.activity;

import android.os.Bundle;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.base.BaseActivity;

import butterknife.BindView;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

/**
 * Created by Administrator on 2017/8/25 0025.
 */

public class BroadPlay extends BaseActivity {

    @BindView(R.id.broad_player)
    JCVideoPlayer broadPlayer;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        broadPlayer.setUp("http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/026839787dfb4eb597e724e835b44782_h264418000nero_aac32.mp4", "华盛顿明星大熊猫“贝贝”迎2岁生日");
    }

    @Override
    protected void onPause() {
        super.onPause();
        broadPlayer.releaseAllVideos();
    }


    @Override
    protected int getLayoutId() {
        return R.layout.broadplay;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
