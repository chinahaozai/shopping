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

public class ApiManage {
    private static final String TAG = "ApiManage";
    private static CompareService compareService;
    private static MeiziService meiziService;
    private static JoyService joyService;
    private static RandJoyService randJoyService;
    private static BannerService bannerService;
    private static HotService hotService;
    private static HomeRecommendService homeRecommendService;
    private static ShaidanService shaidanService;

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

    public static JoyService getJoyService(){
        if(joyService == null){
            createJoyService();
        }
        return joyService;
    }

    public static RandJoyService getRandJoyService(){
        if(randJoyService == null){
            createRandJoyService();
        }
        return randJoyService;
    }

    public static BannerService getBannerService(){
        if(bannerService == null){
            createBannerService();
        }
        return bannerService;
    }

    public static HotService getHotService(){
        if(hotService == null){
            createHotService();
        }
        return hotService;
    }

    public static HomeRecommendService getHomeRecommendService(){
        if(homeRecommendService == null){
            createHomeRecommendService();
        }
        return homeRecommendService;
    }

    public static ShaidanService getShaidanService(){
        if(shaidanService == null){
            createShaidanService();
        }
        return shaidanService;
    }

    private static void createMeiziService(){
        meiziService = createRetrofit(API.Base_MEIZI_URL).create(MeiziService.class);
    }

    private static void createCompareService(){
        compareService = createRetrofit(API.COMPARE_URL).create(CompareService.class);
    }

    private static void createJoyService(){
        joyService = createRetrofit(API.DAILY_JOY_URL).create(JoyService.class);
    }

    private static void createRandJoyService(){
        randJoyService = createRetrofit(API.RAND_JOY_URL).create(RandJoyService.class);
    }

    private static void createBannerService(){
        bannerService = createRetrofit(API.BARGAIN_URL).create(BannerService.class);
    }

    private static void createHotService(){
        hotService = createRetrofit(API.BARGAIN_URL).create(HotService.class);
    }

    private static void createHomeRecommendService(){
        homeRecommendService = createRetrofit(API.HOME_RECOMMEND_URL).create(HomeRecommendService.class);
    }

    private static void createShaidanService(){

        shaidanService = createRetrofit(API.BARGAIN_URL).create(ShaidanService.class);
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
