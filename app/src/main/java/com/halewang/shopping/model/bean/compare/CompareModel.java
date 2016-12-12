package com.halewang.shopping.model.bean.compare;

import com.halewang.shopping.Debug;
import com.halewang.shopping.global.API;
import com.halewang.shopping.model.service.ApiManage;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by halewang on 2016/11/17.
 */

public class CompareModel {


    public static void getCompareList(Subscriber<ProductBean> subscriber, String keyword, int pageNum, int itemCount) {

        if (Debug.IS_DEBUG) {

            Observable.create(new Observable.OnSubscribe<ProductBean>() {
                @Override
                public void call(Subscriber<? super ProductBean> subscriber) {
                    subscriber.onNext(Debug.getLocalData());
                    subscriber.onCompleted();
                }
            }).subscribeOn(Schedulers.io())
              .unsubscribeOn(Schedulers.io())
              .observeOn(AndroidSchedulers.mainThread())
              .subscribe(subscriber);
        } else {
            ApiManage.getCompareService().getCompareList(keyword, pageNum, itemCount, API.COMPARE_KEY)
                    .subscribeOn(Schedulers.io())
                    .unsubscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(subscriber);
        }
    }


}
