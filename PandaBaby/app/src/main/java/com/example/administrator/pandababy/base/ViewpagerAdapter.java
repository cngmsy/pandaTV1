package com.example.administrator.pandababy.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/8/23 0023.
 */

public class ViewpagerAdapter extends FragmentPagerAdapter {
    private List<BaseFragment> list;
    private List<String> tablayouts;
    public ViewpagerAdapter(FragmentManager fm, List<BaseFragment> list, List<String> tablayouts) {
        super(fm);
        this.list=list;
        this.tablayouts=tablayouts;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tablayouts.get(position);
    }
}
