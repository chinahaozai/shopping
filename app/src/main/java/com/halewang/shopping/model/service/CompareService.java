package com.halewang.shopping.model.service;

import com.halewang.shopping.model.bean.ProductBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by halewang on 2016/11/25.
 */

public interface CompareService {
    @GET("complex.from")
    Observable<ProductBean> getCompareList(@Query("keyword") String keyword, @Query("PageNum") int pageNum,
                                           @Query("PageSize") int pageSize, @Query("key") String key);
}
