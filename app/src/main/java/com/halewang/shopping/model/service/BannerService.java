package com.halewang.shopping.model.service;

import com.halewang.shopping.model.bean.banner.BannerBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Wang Hao on 2016/12/18.
 */

public interface BannerService {
    @GET("get_slider/")
    Observable<BannerBean> getBannerData(@Query("appkey") String appkey, @Query("channel") String channel,
                                         @Query("clientversion") String clientversion,@Query("os") String os,
                                         @Query("productid") String productid,@Query("requesttime") long requesttime,
                                         @Query("resolution") String resolution,@Query("device") String device);


}
