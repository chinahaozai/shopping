package com.halewang.shopping.model.service;

import com.halewang.shopping.global.API;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.RxJavaCallAdapterFactory;

/**
 * Created by halewang on 2016/11/25.
 */

public class ServiceClient {
    private static CompareService mService;
    public static CompareService getCompareService(){
        if(mService == null){
            createService();
        }
        return mService;
    }

    private static void createService(){
        mService = createRetrofit().create(CompareService.class);
    }

    private static Retrofit createRetrofit(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
        return  retrofit;
    }
}
