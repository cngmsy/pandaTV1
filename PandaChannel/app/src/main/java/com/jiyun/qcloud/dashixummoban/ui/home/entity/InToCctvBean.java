package com.jiyun.qcloud.dashixummoban.ui.home.entity;

import java.util.List;

/**
 * Created by admin on 2017/8/28.
 */

public class InToCctvBean {

    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "InToCctvBean{" +
                "list=" + list +
                '}';
    }

    public static class ListBean {
        /**
         * daytime : 2017-08-27
         * id : TITE1503797084796892
         * image : http://p1.img.cctvpic.com/photoworkspace/2017/08/26/2017082614114629237.jpg
         * order : 1
         * pid : 7bd5dcdfd8244218a09ba85100bf782b
         * title : 柔软的成胖子
         * type : 2
         * url : http://live.ipanda.com/2017/08/26/VIDE5K3XHwZM9WRc7N0FhUWT170826.shtml
         * vid :
         * videoLength : 00:26
         */

        private String daytime;
        private String id;
        private String image;
        private String order;
        private String pid;
        private String title;
        private String type;
        private String url;
        private String vid;
        private String videoLength;

        public String getDaytime() {
            return daytime;
        }

        public void setDaytime(String daytime) {
            this.daytime = daytime;
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

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
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

        public String getVideoLength() {
            return videoLength;
        }

        public void setVideoLength(String videoLength) {
            this.videoLength = videoLength;
        }

        @Override
        public String toString() {
            return "ListBean{" +
                    "daytime='" + daytime + '\'' +
                    ", id='" + id + '\'' +
                    ", image='" + image + '\'' +
                    ", order='" + order + '\'' +
                    ", pid='" + pid + '\'' +
                    ", title='" + title + '\'' +
                    ", type='" + type + '\'' +
                    ", url='" + url + '\'' +
                    ", vid='" + vid + '\'' +
                    ", videoLength='" + videoLength + '\'' +
                    '}';
        }
    }
}
