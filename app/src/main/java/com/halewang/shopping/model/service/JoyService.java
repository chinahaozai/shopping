package com.halewang.shopping.model.service;

import com.halewang.shopping.model.bean.joy.JoyBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by halewang on 2016/11/25.
 */

public interface JoyService {
    @GET("text.from")
    Observable<JoyBean> getJoyList(@Query("page") int pageNum, @Query("pagesize") int pageSize,
                                   @Query("key") String key);
}
