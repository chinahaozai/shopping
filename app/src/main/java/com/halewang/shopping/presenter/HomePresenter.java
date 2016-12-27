package com.halewang.shopping.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.halewang.shopping.ProductDetailActivity;
import com.halewang.shopping.R;
import com.halewang.shopping.adapter.HomeListAdapter;
import com.halewang.shopping.global.API;
import com.halewang.shopping.model.bean.banner.BannerBean;
import com.halewang.shopping.model.bean.banner.BannerDetail;
import com.halewang.shopping.model.bean.banner.BannerModel;
import com.halewang.shopping.model.bean.home.Home;
import com.halewang.shopping.model.bean.home.HomeBean;
import com.halewang.shopping.model.bean.home.HomeModel;
import com.halewang.shopping.view.fragment.HomeView;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerClickListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import rx.Subscriber;

/**
 * Created by halewang on 2016/12/21.
 */

public class HomePresenter extends BasePresenter<HomeView>{

    private static final String TAG = "HomePresenter";

    private Context mContext;
    private RecyclerView mRecyclerView;
    private Banner mBanner;
    private SwipeRefreshLayout mRefreshLayout;

    private List<String> dealTitles;
    private List<String> imageUrls;
    private List<String> dealUrls;

    public HomePresenter(Context context){
        mContext = context;
    }

    @Override
    public void onStart() {
        super.onStart();
        mBanner = (Banner) getMvpView().getHeader().findViewById(R.id.banner_header);
        mRecyclerView = getMvpView().getRecyclerView();
        mRefreshLayout = getMvpView().getRefreshLayout();

        initBannerData();
        initRecyclerView();
    }

    private void initBannerData(){
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
        mBanner.setDelayTime(3000);
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
                //Log.d(TAG, "onCompleted: " + System.currentTimeMillis());
                System.out.println("onCompleted: finish");
            }

            @Override
            public void onError(Throwable e) {
                // Log.d(TAG, "onError: finish");
                System.out.println("onError: finish");
            }

            @Override
            public void onNext(BannerBean bannerBean) {
                //Log.d(TAG, "     onNext: " + System.currentTimeMillis());
                System.out.println("onNext: " + bannerBean.toString());

                List<BannerDetail> items = bannerBean.getItems();
                for(BannerDetail detail : items){
                    dealTitles.add(detail.getPost_title());
                    imageUrls.add(detail.getSlide_thumb());
                    dealUrls.add(API.OFFICIAL_URL +detail.getPost_url());
                }

                mBanner.setImages(imageUrls);
                mBanner.setBannerTitles(dealTitles);
                mBanner.start();
            }
        },System.currentTimeMillis());
    }

    private void initRecyclerView(){

        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        GridLayoutManager manager = new GridLayoutManager(mContext, 2);
        mRecyclerView.setLayoutManager(manager);
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if(position == 0){
                    return 2;
                }
                return 1;
            }
        });
        HomeModel.getHomeData(new Subscriber<HomeBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(HomeBean bean) {
                //Log.d(TAG, "onNext: " + bean.toString());
                List<Home> items = bean.getItems();
                HomeListAdapter adapter = new HomeListAdapter(mContext, items, getMvpView().getHeader());
                mRecyclerView.setAdapter(adapter);
            }
        },1,System.currentTimeMillis());
    }
}
