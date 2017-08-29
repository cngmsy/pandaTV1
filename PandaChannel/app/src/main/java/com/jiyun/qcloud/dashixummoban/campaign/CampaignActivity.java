package com.jiyun.qcloud.dashixummoban.campaign;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.base.BaseActivity;
import com.jiyun.qcloud.dashixummoban.campaign.adapter.CamAdapter;
import com.jiyun.qcloud.dashixummoban.campaign.bean.CampaignBean;
import com.jiyun.qcloud.dashixummoban.campaign.model.CamContract;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/8/28 0028.
 */

public class CampaignActivity extends BaseActivity implements CamContract.CamView {
    CamContract.Presenter presenter;
    @BindView(R.id.c_img)
    ImageView cImg;
    @BindView(R.id.c_title)
    TextView cTitle;
    @BindView(R.id.c_listview)
    ListView cListview;
    private ArrayList<CampaignBean.InteractiveBean> list;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_campaign;
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void dimissProgress() {

    }

    @Override
    public void showMessage(String msg) {

    }

    @Override
    public void setPresenter(CamContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showCamData(CampaignBean campaignBean) {
        list = new ArrayList<>();
        List<CampaignBean.InteractiveBean> interactive = campaignBean.getInteractive();
        for (CampaignBean.InteractiveBean camBean : interactive) {
            list.add(camBean);
        }
        CamAdapter adapter = new CamAdapter(this, list);
        cListview.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
