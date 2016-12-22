package com.halewang.shopping.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.halewang.shopping.MainActivity;
import com.halewang.shopping.ProductDetailActivity;
import com.halewang.shopping.adapter.HomePagerAdapter;
import com.halewang.shopping.fragment.BingFragment;
import com.halewang.shopping.fragment.HomeFragment;
import com.halewang.shopping.fragment.HotFragment;
import com.halewang.shopping.fragment.ShaidanFragment;
import com.halewang.shopping.global.API;
import com.halewang.shopping.model.bean.banner.BannerBean;
import com.halewang.shopping.model.bean.banner.BannerDetail;
import com.halewang.shopping.model.bean.banner.BannerModel;
import com.halewang.shopping.model.bean.seckill.Seckill;
import com.halewang.shopping.model.bean.seckill.SeckillBean;
import com.halewang.shopping.view.MainView;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerClickListener;
import com.youth.banner.loader.ImageLoader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import rx.Subscriber;

/**
 * Created by halewang on 2016/12/6.
 */

public class MainPresenter extends BasePresenter<MainView>{

    private static final String TAG = "MainPresenter";

    private Context mContext;
    private List<String> dealTitles;
    private List<String> imageUrls;
    private List<String> dealUrls;
    private List<String> mTabs;
    private List<Fragment> mFragments;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    //private Banner mBanner;

    public MainPresenter(Context context){
        mContext = context;
    }

    @Override
    public void onStart() {
        super.onStart();
        //initBannerData2();
        initTabLayout();
        initViewPager();
    }

    private void initTabLayout(){
        mTabLayout = getMvpView().getTabLayout();
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabs = new ArrayList<>();
        mTabs.add("首页");
        mTabs.add("晒单");
        mTabs.add("必应");
        mTabs.add("热门");
    }

    private void initViewPager(){
        mViewPager = getMvpView().getViewPager();
        mViewPager.setOffscreenPageLimit(4);
        mFragments = new ArrayList<>();
        mFragments.add(new HomeFragment());
        mFragments.add(new ShaidanFragment());
        mFragments.add(new BingFragment());
        mFragments.add(new HotFragment());

        MainActivity activity = (MainActivity) mContext;
        HomePagerAdapter mAdapter = new HomePagerAdapter(activity.getSupportFragmentManager(), mFragments, mTabs);
        mViewPager.setAdapter(mAdapter);
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabs.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabs.get(1)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabs.get(2)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabs.get(3)));
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabsFromPagerAdapter(mAdapter);
    }


    /*private void initBannerData2(){
        mBanner = getMvpView().getBanner();
        dealTitles = new ArrayList<>();
        imageUrls = new ArrayList<>();
        dealUrls = new ArrayList<>();

        mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        mBanner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(mContext)
                        .load(path)
                        .centerCrop()
                        .into(imageView);
            }
        });
        mBanner.setBannerAnimation(Transformer.DepthPage);
        mBanner.isAutoPlay(true);
        mBanner.setDelayTime(2500);
        mBanner.setIndicatorGravity(BannerConfig.RIGHT);

        mBanner.setOnBannerClickListener(new OnBannerClickListener() {
            @Override
            public void OnBannerClick(int position) {
                Intent intent = new Intent(mContext, ProductDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("url", dealUrls.get(position - 1));
                bundle.putString("brand", "");
                intent.putExtra("detail", bundle);
                mContext.startActivity(intent);
            }
        });
        BannerModel.getBannerData(new Subscriber<BannerBean>() {
            @Override
            public void onCompleted() {
                Log.d(TAG, "onCompleted: " + System.currentTimeMillis());
                System.out.println("onCompleted: finish");
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: finish");
                System.out.println("onError: finish");
            }

            @Override
            public void onNext(BannerBean bannerBean) {
                Log.d(TAG, "     onNext: " + System.currentTimeMillis());
                System.out.println("onNext: " + bannerBean.toString());

                List<BannerDetail> items = bannerBean.getItems();
                for(BannerDetail detail : items){
                    dealTitles.add(detail.getPost_title());
                    imageUrls.add(detail.getSlide_thumb());
                    dealUrls.add(API.OFFICIAL_URL +detail.getPost_url());
                }

                mBanner.setImages(imageUrls);
                mBanner.setBannerTitles(dealTitles);

                MainActivity mView = (MainActivity) getMvpView();
                mView.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mBanner.start();
                    }
                });
            }
        },System.currentTimeMillis());
    }*/
}
