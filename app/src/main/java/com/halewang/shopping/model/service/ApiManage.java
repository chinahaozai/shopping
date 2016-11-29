package com.halewang.shopping.model.service;

import android.util.Log;

import com.halewang.shopping.global.API;
import com.halewang.shopping.model.bean.meizi.MeiziData;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.RxJavaCallAdapterFactory;

/**
 * Created by halewang on 2016/11/25.
 */

public class ApiManage {
    private static final String TAG = "ApiManage";
    private static CompareService compareService;
    private static MeiziService meiziService;

    public static CompareService getCompareService(){
        if(compareService == null){
            createCompareService();
        }
        return compareService;
    }

    public static MeiziService getMeiziService(){
        if(meiziService == null){
            createMeiziService();
        }
        return meiziService;
    }

    private static void createMeiziService(){
        meiziService = createRetrofit(API.Base_MEIZI_URL).create(MeiziService.class);
    }

    private static void createCompareService(){
        compareService = createRetrofit(API.BASE_COMPARE_URL).create(CompareService.class);
    }

    private static Retrofit createRetrofit(String baseUrl){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
        return  retrofit;
    }
}
