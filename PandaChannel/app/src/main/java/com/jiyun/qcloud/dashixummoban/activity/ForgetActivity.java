package com.jiyun.qcloud.dashixummoban.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class ForgetActivity extends BaseActivity {
    @BindView(R.id.fogetimg)
    ImageView fogetimg;
    @BindView(R.id.titleTv)
    TextView titleTv;
    @BindView(R.id.forget_mailbox)
    EditText forgetMailbox;
    @BindView(R.id.mailbox_null)
    TextView mailboxNull;
    @BindView(R.id.forget_proving)
    EditText forgetProving;
    @BindView(R.id.forget_letter)
    ImageView forgetLetter;
    @BindView(R.id.letter_null)
    TextView letterNull;
    @BindView(R.id.forget_validate)
    EditText forgetValidate;
    @BindView(R.id.forget_obtain)
    Button forgetObtain;
    @BindView(R.id.obtain_null)
    TextView obtainNull;
    @BindView(R.id.forget_confirm)
    EditText forgetConfirm;
    @BindView(R.id.confirm_null)
    TextView confirmNull;
    @BindView(R.id.forget_regist)
    Button forgetRegist;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_forget;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.fogetimg, R.id.titleTv, R.id.forget_mailbox, R.id.mailbox_null, R.id.forget_proving, R.id.forget_letter, R.id.letter_null, R.id.forget_validate, R.id.forget_obtain, R.id.obtain_null, R.id.forget_confirm, R.id.confirm_null, R.id.forget_regist})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fogetimg:
                finish();
                break;
            case R.id.titleTv:
                break;
            case R.id.forget_mailbox:
                break;
            case R.id.mailbox_null:
                break;
            case R.id.forget_proving:
                break;
            case R.id.forget_letter:
                break;
            case R.id.letter_null:
                break;
            case R.id.forget_validate:
                break;
            case R.id.forget_obtain:
                break;
            case R.id.obtain_null:
                break;
            case R.id.forget_confirm:
                break;
            case R.id.confirm_null:
                break;
            case R.id.forget_regist:
                break;
        }
    }
}
