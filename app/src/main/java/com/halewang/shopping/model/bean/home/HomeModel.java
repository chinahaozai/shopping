package com.halewang.shopping.model.bean.home;

import com.halewang.shopping.model.bean.shaidan.ShaidanBean;
import com.halewang.shopping.model.service.ApiManage;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Wang Hao on 2016/12/18.
 */

public class HomeModel {
    public static void getHomeData(Subscriber<HomeBean> subscriber,int page,long currentTime){
        ApiManage.getHomeService().getHomeData("true","newest",
                page,"pear","GooglePlay","3.0.0","android","a1",currentTime,"1080*1920","Android")
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
    /**
     * http://www.mgpyh.com/api/v1/get_more/?
     * api=true&request_key=newest&
     * page=1&appkey=pear&
     * channel=GooglePlay&clientversion=3.0.0&
     * os=android&productid=a1&
     * requesttime=1482104249981&resolution=1080*1920&
     * device=Android
     */
}
