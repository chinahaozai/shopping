package com.halewang.shopping.model.bean.home;

import com.halewang.shopping.model.bean.hot.HotBean;
import com.halewang.shopping.model.service.ApiManage;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Wang Hao on 2016/12/18.
 */

public class RecommendModel {
    public static void getRecommendData(Subscriber<RecommendBean> subscriber,int page,long currentTime){
        ApiManage.getHomeRecommendService().getHomeRecommendData("true","newest",
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
     * requesttime=1482104250382&resolution=1080*1920&
     * device=Android
     */
}
