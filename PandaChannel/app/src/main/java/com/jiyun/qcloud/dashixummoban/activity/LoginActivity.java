package com.jiyun.qcloud.dashixummoban.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.app.App;
import com.jiyun.qcloud.dashixummoban.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class LoginActivity extends BaseActivity {

    @BindView(R.id.iconImg)
    ImageView iconImg;
    @BindView(R.id.titleTv)
    TextView titleTv;
    @BindView(R.id.login_regist)
    TextView loginRegist;
    @BindView(R.id.login_weixin)
    LinearLayout loginWeixin;
    @BindView(R.id.login_qq)
    LinearLayout loginQq;
    @BindView(R.id.login_weibo)
    LinearLayout loginWeibo;
    @BindView(R.id.login_account)
    EditText loginAccount;
    @BindView(R.id.login_password)
    EditText loginPassword;
    @BindView(R.id.login_forget)
    TextView loginForget;
    @BindView(R.id.login_but)
    Button loginBut;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @OnClick({R.id.iconImg, R.id.login_regist, R.id.login_weixin, R.id.login_qq, R.id.login_weibo, R.id.login_account, R.id.login_password, R.id.login_forget, R.id.login_but})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iconImg:
                finish();
                break;
            case R.id.login_regist:
                Intent intent = new Intent(App.mBaseActivity,RegistActivity.class);
                startActivity(intent);
                break;
            case R.id.login_weixin:
                break;
            case R.id.login_qq:
                break;
            case R.id.login_weibo:
                break;
            case R.id.login_account:
                break;
            case R.id.login_password:
                break;
            case R.id.login_forget:
                Intent intent1 = new Intent(App.mBaseActivity,ForgetActivity.class);
                startActivity(intent1);
                break;
            case R.id.login_but:
                break;
        }
    }

}
