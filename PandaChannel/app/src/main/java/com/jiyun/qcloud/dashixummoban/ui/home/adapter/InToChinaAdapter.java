package com.jiyun.qcloud.dashixummoban.ui.home.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.entity.PandaHome;

import java.util.List;

/**
 * Created by admin on 2017/8/28.
 */

public class InToChinaAdapter extends BaseAdapter {
    private Context context;
    private List<PandaHome.DataBean.ChinaliveBean.ListBean> mList;

    public InToChinaAdapter(Context context, List<PandaHome.DataBean.ChinaliveBean.ListBean> mList) {
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
        InChinaHolder holder;
        if (view == null){
            holder = new InChinaHolder();
            view = View.inflate(context, R.layout.item_intochina,null);
            holder.imageView = view.findViewById(R.id.iv_item_intochina);
            holder.textView = view.findViewById(R.id.tv_item_intochina);
            view.setTag(holder);
        }else {
            holder = (InChinaHolder) view.getTag();
        }
        MyLoader myLoader = new MyLoader();
        myLoader.displayImage(context,mList.get(i).getImage(),holder.imageView);
//        Glide.with(context).load(mList.get(i).getImage()).into(holder.imageView);
        holder.textView.setText(mList.get(i).getTitle());
        return view;
    }
    class InChinaHolder{
        private ImageView imageView;
        private TextView textView;
    }
}
