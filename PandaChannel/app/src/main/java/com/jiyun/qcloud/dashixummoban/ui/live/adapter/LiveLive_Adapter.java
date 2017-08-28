package com.jiyun.qcloud.dashixummoban.ui.live.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by 82年的笔记本 on 2017/8/26.
 */

public class LiveLive_Adapter extends FragmentPagerAdapter {
    List<Fragment> fragments;
    List<String> title;
    public LiveLive_Adapter(FragmentManager fm,List<Fragment> fragments,List<String> title) {
        super(fm);
        this.fragments=fragments;
        this.title=title;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return title.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}
