package com.jiyun.qcloud.dashixummoban.ui.gungun.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.app.App;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.SplendBean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/28 0028.
 */

public class SplendidAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<SplendBean.VideoBean> list;
    private MyHolder holder;

    public SplendidAdapter(Context context, ArrayList<SplendBean.VideoBean> list) {
        this.context = context;
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
            holder = new MyHolder();
            view = View.inflate(context, R.layout.splendid_listview, null);
            holder.sp_img = view.findViewById(R.id.sp_img);
            holder.sp_time = view.findViewById(R.id.sp_time);
            holder.sp_title = view.findViewById(R.id.sp_title);
            view.setTag(holder);
        }else {
            holder = (MyHolder) view.getTag();
        }
        holder.sp_time.setText(list.get(i).getLen());
        holder.sp_title.setText(list.get(i).getT());
        Glide.with(App.mBaseActivity).load(list.get(i).getImg()).into(holder.sp_img);
        return view;
    }
    class MyHolder{
        ImageView sp_img;
        TextView sp_time,sp_title;
    }
}
