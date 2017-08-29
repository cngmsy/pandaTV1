package com.jiyun.qcloud.dashixummoban.ui.gungun.activity;

import android.content.res.Configuration;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.WindowManager;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.base.BaseActivity;

import butterknife.BindView;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;


/**
 * Created by Administrator on 2017/8/28 0028.
 */

public class GunVideo extends BaseActivity {

    @BindView(R.id.gun_player)
    JCVideoPlayer gunPlayer;
    private int k;
    //手势
    private GestureDetector gestureDetector;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        gunPlayer.setUp("http://vod.cntv.lxdns.com/flash/mp4video61/TMS/2017/08/25/026839787dfb4eb597e724e835b44782_h264418000nero_aac32.mp4", "《当熊不让》 20170825 第二十四期：大熊猫生日扎堆是什么体验？");
        //据说并不好用，需要和onTouchEvent配合使用
        setGestureDetector();
    }

    //触摸（触摸事件）
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        return gestureDetector.onTouchEvent(event);
    }

    //手势方法
    public void setGestureDetector() {
        gestureDetector = new GestureDetector(
                new GestureDetector.OnGestureListener() {
                    @Override
                    public boolean onDown(MotionEvent e) {
                        return false;
                    }

                    @Override
                    public void onShowPress(MotionEvent e) {

                    }

                    @Override
                    public boolean onSingleTapUp(MotionEvent e) {
                        return false;
                    }
//滚动MotionEvent  e1 1.手势起点事件
// MotionEvent e2 2.手势终点
//distanceX 3.x轴方向上移动的速度/每秒
// distanceY 4.Y轴方向上移动的速度/每秒

                    @Override
                    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                        if (e1.getY() - e2.getY() > 0.5 && Math.abs(distanceY) > 0.5) {
                            if (e1.getX() > 100) {
                                setLightness(30);
                            } else {
                                setAudio(1);
                            }
                        }
                        if (e1.getY() - e2.getY() < 0.5 && Math.abs(distanceY) > 0.5) {
                            Log.d("==g==", e1.getY() + "");
                            if (e1.getX() > 100) {
                                setLightness(-30);
                            } else {
                                setAudio(-1);
                            }
                        }
                        return true;
                    }

                    @Override
                    public void onLongPress(MotionEvent e) {

                    }

                    //抛的动作
                    @Override
                    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                        return false;
                    }
                }
        );
    }

    //物理键按下
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

    //物理键抬起
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        return super.onKeyUp(keyCode, event);
    }

    //轨迹球
    @Override
    public boolean onTrackballEvent(MotionEvent event) {
        return super.onTrackballEvent(event);
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        Log.d("==d==", "" + newConfig.orientation);
    }

    //改变屏幕亮度
    public void setLightness(float lightness) {
        WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
        //屏幕的亮度,最大是255
        layoutParams.screenBrightness = layoutParams.screenBrightness + lightness / 255f;
        if (layoutParams.screenBrightness > 1) {
            layoutParams.screenBrightness = 1;
        } else if (layoutParams.screenBrightness < 0.2) {
            layoutParams.screenBrightness = 0.2f;
        }
        getWindow().setAttributes(layoutParams);
    }

    //加减音量
    public void setAudio(int volume) {
        AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        //当前音量
        k = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        //最大音量
        int max = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        Log.d("==d==", "" + max);
        Log.d("==d==", "" + k);
        k = k + volume;
        if (k >= 0 && k <= max) {
            audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, k, AudioManager.FLAG_PLAY_SOUND);
        } else {
            return;
        }


        //audioManager.adjustVolume(i+volume,AudioManager.FLAG_PLAY_SOUND);

    }
    @Override
    protected void onPause() {
        super.onPause();
        gunPlayer.releaseAllVideos();
    }


    @Override
    protected int getLayoutId() {
        return R.layout.gun_video;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
