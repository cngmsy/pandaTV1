package com.jiyun.qcloud.dashixummoban.ui.live.activity;

import android.content.pm.ActivityInfo;
import android.os.Build;
import android.util.Log;
import android.view.View;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.base.BaseActivity;
import com.jiyun.qcloud.dashixummoban.config.Urls;
import com.jiyun.qcloud.dashixummoban.entity.PandaWonderful;
import com.jiyun.qcloud.dashixummoban.entity.Video;
import com.jiyun.qcloud.dashixummoban.modle.net.OkBaseHttpImpl;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;

import butterknife.BindView;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;


/**
 * Created by 82年的笔记本 on 2017/8/24.
 */

public class VideoActivity extends BaseActivity {


    @BindView(R.id.jcplayer)
    JCVideoPlayer mJcplayer;
    private PandaWonderful.VideoBean videoBean;

    @Override
    protected void initData() {
        videoBean = (PandaWonderful.VideoBean) getIntent().getSerializableExtra("video");
        final String vid = videoBean.getVid();
        String s = Urls.URLK + vid;
        OkBaseHttpImpl.getInstance().get(s, null, new NetWorkCallBack<Video>() {
            @Override
            public void onSuccess(Video video) {
                Log.e("TAG111111111",video.getVideo().getChapters().get(0).getUrl());
                mJcplayer.setUp(video.getVideo().getChapters().get(0).getUrl(), video.getTitle());
            }

            @Override
            public void onError(int errorCode, String errorMsg) {

            }

            @Override
            public void onFail(String netOff) {

            }
        });

    }

    @Override
    protected void initView() {

    }
    @Override
    protected void onResume() {
        /**
         * 设置为横屏
         */
        if (getRequestedOrientation() != ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }

        super.onResume();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_live_video;
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus && Build.VERSION.SDK_INT >= 19) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }

    }
}
