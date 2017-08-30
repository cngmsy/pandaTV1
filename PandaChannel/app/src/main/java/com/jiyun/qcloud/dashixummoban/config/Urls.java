package com.jiyun.qcloud.dashixummoban.config;

/**
 * Created by xingge on 2017/7/11.
 * 相关参数
 */

public class Urls {

    //服务器地址
    private static final String BASEURL = "http://www.ipanda.com/kehuduan/";
    //首页
    public static final String PANDAHOME = BASEURL+"PAGE14501749764071042/index.json";
    //熊猫直播
    public static final String PANDALIVE = BASEURL+"PAGE14501769230331752/index.json";
    //列表
    public static final String PAGELIST = BASEURL+"PAGE14501786751053212/index.json";

    public static final String PAGEINFOLIST = "http://101.200.142.201/MyListLoadAuto/listload";
    //获取图片验证码
    public static final String IMGCODE = "http://reg.cntv.cn/simple/verificationCode.action";
    //邮箱注册
    public static final String EMAILREGISTER = "https://reg.cntv.cn/api/register.action";
    //熊猫播报
    public static final String BROAD = "http://www.ipanda.com/kehuduan/news/index.json";
    //滚滚视频
    public static final String GUNGUN = "http://www.ipanda.com/kehuduan/video/index.json";
    //高清完整
    public static final String SPLENDURL = "http://api.cntv.cn/video/videolistById";
    //视频拼接
    public  static final String MOVIE = "http://115.182.9.189/api/getVideoInfoForCBox.do";
    //首页互动
    public static final String HUDONG=BASEURL+"PAGE14501767715521482/index.json";
}
