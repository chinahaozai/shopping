package com.halewang.shopping.model;

import android.util.Log;

import com.halewang.shopping.global.API;
import com.halewang.shopping.model.bean.ProductBean;
import com.halewang.shopping.model.service.ServiceClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by halewang on 2016/11/17.
 */

public class ProductModel{

    /*public static Observable<String> getCompareList(String keyword, int pageNum) {
        return getCompareList(keyword, pageNum, 20);
    }*/


    /*public static Observable<String> getCompareList(final String keyeord, final int pageNum, final int itemCount) {

        return Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
            }
        }).subscribeOn(Schedulers.io())
          .observeOn(AndroidSchedulers.mainThread());
    }*/

    public static void getCompareList(Subscriber<ProductBean> subscriber, String keyword, int pageNum, int itemCount){

        /*Call<ProductBean> call = ServiceClient.getCompareService().getCompareList(keyword, pageNum, itemCount, API.APP_KEY);
        call.enqueue(new Callback<ProductBean>() {
            @Override
            public void onResponse(Response<ProductBean> response) {
                Log.d("halewang",response.body().toString());
                ProductBean productBean = response.body();
                Log.d("halewang","品牌--------"+productBean.getResult().getSearchResultList().get(0).getBrandName());
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("halewang",t.toString());
            }
        });*/
        ServiceClient.getCompareService().getCompareList(keyword, pageNum, itemCount, API.APP_KEY)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);


    }


}
