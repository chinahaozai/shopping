package com.halewang.shopping.model.service;

import com.halewang.shopping.model.bean.shaidan.ShaidanBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Wang Hao on 2016/12/18.
 */

public interface ShaidanService {
    @GET("get_more/")
    Observable<ShaidanBean> getShaidanData(@Query("api") String api,@Query("request_key") String request_key,@Query("page") int page,
                                                   @Query("appkey") String appkey, @Query("channel") String channel,
                                                   @Query("clientversion") String clientversion, @Query("os") String os,
                                                   @Query("productid") String productid, @Query("requesttime") long requesttime,
                                                   @Query("resolution") String resolution, @Query("device") String device);

/**
 * http://www.mgpyh.com/api/v1/get_more/?
 * api=true&request_key=solarize&
 * page=1&appkey=pear&
 * channel=GooglePlay&clientversion=3.0.0&
 * os=android&productid=a1&
 * requesttime=1482104249981&resolution=1080*1920&
 * device=Android
 */

}
