package com.halewang.shopping.model;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by halewang on 2016/11/17.
 */

public class ProductModel{

    public static Observable<String> getCompareList(String name, int pageNum) {
        return getCompareList(name, pageNum, 10);
    }


    public static Observable<String> getCompareList(String name, int pageNum, int itemCount) {

        return Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("从网络获取数据");
            }
        }).subscribeOn(Schedulers.io())
          .observeOn(AndroidSchedulers.mainThread());
    }
}
