package com.jiyun.qcloud.dashixummoban.regist_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class PhoneFragment extends BaseFragment {
    @BindView(R.id.phone_account)
    EditText phoneAccount;
    @BindView(R.id.phone_null)
    TextView phoneNull;
    @BindView(R.id.phone_proving)
    EditText phoneProving;
    @BindView(R.id.phone_letter)
    ImageView phoneLetter;
    @BindView(R.id.proving_null)
    TextView provingNull;
    @BindView(R.id.phone_validate)
    EditText phoneValidate;
    @BindView(R.id.phone_obtain)
    Button phoneObtain;
    @BindView(R.id.obtain_null)
    TextView obtainNull;
    @BindView(R.id.phone_psd)
    EditText phonePsd;
    @BindView(R.id.psd_null)
    TextView psdNull;
    @BindView(R.id.phone_checkbox)
    CheckBox phoneCheckbox;
    @BindView(R.id.phone_regist)
    Button phoneRegist;
    Unbinder unbinder;

    @Override
    protected int getLayoutRes() {
        return R.layout.phone_fragment;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView(View view) {

    }

    @Override
    public void setBundle(Bundle bundle) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.phone_account, R.id.phone_null, R.id.phone_proving, R.id.phone_letter, R.id.proving_null, R.id.phone_validate, R.id.phone_obtain, R.id.obtain_null})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.phone_account:
                break;
            case R.id.phone_null:
                break;
            case R.id.phone_proving:
                break;
            case R.id.phone_letter:
                break;
            case R.id.proving_null:
                break;
            case R.id.phone_validate:
                break;
            case R.id.phone_obtain:
                break;
            case R.id.obtain_null:
                break;
        }
    }
}
