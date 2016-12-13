package com.halewang.shopping.model.bean.randjoy;

import android.util.Log;

import com.halewang.shopping.global.API;
import com.halewang.shopping.model.bean.joy.JoyBean;
import com.halewang.shopping.model.service.ApiManage;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by halewang on 2016/11/17.
 */

public class RandJoyModel {

    private static final String TAG = "RandJoyModel";

    public static void getRandJoyList(Subscriber<RandJoyBean> subscriber) {

        ApiManage.getRandJoyService().getRandJoyList("pic", API.JOY_KEY)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
        Log.d(TAG, "getRandJoyList: " + "finish");

    }




}
