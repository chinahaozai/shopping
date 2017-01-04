package com.halewang.shopping.model.bean.heat;

import com.halewang.shopping.model.service.ApiManage;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by halewang on 2016/11/17.
 */

public class HeatModel {

    public static void getHeatList(Subscriber<HeatBean> subscriber, int start, int count) {

        ApiManage.getHeatService().getHeatList("rank", "android", start, count)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

}
