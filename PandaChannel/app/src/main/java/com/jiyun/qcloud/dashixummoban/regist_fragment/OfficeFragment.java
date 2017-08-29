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

public class OfficeFragment extends BaseFragment {
    @BindView(R.id.office_mailbox)
    EditText officeMailbox;
    @BindView(R.id.mailbox_null)
    TextView mailboxNull;
    @BindView(R.id.office_psd)
    EditText officePsd;
    @BindView(R.id.password_null)
    TextView passwordNull;
    @BindView(R.id.office_confirm)
    EditText officeConfirm;
    @BindView(R.id.confirm_null)
    TextView confirmNull;
    @BindView(R.id.office_proving)
    EditText officeProving;
    @BindView(R.id.office_letter)
    ImageView officeLetter;
    @BindView(R.id.office_checkbox)
    CheckBox officeCheckbox;
    @BindView(R.id.office_regist)
    Button officeRegist;
    Unbinder unbinder;

    @Override
    protected int getLayoutRes() {
        return R.layout.office_fragment;
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

    @OnClick({R.id.office_mailbox, R.id.mailbox_null, R.id.office_psd, R.id.password_null, R.id.office_confirm, R.id.confirm_null, R.id.office_proving, R.id.office_letter, R.id.office_checkbox, R.id.office_regist})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.office_mailbox:
                break;
            case R.id.mailbox_null:
                break;
            case R.id.office_psd:
                break;
            case R.id.password_null:
                break;
            case R.id.office_confirm:
                break;
            case R.id.confirm_null:
                break;
            case R.id.office_proving:
                break;
            case R.id.office_letter:
                break;
            case R.id.office_checkbox:
                break;
            case R.id.office_regist:
                break;
        }
    }
}
