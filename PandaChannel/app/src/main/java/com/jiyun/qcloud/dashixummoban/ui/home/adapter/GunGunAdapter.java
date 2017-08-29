package com.jiyun.qcloud.dashixummoban.ui.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.ui.home.entity.InToGunGunBean;

import java.util.List;

/**
 * Created by admin on 2017/8/28.
 */

public class GunGunAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<InToGunGunBean.ListBean> mList;
    public OnGunGunItemClikcListener onGunGunItemClikcListener;

    public void setOnGunGunItemClikcListener(OnGunGunItemClikcListener onGunGunItemClikcListener){
        this.onGunGunItemClikcListener = onGunGunItemClikcListener;
    }

    public GunGunAdapter(Context context, List<InToGunGunBean.ListBean> mList) {
        this.context = context;
        this.mList = mList;
    }
    class GunGunHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView imageView;
        private TextView title,data;
        public GunGunHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_item_intogungun);
            title = itemView.findViewById(R.id.tv_intogungun_title);
            data = itemView.findViewById(R.id.tv_intogungun_date);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onGunGunItemClikcListener.click(getAdapterPosition(),view);
        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_intogungun,null);
        RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(params);
        return new GunGunHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        GunGunHolder  gunGunHolder = (GunGunHolder) holder;
//        Glide.with(context).load(mList.get(position).getImage()).into(gunGunHolder.imageView);
        MyLoader myLoader = new MyLoader();
        myLoader.displayImage(context,mList.get(position).getImage(),gunGunHolder.imageView);
        gunGunHolder.title.setText(mList.get(position).getTitle());
        gunGunHolder.data.setText(mList.get(position).getDaytime());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public interface OnGunGunItemClikcListener{
        void click(int position, View view);
    }
}
