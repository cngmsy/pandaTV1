package com.jiyun.qcloud.dashixummoban.ui.live.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.app.App;
import com.jiyun.qcloud.dashixummoban.entity.MoreLive;

import java.util.List;

/**
 * Created by 82年的笔记本 on 2017/8/26.
 */

public class LiveGridAdapter extends BaseAdapter {
    List<MoreLive.ListBean> liveList;
    private MyHolder myHolder;

    public LiveGridAdapter(List<MoreLive.ListBean> liveList) {
        this.liveList = liveList;
    }

    @Override
    public int getCount() {
        return liveList.size();
    }

    @Override
    public Object getItem(int i) {
        return liveList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = View.inflate(App.mBaseActivity, R.layout.more_grid_item, null);
            myHolder = new MyHolder();
            myHolder.image = view.findViewById(R.id.image);
            myHolder.title = view.findViewById(R.id.title);
            view.setTag(myHolder);
        } else {
            view.getTag();
        }
        Glide.with(App.mBaseActivity).load(liveList.get(i).getImage()).into(myHolder.image);
        myHolder.title.setText(liveList.get(i).getTitle());
        return view;
    }

    class MyHolder {
        ImageView image;
        TextView title;
    }
}
