package com.jiyun.qcloud.dashixummoban.config;

/**
 * Created by xingge on 2017/7/11.
 * 相关参数
 */

public class Urls {

    //服务器地址
    private static final String BASEURL = "http://www.ipanda.com/kehuduan/";

    //首页
    public static final String PANDAHOME = BASEURL + "PAGE14501749764071042/index.json";
    //熊猫直播
    public static final String PANDALIVE = BASEURL + "PAGE14501769230331752/index.json";
    //    熊猫直播tablayout标题
    public static final String PANDALIVETAB = BASEURL + "PAGE14501772263221982/index.json";
    //    熊猫直播 多视角直播
    public static final String PANDALIVEMULTI = BASEURL + "PAGE14501769230331752/PAGE14501787896813312/index.json";
    //列表
    public static final String PAGELIST = BASEURL + "PAGE14501786751053212/index.json";
    //精彩一刻
    public static final String Wonderful="http://api.cntv.cn/video/videolistById?vsid=VSET100167216881&n=7&serviceId=panda&o=desc&of=time&p=1";
    //超萌滚滚秀
    public static final String ROLL="http://api.cntv.cn/video/videolistById?vsid=VSET100272959126&n=7&serviceId=panda&o=desc&of=time&p=1";
    //熊猫档案
    public static final String PANDAFILE="http://api.cntv.cn/video/videolistById?vsid=VSET100340574858&n=7&serviceId=panda&o=desc&of=time&p=1";
    //熊猫Top榜
    public static final String TOP="http://api.cntv.cn/video/videolistById?vsid=VSET100284428835&n=7&serviceId=panda&o=desc&of=time&p=1";
    //熊猫那些事儿
    public static final String THING="http://api.cntv.cn/video/videolistById?vsid=VSET100237714751&n=7&serviceId=panda&o=desc&of=time&p=1";
    //特别节目
    public static final String PROGREM="http://api.cntv.cn/video/videolistById?vsid=VSET100167308855&n=7&serviceId=panda&o=desc&of=time&p=1";
    //原创新闻
    public static final String NEWS="http://api.cntv.cn/video/videolistById?vsid=VSET100219009515&n=7&serviceId=panda&o=desc&of=time&p=1";
}
