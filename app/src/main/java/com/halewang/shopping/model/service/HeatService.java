package com.halewang.shopping.model.service;

import com.halewang.shopping.model.bean.compare.ProductBean;
import com.halewang.shopping.model.bean.heat.HeatBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by halewang on 2016/11/25.
 */

public interface HeatService {
    @GET("88344365.php")
    Observable<HeatBean> getHeatList(@Query("action") String action, @Query("client") String client,
                                        @Query("start") int start, @Query("count") int count);
}

    /*值得买 http://appp.kiees.com/88344365.php?action=rank&client=android&start=0&count=30*/
