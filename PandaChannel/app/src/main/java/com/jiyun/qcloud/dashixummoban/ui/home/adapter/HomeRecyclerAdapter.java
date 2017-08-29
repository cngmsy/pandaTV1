package com.jiyun.qcloud.dashixummoban.ui.home.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.entity.PandaHome;
import com.jiyun.qcloud.dashixummoban.ui.home.entity.InToCctvBean;
import com.jiyun.qcloud.dashixummoban.ui.home.entity.InToGunGunBean;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/8/24.
 */

public class HomeRecyclerAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<Object> mList;
    private List<InToCctvBean.ListBean> cctvBeanList;
    List<InToGunGunBean.ListBean> gunGunBeanList;
    private static final int LUNBO = 0;//轮播
    private static final int BROADCAST = 1;//熊猫播报
    private static final int LIVE = 2;//直播秀场
    private static final int SPLENDID = 3;//精彩一刻
    private static final int GUNGUN = 4;//滚滚视频
    private static final int CHINA = 5;//直播中国
    public XItemClickListener xItemClickListener;

    public void setOnXItemClickListener(XItemClickListener xItemClickListener){
        this.xItemClickListener = xItemClickListener;
    }

    public HomeRecyclerAdapter(Context context, List<Object> mList, List<InToCctvBean.ListBean> cctvBeanList, List<InToGunGunBean.ListBean> gunGunBeanList) {
        this.context = context;
        this.mList = mList;
        this.cctvBeanList = cctvBeanList;
        this.gunGunBeanList = gunGunBeanList;
    }

    //轮播
    class LunBoHolder extends RecyclerView.ViewHolder{
        private Banner banner;
        public LunBoHolder(View itemView) {
            super(itemView);
            banner = itemView.findViewById(R.id.ban_homefragment);
        }
    }
    //播报
    class BroadHolder extends RecyclerView.ViewHolder{
        private TextView live,find,liveContent,findContent;
        public BroadHolder(View itemView) {
            super(itemView);
            live = itemView.findViewById(R.id.tv_itemhomefragment_live);
            find = itemView.findViewById(R.id.tv_itemhomefragment_find);
            liveContent = itemView.findViewById(R.id.tv_itemfragment_livecontent);
            findContent = itemView.findViewById(R.id.tv_itemfragment_findcontent);
        }
    }
    //秀场
    class LiveHolder extends RecyclerView.ViewHolder{
        private GridView gridViewLive;
        public LiveHolder(View itemView) {
            super(itemView);
            gridViewLive = itemView.findViewById(R.id.gv_homefragment_live);
        }
    }
    //精彩
    class SplendidHolder extends RecyclerView.ViewHolder{
        private GridView gridViewSp;
        public SplendidHolder(View itemView) {
            super(itemView);
            gridViewSp = itemView.findViewById(R.id.gv_homefragment_splendid);
        }
    }
    //滚滚
    class GunGunHolder extends RecyclerView.ViewHolder{
        private RecyclerView recyclerViewGun;
        public GunGunHolder(View itemView) {
            super(itemView);
            recyclerViewGun = itemView.findViewById(R.id.rv_itemhomefragment_gungun);
        }
    }
    //中国
    class ChinaHolder extends RecyclerView.ViewHolder{
        private GridView gridViewChina;
        public ChinaHolder(View itemView) {
            super(itemView);
            gridViewChina = itemView.findViewById(R.id.gv_homefragment_china);
        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType){
            case LUNBO:
                View lunbo = View.inflate(context, R.layout.item_homefragment_lunbo,null);
                RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                lunbo.setLayoutParams(params);
                return new LunBoHolder(lunbo);
            case BROADCAST:
                View broad = View.inflate(context, R.layout.item_homefragment_broadcast,null);
                RecyclerView.LayoutParams paramsb = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                broad.setLayoutParams(paramsb);
                return new BroadHolder(broad);
            case LIVE:
                View live = View.inflate(context, R.layout.item_homefragment_live,null);
                RecyclerView.LayoutParams paramsl = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                live.setLayoutParams(paramsl);
                return new LiveHolder(live);
            case SPLENDID:
                View splendid = View.inflate(context, R.layout.item_homefragment_splendid,null);
                RecyclerView.LayoutParams paramss = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                splendid.setLayoutParams(paramss);
                return new SplendidHolder(splendid);
            case GUNGUN:
                View gunGun = View.inflate(context, R.layout.item_homefragment_gungun,null);
                RecyclerView.LayoutParams paramsg = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                gunGun.setLayoutParams(paramsg);
                return new GunGunHolder(gunGun);
            case CHINA:
                View china = View.inflate(context, R.layout.item_homefragment_china,null);
                RecyclerView.LayoutParams paramsc = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                china.setLayoutParams(paramsc);
                return new ChinaHolder(china);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)){
            case LUNBO:
                LunBoHolder lunBoHolder = (LunBoHolder) holder;
                List<PandaHome.DataBean.BigImgBean> imgBeanList = (List<PandaHome.DataBean.BigImgBean>) mList.get(position);
                setLunBo(lunBoHolder,imgBeanList);
                break;
            case BROADCAST:
                BroadHolder broadHolder = (BroadHolder) holder;
                PandaHome.DataBean.PandaeyeBean pandaeyeBean = (PandaHome.DataBean.PandaeyeBean) mList.get(position);
                setBroadCase(broadHolder,pandaeyeBean);
                break;
            case LIVE:
                LiveHolder liveHolder = (LiveHolder) holder;
                PandaHome.DataBean.PandaliveBean pandaliveBean = (PandaHome.DataBean.PandaliveBean) mList.get(position);
                setLive(liveHolder,pandaliveBean);
                break;
            case SPLENDID:
                SplendidHolder splendidHolder = (SplendidHolder) holder;
                setSplendid(splendidHolder);
                break;
            case GUNGUN:
                GunGunHolder gunGunHolder = (GunGunHolder) holder;
                setGunGun(gunGunHolder);
                break;
            case CHINA:
                ChinaHolder chinaHolder = (ChinaHolder) holder;
                PandaHome.DataBean.ChinaliveBean chinaliveBean = (PandaHome.DataBean.ChinaliveBean) mList.get(position);
                setChina(chinaHolder,chinaliveBean);
                break;
        }
    }

    private void setChina(ChinaHolder chinaHolder, PandaHome.DataBean.ChinaliveBean chinaliveBean) {
        GridView gridView = chinaHolder.gridViewChina;
        List<PandaHome.DataBean.ChinaliveBean.ListBean> list = chinaliveBean.getList();
        InToChinaAdapter adapter = new InToChinaAdapter(context,list);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                xItemClickListener.onChinaListener(i,view);
            }
        });
    }

    private void setGunGun(GunGunHolder gunGunHolder) {
        RecyclerView recyclerView = gunGunHolder.recyclerViewGun;
        RecyclerView.LayoutManager manager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(manager);
        GunGunAdapter adapter = new GunGunAdapter(context,gunGunBeanList);
        recyclerView.setAdapter(adapter);
        adapter.setOnGunGunItemClikcListener(new GunGunAdapter.OnGunGunItemClikcListener() {
            @Override
            public void click(int position, View view) {
                xItemClickListener.onGunGunListener(position,view);
            }
        });
    }

    private void setSplendid(SplendidHolder splendidHolder) {
        GridView gridView = splendidHolder.gridViewSp;
        SplendidAdapter splendidAdapter = new SplendidAdapter(context, cctvBeanList);
        gridView.setAdapter(splendidAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    xItemClickListener.onSplendidListener(i,view);
            }
        });
    }
    private void setLive(LiveHolder liveHolder, PandaHome.DataBean.PandaliveBean pandaliveBean) {
        GridView gridView = liveHolder.gridViewLive;
        List<PandaHome.DataBean.PandaliveBean.ListBeanX> list = pandaliveBean.getList();
        PandaLiveAdapter adapter = new PandaLiveAdapter(context,list);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                xItemClickListener.onLiveListener(i,view);
            }
        });
    }

    private void setBroadCase(BroadHolder broadHolder, PandaHome.DataBean.PandaeyeBean pandaeyeBean) {
        TextView live = broadHolder.live;
        TextView find = broadHolder.find;
        TextView liveContent = broadHolder.liveContent;
        TextView findContent = broadHolder.findContent;
        List<PandaHome.DataBean.PandaeyeBean.ItemsBean> items = pandaeyeBean.getItems();
        live.setText(items.get(0).getBrief());
        find.setText(items.get(1).getBrief());
        liveContent.setText(items.get(0).getTitle());
        findContent.setText(items.get(1).getTitle());
        liveContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xItemClickListener.onFristBroadCastListener(view);
            }
        });
        findContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xItemClickListener.onSecondBroadCastListener(view);
            }
        });
    }
    //轮播
    private void setLunBo(LunBoHolder lunBoHolder, final List<PandaHome.DataBean.BigImgBean> imgBeanList) {
        Banner banner = lunBoHolder.banner;
        List<String> imgs = new ArrayList<>();
        List<String> titles = new ArrayList<>();
        for (int i = 0; i < imgBeanList.size(); i++) {
            PandaHome.DataBean.BigImgBean imgBean = imgBeanList.get(i);
            imgs.add(imgBean.getImage());
            titles.add(imgBean.getTitle());
        }

        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
        banner.setBannerAnimation(Transformer.Accordion);
        banner.setImages(imgs);
        banner.setBannerTitles(titles);
        banner.setImageLoader(new MyLoader());
        //设置自动轮播，默认为true
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(2000);
        banner.setIndicatorGravity(BannerConfig.RIGHT);
        banner.start();

        banner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                xItemClickListener.onLunBoListener(position,imgBeanList);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public int getItemViewType(int position) {
        Object o = mList.get(position);
        if (position == 0){
            return LUNBO;
        }
        if (o instanceof PandaHome.DataBean.PandaeyeBean){
            return BROADCAST;
        }
        if (o instanceof PandaHome.DataBean.PandaliveBean){
            return LIVE;
        }
        if (o instanceof PandaHome.DataBean.CctvBean){
            return SPLENDID;
        }
        if (o instanceof PandaHome.DataBean.ListBeanXX){
            return GUNGUN;
        }
        if (o instanceof PandaHome.DataBean.ChinaliveBean){
            return CHINA;
        }
        return super.getItemViewType(position);
    }
    public interface XItemClickListener{
        //轮播
        void onLunBoListener(int position, List<PandaHome.DataBean.BigImgBean> imgBeanList);
        //精彩一刻
        void onSplendidListener(int position, View view);
        //熊猫播报第一条
        void onFristBroadCastListener(View view);
        //熊猫播报第二条
        void onSecondBroadCastListener(View view);
        //直播秀场
        void onLiveListener(int position, View view);
        //滚滚视频
        void onGunGunListener(int position, View view);
        //直播中国
        void onChinaListener(int position, View view);
    }
}
