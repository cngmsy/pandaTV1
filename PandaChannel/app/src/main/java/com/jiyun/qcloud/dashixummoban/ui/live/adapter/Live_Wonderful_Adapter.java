package com.jiyun.qcloud.dashixummoban.ui.live.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.app.App;
import com.jiyun.qcloud.dashixummoban.entity.PandaWonderful;

import java.util.List;

/**
 * Created by 82年的笔记本 on 2017/8/24.
 */

public class Live_Wonderful_Adapter extends BaseAdapter{
    List<PandaWonderful.VideoBean> list;
    private MyHolder myHolder;

    public Live_Wonderful_Adapter(List<PandaWonderful.VideoBean> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            view=View.inflate(App.mBaseActivity, R.layout.live_wonderful_item,null);
            myHolder = new MyHolder();
            myHolder.image=view.findViewById(R.id.image);
            myHolder.title=view.findViewById(R.id.title);
            myHolder.time=view.findViewById(R.id.time);
            view.setTag(myHolder);
        }else {
            view.getTag();
        }
        Glide.with(App.mBaseActivity).load(list.get(i).getImg()).into(myHolder.image);
        myHolder.title.setText(list.get(i).getT());
        myHolder.time.setText(list.get(i).getPtime());
        return view;
    }
    class MyHolder{
        ImageView image;
        TextView title,time;
    }
}
