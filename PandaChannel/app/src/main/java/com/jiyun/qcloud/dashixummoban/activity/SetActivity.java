package com.jiyun.qcloud.dashixummoban.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.CheckBox;
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

public class SetActivity extends BaseActivity {
    @BindView(R.id.setimg)
    ImageView setimg;
    @BindView(R.id.setting_message)
    CheckBox settingMessage;
    @BindView(R.id.setting_player)
    CheckBox settingPlayer;
    @BindView(R.id.setting_clear)
    LinearLayout settingClear;
    @BindView(R.id.setting_feedback)
    LinearLayout settingFeedback;
    @BindView(R.id.setting_upgrade)
    LinearLayout settingUpgrade;
    @BindView(R.id.setting_Praise)
    LinearLayout settingPraise;
    @BindView(R.id.setting_about)
    LinearLayout settingAbout;
    @BindView(R.id.set_reset)
    TextView setReset;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_set;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.setimg, R.id.setting_message, R.id.setting_player, R.id.setting_clear, R.id.setting_feedback, R.id.setting_upgrade, R.id.setting_Praise, R.id.setting_about})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.setimg:
                finish();
                break;
            case R.id.setting_message:
                break;
            case R.id.setting_player:
                break;
            case R.id.setting_clear:
                final AlertDialog.Builder builder = new AlertDialog.Builder(App.mBaseActivity);
                builder.setMessage("确认清除缓存吗?");

                builder.setNegativeButton("取消",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();

                            }
                        });
                builder.setPositiveButton("确定",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                setReset.setText("0.00MB");

                            }
                        });
                // 显示
                builder.show();
                break;
            case R.id.setting_feedback:
                break;
            case R.id.setting_upgrade:
                break;
            case R.id.setting_Praise:
                break;
            case R.id.setting_about:
                Intent intent = new Intent(App.mBaseActivity, AboutActivity.class);
                startActivity(intent);
                break;
        }
    }
}
