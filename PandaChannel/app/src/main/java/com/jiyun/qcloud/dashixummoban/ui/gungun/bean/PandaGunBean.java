package com.jiyun.qcloud.dashixummoban.ui.gungun.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/8/25 0025.
 */

public class PandaGunBean {

    private List<BigImgBean> bigImg;
    private List<ListBean> list;

    public List<BigImgBean> getBigImg() {
        return bigImg;
    }

    public void setBigImg(List<BigImgBean> bigImg) {
        this.bigImg = bigImg;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class BigImgBean {
        /**
         * id : TITE1503641613183897
         * image : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2017/8/25/1503641643250_624.jpg
         * order : 1
         * pid : 8624ba050f7642bf80e961db51ab1d20
         * stype :
         * title : 《超萌滚滚秀》幼儿园里欢乐多
         * type : 2
         * url : http://live.ipanda.com/2017/08/24/VIDE4XyAr5CrOuxi1zTlCHrY170824.shtml
         * vid :
         */

        private String id;
        private String image;
        private String order;
        private String pid;
        private String stype;
        private String title;
        private String type;
        private String url;
        private String vid;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getStype() {
            return stype;
        }

        public void setStype(String stype) {
            this.stype = stype;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getVid() {
            return vid;
        }

        public void setVid(String vid) {
            this.vid = vid;
        }
    }

    public static class ListBean {
        /**
         * brief : 第二季第十一期：一起惹的祸，妹妹背黑锅
         * id : VSET100284428835
         * image : http://p1.img.cctvpic.com/photoworkspace/2017/08/21/2017082113472411863.jpg
         * order : 1
         * title : 《熊猫TOP榜》
         * type : 2
         * url : http://live.ipanda.com/2017/08/21/VIDEkIyralrrjjG4oF2fqmiI170821.shtml
         * videoLength : 04:33
         */

        private String brief;
        private String id;
        private String image;
        private String order;
        private String title;
        private String type;
        private String url;
        private String videoLength;

        public String getBrief() {
            return brief;
        }

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getVideoLength() {
            return videoLength;
        }

        public void setVideoLength(String videoLength) {
            this.videoLength = videoLength;
        }
    }
}
