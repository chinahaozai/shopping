package com.halewang.shopping.model.bean.banner;

import com.halewang.shopping.global.API;
import com.halewang.shopping.model.service.ApiManage;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Wang Hao on 2016/12/18.
 */

public class BannerModel {
    public static void getBannerData(Subscriber<BannerBean> subscriber,long currentTime){
        ApiManage.getBannerService().getBannerData("pear","GooglePlay","3.0.0","android","a1",currentTime,"1080*1920","Android")
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * http://www.mgpyh.com/api/v1/get_slider/
     * ?appkey=pear&channel=GooglePlay&clientversion=3.0.0
     * &os=android&productid=a1&requesttime=1482061539502
     * &resolution=1080*1920&device=Android
     */
}
