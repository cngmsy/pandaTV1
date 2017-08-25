package com.jiyun.qcloud.dashixummoban.ui.live.activity;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.base.BaseActivity;
import com.jiyun.qcloud.dashixummoban.entity.PandaWonderful;

/**
 * Created by 82年的笔记本 on 2017/8/24.
 */

public class VideoActivity extends BaseActivity  {


    private PandaWonderful.VideoBean videoBean;

    @Override
    protected void initData() {
        videoBean = (PandaWonderful.VideoBean) getIntent().getSerializableExtra("video");
        

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_live_video;
    }

}
