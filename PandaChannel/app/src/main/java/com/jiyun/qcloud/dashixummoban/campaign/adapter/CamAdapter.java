package com.jiyun.qcloud.dashixummoban.campaign.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.app.App;
import com.jiyun.qcloud.dashixummoban.campaign.bean.CampaignBean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/28 0028.
 */

public class CamAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<CampaignBean.InteractiveBean> list;
    private MyHolder holder;

    public CamAdapter(Context context, ArrayList<CampaignBean.InteractiveBean> list) {
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
            view = View.inflate(context, R.layout.cam_item, null);
            holder.cam_image = view.findViewById(R.id.cam_image);
            holder.cam_title = view.findViewById(R.id.cam_title);
            view.setTag(holder);
        }else {
            holder = (MyHolder) view.getTag();
        }
        holder.cam_title.setText(list.get(i).getTitle());
        Glide.with(App.mBaseActivity).load(list.get(i).getImage()).into(holder.cam_image);
        return view;
    }
    class MyHolder{
        ImageView cam_image;
        TextView cam_title;
    }
}
