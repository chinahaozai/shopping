package com.halewang.shopping.model.bean.joy;

import com.halewang.shopping.global.API;
import com.halewang.shopping.model.service.ApiManage;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by halewang on 2016/11/17.
 */

public class JoyModel {

    public static void getJoyList(Subscriber<JoyBean> subscriber, int pageNum, int pageSize) {

        ApiManage.getJoyService().getJoyList(pageNum, pageSize, API.JOY_KEY)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }


}
