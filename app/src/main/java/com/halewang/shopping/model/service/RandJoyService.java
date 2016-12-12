package com.halewang.shopping.model.service;

import com.halewang.shopping.model.bean.randjoy.RandJoyBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by halewang on 2016/11/25.
 */

public interface RandJoyService {
    @GET("randJoke.php")
    Observable<RandJoyBean> getRandJoyList(@Query("type") String type, @Query("key") String key);
}
