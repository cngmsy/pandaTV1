package com.jiyun.qcloud.dashixummoban.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.regist_fragment.adapter.FragmentAdapter;
import com.jiyun.qcloud.dashixummoban.base.BaseActivity;
import com.jiyun.qcloud.dashixummoban.regist_fragment.OfficeFragment;
import com.jiyun.qcloud.dashixummoban.regist_fragment.PhoneFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.jiyun.qcloud.dashixummoban.R.id.regist_tablayout;
import static com.jiyun.qcloud.dashixummoban.R.id.regist_viewpage;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class RegistActivity extends BaseActivity {
    @BindView(R.id.iconImg)
    ImageView iconImg;
    @BindView(R.id.titleTv)
    TextView titleTv;
    @BindView(regist_tablayout)
    TabLayout registTablayout;
    @BindView(regist_viewpage)
    ViewPager registViewpage;

    @Override
    protected void initData() {
        ArrayList<Fragment> list = new ArrayList<Fragment>();
        PhoneFragment phoneFragment = new PhoneFragment();
        OfficeFragment officeFragment = new OfficeFragment();
        list.add(phoneFragment);
        list.add(officeFragment);

        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(),list);

        registViewpage.setAdapter(adapter);

        registTablayout.setupWithViewPager(registViewpage);
        registTablayout.setTabMode(TabLayout.MODE_FIXED);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_regist;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iconImg, regist_tablayout, regist_viewpage})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iconImg:
                finish();
                break;
            case regist_tablayout:
                break;
            case regist_viewpage:
                break;
        }
    }
}
