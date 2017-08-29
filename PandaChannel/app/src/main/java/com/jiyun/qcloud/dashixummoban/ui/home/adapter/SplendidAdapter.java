package com.jiyun.qcloud.dashixummoban.ui.home.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.ui.home.entity.InToCctvBean;

import java.util.List;

/**
 * Created by admin on 2017/8/28.
 */

public class SplendidAdapter extends BaseAdapter {
    private Context context;
    private List<InToCctvBean.ListBean> mList;

    public SplendidAdapter(Context context, List<InToCctvBean.ListBean> mList) {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        SplendidHolder holder;
        if (view == null){
            holder = new SplendidHolder();
            view = View.inflate(context, R.layout.item_intosplendid,null);
            holder.imageView = view.findViewById(R.id.iv_item_intosplendid);
            holder.title = view.findViewById(R.id.tv_item_intosplendid_title);
            holder.data = view.findViewById(R.id.tv_item_intosplendid_data);
            view.setTag(holder);
        }else {
            holder = (SplendidHolder) view.getTag();
        }
//        Glide.with(context).load(mList.get(i).getImage()).into(holder.imageView);
        MyLoader myLoader = new MyLoader();
        myLoader.displayImage(context,mList.get(i).getImage(),holder.imageView);
        holder.title.setText(mList.get(i).getTitle());
        holder.title.setText(mList.get(i).getDaytime());
        return view;
    }
    class SplendidHolder{
        private ImageView imageView;
        private TextView title,data;
    }
}
