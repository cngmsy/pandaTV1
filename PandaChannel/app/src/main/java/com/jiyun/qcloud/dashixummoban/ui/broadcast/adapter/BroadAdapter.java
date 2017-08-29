package com.jiyun.qcloud.dashixummoban.ui.broadcast.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.app.App;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.activity.BroadWebActivity;
import com.jiyun.qcloud.dashixummoban.ui.broadcast.bean.BroadListBean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class BroadAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<BroadListBean.ListBean> list;
    private onClick onclick;

    public void setOnClick(onClick onclick) {
        this.onclick = onclick;
    }

    public interface onClick {
        void onClickListener(String str, int pos);

    }

    public BroadAdapter(Context context, ArrayList<BroadListBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.broad_recyclerview, null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        MyHolder myHolder = (MyHolder) holder;
        myHolder.broad_title.setText(list.get(position).getTitle());
        Glide.with(App.mBaseActivity).load(list.get(position).getPicurl()).into(myHolder.broad_pic);
        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, BroadWebActivity.class);
                intent.putExtra("bean", list.get(position).getUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {

        private ImageView broad_pic;
        private TextView broad_title;
        private TextView broad_date;

        public MyHolder(View itemView) {
            super(itemView);
            broad_pic = itemView.findViewById(R.id.broad_pic);
            broad_title = itemView.findViewById(R.id.broad_title);
            broad_date = itemView.findViewById(R.id.broad_date);
        }
    }
}
