package com.example.administrator.pandababy.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.pandababy.app.App;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/8/23 0023.
 */

public abstract class BaseActivity extends AppCompatActivity {
    // 记录上一个显示的fragment
    private BaseFragment lastfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.context=this;
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        init();
    }

    @Override
    protected void onResume() {
        super.onResume();
        App.context=this;
    }

    protected abstract int getLayoutId();
    protected abstract void init();

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

