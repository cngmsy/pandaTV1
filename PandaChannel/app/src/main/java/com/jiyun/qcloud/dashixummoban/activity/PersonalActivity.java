package com.jiyun.qcloud.dashixummoban.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.app.App;
import com.jiyun.qcloud.dashixummoban.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class PersonalActivity extends BaseActivity {
    @BindView(R.id.iconImg)
    ImageView iconImg;
    @BindView(R.id.titleTv)
    TextView titleTv;
    @BindView(R.id.p_login)
    LinearLayout pLogin;
    @BindView(R.id.p_history)
    LinearLayout pHistory;
    @BindView(R.id.p_collection)
    LinearLayout pCollection;
    @BindView(R.id.p_setting)
    LinearLayout pSetting;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_personal;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iconImg, R.id.p_login, R.id.p_history, R.id.p_collection, R.id.p_setting})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iconImg:
                finish();
                break;
            case R.id.p_login:
                Intent intent = new Intent(App.mBaseActivity,LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.p_history:
                Intent intent1 = new Intent(App.mBaseActivity,HistoryActivity.class);
                 startActivity(intent1);
                break;
            case R.id.p_collection:
                Intent intent2 = new Intent(App.mBaseActivity,CollectionActivity.class);
                startActivity(intent2);
                break;
            case R.id.p_setting:
                Intent intent3 = new Intent(App.mBaseActivity,SetActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
