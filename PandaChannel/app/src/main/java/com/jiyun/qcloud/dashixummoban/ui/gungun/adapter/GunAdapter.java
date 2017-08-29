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
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.PandaGunBean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/25 0025.
 */

public class GunAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<PandaGunBean.ListBean> list;
    private MyHolder holder;

    public GunAdapter(Context context, ArrayList<PandaGunBean.ListBean> list) {
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
            view = View.inflate(context, R.layout.gun_listview, null);
            holder.gun_image = view.findViewById(R.id.gun_img);
            holder.gun_time = view.findViewById(R.id.gun_time);
            holder.gun_title = view.findViewById(R.id.gun_title);
            holder.gun_count = view.findViewById(R.id.gun_content);
            view.setTag(holder);
        }else {
            holder = (MyHolder) view.getTag();
        }
        holder.gun_count.setText(list.get(i).getBrief());
        holder.gun_title.setText(list.get(i).getTitle());
        holder.gun_time.setText(list.get(i).getVideoLength());
        Glide.with(App.mBaseActivity).load(list.get(i).getImage()).into(holder.gun_image);
        return view;
    }
    class MyHolder{
        ImageView gun_image;
        TextView gun_time,gun_title,gun_count;
    }
}
