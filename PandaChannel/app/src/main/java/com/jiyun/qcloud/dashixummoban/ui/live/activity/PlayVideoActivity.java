package com.jiyun.qcloud.dashixummoban.ui.live.activity;

import android.content.pm.ActivityInfo;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by 82年的笔记本 on 2017/8/28.
 */

public class PlayVideoActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.line1)
    LinearLayout line1;
    @BindView(R.id.line2)
    LinearLayout line2;
    @BindView(R.id.back)
    ImageView back;
    @BindView(R.id.tit)
    TextView title;
    @BindView(R.id.video)
    VideoView video;
    @BindView(R.id.start)
    ImageView start;
    @BindView(R.id.start_seek)
    SeekBar start_seek;
    @BindView(R.id.clarity)
    Button clarity;
    @BindView(R.id.sound)
    ImageView sound;
    @BindView(R.id.sound_seek)
    SeekBar sound_seek;


    @Override
    protected void initData() {

    }



    @Override
    protected void initView() {
        video.setVisibility(View.VISIBLE);
        video.setVideoPath("http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/026839787dfb4eb597e724e835b44782_h264418000nero_aac32.mp4");
        video.requestFocus();
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!video.isPlaying()){
                    video.start();
                    start.setImageResource(R.mipmap.stop);
                }else {
                    video.stopPlayback();
                    start.setImageResource(R.mipmap.start);
                }

            }
        });


    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_play;

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

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
        }
    }
}
