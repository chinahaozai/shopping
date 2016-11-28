package com.halewang.shopping.model.service;

import com.halewang.shopping.model.bean.meizi.MeiziData;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by halewang on 2016/11/28.
 * 妹子图片每日一推
 */

public interface MeiziService {

    @GET("/api/data/福利/1/{page}")
    Observable<MeiziData> getMeizhiData(@Path("page") int page);
}
