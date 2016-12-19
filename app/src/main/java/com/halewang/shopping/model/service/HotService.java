package com.halewang.shopping.model.service;

import com.halewang.shopping.model.bean.hot.HotBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Wang Hao on 2016/12/18.
 */

public interface HotService {
    @GET("get_hot/")
    Observable<HotBean> getHotData(@Query("appkey") String appkey, @Query("channel") String channel,
                                   @Query("clientversion") String clientversion, @Query("os") String os,
                                   @Query("productid") String productid, @Query("requesttime") long requesttime,
                                   @Query("resolution") String resolution, @Query("device") String device);


    /**
     * http://www.mgpyh.com/api/v1/get_hot/?
     * appkey=pear&channel=GooglePlay
     * &clientversion=3.0.0&os=android
     * &productid=a1&requesttime=1482104249996
     * &resolution=1080*1920&device=Android
     */
}
