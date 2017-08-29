package com.jiyun.qcloud.dashixummoban.ui.gungun.activity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.app.App;
import com.jiyun.qcloud.dashixummoban.base.BaseActivity;
import com.jiyun.qcloud.dashixummoban.ui.gungun.adapter.SplendidAdapter;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.FileBean;
import com.jiyun.qcloud.dashixummoban.ui.gungun.bean.SplendBean;
import com.jiyun.qcloud.dashixummoban.ui.gungun.model.XiangContract;
import com.jiyun.qcloud.dashixummoban.ui.gungun.model.XiangPresenter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

/**
 * Created by Administrator on 2017/8/26 0026.
 */

public class PandaFileActivity extends BaseActivity implements XiangContract.TopView{

    @BindView(R.id.file_img)
    ImageView fileImg;
    @BindView(R.id.titleTv)
    TextView titleTv;
    @BindView(R.id.file_player)
    JCVideoPlayer filePlayer;
    @BindView(R.id.file_up)
    ImageView fileUp;
    @BindView(R.id.file_content)
    TextView fileContent;
    @BindView(R.id.file_liner)
    LinearLayout fileLiner;
    @BindView(R.id.file_listview)
    ListView fileListview;
    private String url;
    private int Index = 1;
    private String vid;
    private List<SplendBean.VideoBean> list = new ArrayList<>();
    XiangContract.XiangPresenter xiangPresenter;
    Map<String, String> map = new HashMap<>();
    private SplendBean.VideosetBean._$0Bean videoset_$0;

    @Override
    protected void initData() {
        String path = "http://cntv.vod.cdn.myqcloud.com/flash/mp4video61/TMS/2017/08/21/8ff497729f7e4d9881d643f41f90d378_h2641200000nero_aac16-3.mp4";
        filePlayer.setUp(path,"ipanda");
        Intent intent = getIntent();
        url = intent.getStringExtra("id");
        xiangPresenter = new XiangPresenter(this);
        map.put("vsid", url);
        map.put("n", "7");
        map.put("serviceId", "panda");
        map.put("o", "desc");
        map.put("of", "time");
        map.put("p", Index + "");
        xiangPresenter.mapData(map);
    }

    @Override
    protected void initView() {
        fileImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        fileListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                vid = list.get(i).getVid();
//                filePresenter = new FilePresenter(this);
//                map.put("pid", vid);
//                filePresenter.mapData(map);
                xiangPresenter = new XiangPresenter((XiangContract.TopView) App.mBaseActivity);
                map.put("pid",vid);
                xiangPresenter.mapFail(map);

            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_pandafile;
    }



    @Override
    public void showProgress() {

    }

    @Override
    public void dimissProgress() {

    }

    @Override
    public void showMessage(String msg) {

    }

    @Override
    public void setPresenter(XiangContract.XiangPresenter xiangPresenter) {
        this.xiangPresenter = xiangPresenter;
    }

    @Override
    public void getResult(final SplendBean splendBean) {
        list.addAll(splendBean.getVideo());
        SplendidAdapter adapter = new SplendidAdapter(App.mBaseActivity, (ArrayList<SplendBean.VideoBean>) list);
        fileListview.setAdapter(adapter);

        SplendBean.VideosetBean videoset = splendBean.getVideoset();
        videoset_$0 = videoset.get_$0();
        titleTv.setText(videoset_$0.getName());
        fileUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = 0;
                i = fileLiner.getVisibility();
                if (i == 8) {
                    fileLiner.setVisibility(View.VISIBLE);
                    fileContent.setText(videoset_$0.getDesc());
                    fileUp.setImageResource(R.drawable.lpanda_show);
                } else {
                    fileLiner.setVisibility(View.GONE);
                    fileUp.setImageResource(R.drawable.lpanda_off);
                }
            }
        });
    }

    @Override
    public void getFail(FileBean fileBean) {
        FileBean.VideoBean video = fileBean.getVideo();
        List<FileBean.VideoBean.ChaptersBean> chapters = video.getChapters();
        for (FileBean.VideoBean.ChaptersBean cBean : chapters) {
            String url = cBean.getUrl();
            filePlayer.setUp(url,"高清完整");
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        filePlayer.releaseAllVideos();
    }
}
