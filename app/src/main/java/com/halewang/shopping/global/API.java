package com.halewang.shopping.global;

/**
 * Created by halewang on 2016/11/25.
 */

public class API {

    /**
     * 比价相关
     */
    public static final String COMPARE_URL = "http://japi.juhe.cn/manmanmai/";
    public static final String COMPARE_KEY = "eb7eca7e57448782016cecb7d8415631";

    /**
     * 妹子图片每日一推
     */
    public static final String Base_MEIZI_URL = "http://gank.io";

    /**
     * 卷皮每日推荐
     */
    public static final String JUANPI_URL = "http://api.juanpi.com/open/jiukuaiyou";

    /**
     * 每日趣图
     */
    public static final String DAILY_JOY_URL = "http://japi.juhe.cn/joke/img/";
    public static final String RAND_JOY_URL = "http://v.juhe.cn/joke/";

    public static final String JOY_KEY = "9aaf9336fc1c734b8db4af1948ca0c51";

    /**
     * 买个便宜货
     */

    public static final String OFFICIAL_URL = "http://www.mgpyh.com";

    public static final String BARGAIN_URL = "http://www.mgpyh.com/api/v1/";

    /**
     * http://www.mgpyh.com/api/v1/get_more/?api=true&request_key=solarize&page=1&appkey=pear&channel=GooglePlay&clientversion=3.0.0&os=android&productid=a1&requesttime=1482104249981&resolution=1080*1920&device=Android
     */
    /**
     * http://www.mgpyh.com/api/v1/get_more/?api=true&request_key=not_good_bomb&page=1&appkey=pear&channel=GooglePlay&clientversion=3.0.0&os=android&productid=a1&requesttime=1482104249989&resolution=1080*1920&device=Android
     */
    /**
     * http://www.mgpyh.com/api/v1/get_more/?api=true&request_key=newest&page=1&appkey=pear&channel=GooglePlay&clientversion=3.0.0&os=android&productid=a1&requesttime=1482104250382&resolution=1080*1920&device=Android
     */
    /**
     * 买个便宜货
     * (get_more)晒单-request_key=solarize
     * (get_more)首页数据-request_key=newest
     * (get_more)必应-request_key=not_good_bomb
     */
    /**
     * http://www.mgpyh.com/api/v1/get_hot/?appkey=pear&channel=GooglePlay&clientversion=3.0.0&os=android&productid=a1&requesttime=1482104249996&resolution=1080*1920&device=Android
     */
    public static final String HOT_URL = BARGAIN_URL + "/api/v1/";

    //买个便宜货首页推荐
    public static final String HOME_RECOMMEND_URL = BARGAIN_URL + "/api/v1/";

    /**
     * 值得买 http://appp.kiees.com/88344365.php?action=rank&client=android&start=0&count=30
     */
    public static final String HEAT_URL = "http://appp.kiees.com/";

}
