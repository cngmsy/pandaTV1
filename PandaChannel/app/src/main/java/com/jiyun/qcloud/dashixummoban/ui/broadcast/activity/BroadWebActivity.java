package com.jiyun.qcloud.dashixummoban.ui.broadcast.activity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.app.App;
import com.jiyun.qcloud.dashixummoban.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/8/25 0025.
 */

public class BroadWebActivity extends BaseActivity {

    @BindView(R.id.broad_collect)
    ImageView broadCollect;
    @BindView(R.id.broad_share)
    ImageView broadShare;
    boolean flags = false;
    @BindView(R.id.broad_webview)
    WebView broadWebview;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_broad_web;
    }

    @Override
    protected void initData() {
        WebSettings webSettings = broadWebview.getSettings();
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setUseWideViewPort(true);//设置webview推荐使用的窗口
        webSettings.setLoadWithOverviewMode(true);//设置webview加载的页面的模式
        webSettings.setDisplayZoomControls(false);//隐藏webview缩放按钮
        webSettings.setJavaScriptEnabled(true); // 设置支持javascript脚本
        webSettings.setAllowFileAccess(true); // 允许访问文件
        webSettings.setBuiltInZoomControls(true); // 设置显示缩放按钮
        webSettings.setSupportZoom(true); // 支持缩放

        //主要用于平板，针对特定屏幕代码调整分辨率
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int mDensity = metrics.densityDpi;
        if (mDensity == 240) {
            webSettings.setDefaultZoom(WebSettings.ZoomDensity.FAR);
        } else if (mDensity == 160) {
            webSettings.setDefaultZoom(WebSettings.ZoomDensity.MEDIUM);
        } else if (mDensity == 120) {
            webSettings.setDefaultZoom(WebSettings.ZoomDensity.CLOSE);
        } else if (mDensity == DisplayMetrics.DENSITY_XHIGH) {
            webSettings.setDefaultZoom(WebSettings.ZoomDensity.FAR);
        } else if (mDensity == DisplayMetrics.DENSITY_TV) {
            webSettings.setDefaultZoom(WebSettings.ZoomDensity.FAR);
        } else {
            webSettings.setDefaultZoom(WebSettings.ZoomDensity.MEDIUM);
        }
        //1、LayoutAlgorithm.NARROW_COLUMNS ：适应内容大小
        //2、LayoutAlgorithm.SINGLE_COLUMN:适应屏幕，内容将自动缩放

        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);


        String bean = getIntent().getStringExtra("bean");
        broadWebview.loadUrl(bean);
        broadWebview.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });

    }

    @Override
    protected void initView() {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.broad_collect, R.id.broad_share})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.broad_collect:
                if (flags) {
                    broadCollect.setImageResource(R.drawable.collect_no);
                    Toast.makeText(App.mBaseActivity, "取消收藏", Toast.LENGTH_SHORT).show();
                    flags = false;
                } else {
                    flags = true;
                    broadCollect.setImageResource(R.drawable.collect_yes);
                    Toast.makeText(App.mBaseActivity, "收藏成功", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.broad_share:
                break;
        }
    }
}
