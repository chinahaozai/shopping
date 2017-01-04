package com.halewang.shopping.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.halewang.shopping.ProductDetailActivity2;
import com.halewang.shopping.R;
import com.halewang.shopping.adapter.HomeListAdapter;
import com.halewang.shopping.global.API;
import com.halewang.shopping.model.bean.banner.BannerBean;
import com.halewang.shopping.model.bean.banner.BannerDetail;
import com.halewang.shopping.model.bean.banner.BannerModel;
import com.halewang.shopping.model.bean.home.Home;
import com.halewang.shopping.model.bean.home.HomeBean;
import com.halewang.shopping.model.bean.home.HomeModel;
import com.halewang.shopping.utils.InternetUtil;
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

public class HomePresenter extends BasePresenter<HomeView> {

    private static final String TAG = "HomePresenter";

    private Context mContext;
    private RecyclerView mRecyclerView;
    private Banner mBanner;
    private SwipeRefreshLayout mRefreshLayout;

    private List<String> dealTitles;
    private List<String> imageUrls;
    private List<String> dealUrls;
    private HomeListAdapter mAdapter;
    private int currentPage = 1;
    boolean isLoading = false;

    public HomePresenter(Context context) {
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
        initRefresh();
    }

    private void initBannerData() {
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
                Intent intent = new Intent(mContext, ProductDetailActivity2.class);
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
                for (BannerDetail detail : items) {
                    dealTitles.add(detail.getPost_title());
                    imageUrls.add(detail.getSlide_thumb());
                    dealUrls.add(API.OFFICIAL_URL + detail.getPost_url());
                }

                mBanner.setImages(imageUrls);
                mBanner.setBannerTitles(dealTitles);
                mBanner.start();
            }
        }, System.currentTimeMillis());
    }

    private void initRecyclerView() {

        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        GridLayoutManager manager = new GridLayoutManager(mContext, 2);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int totalItemCount = layoutManager.getItemCount();
                int lastVisibleItem = layoutManager.findLastVisibleItemPosition();

                if (!isLoading && totalItemCount < (lastVisibleItem + 3)) {
                    Log.d(TAG, "onScrolled: totalItemCount" + totalItemCount);
                    Log.d(TAG, "onScrolled: lastVisibleItem" + lastVisibleItem);
                    getMvpView().showLoadMore();
                    loadMore();
                    isLoading = true;
                }
            }
        });
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return position == 0 ? 2 : 1;
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
                final List<Home> items = bean.getItems();
                mAdapter = new HomeListAdapter(mContext, items, getMvpView().getHeader());
                mAdapter.setOnItemClickListener(new HomeListAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Intent intent = new Intent(mContext, ProductDetailActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("url", API.OFFICIAL_URL + items.get(position).getPost_url());
                        bundle.putString("brand", "");
                        intent.putExtra("detail", bundle);
                        mContext.startActivity(intent);
                    }
                });
                mRecyclerView.setAdapter(mAdapter);
            }
        }, currentPage, System.currentTimeMillis());
    }

    private void initRefresh() {
        mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if (!InternetUtil.isNetworkAvailable(mContext)) {
                    Snackbar.make(mRefreshLayout, "网络连接失败，请检测手机网络连接",
                            Snackbar.LENGTH_LONG).setAction("Action", null).show();
                    getMvpView().hideLoading(false);

                } else {
                    HomeModel.getHomeData(new Subscriber<HomeBean>() {
                        @Override
                        public void onCompleted() {
                            getMvpView().hideLoading(false);
                            currentPage = 1;
                        }

                        @Override
                        public void onError(Throwable e) {
                            getMvpView().showErr(e.toString());
                            getMvpView().hideLoading(false);
                        }

                        @Override
                        public void onNext(HomeBean bean) {
                            mAdapter.refresh(bean.getItems());
                        }
                    }, 1, System.currentTimeMillis());
                }
            }
        });
    }

    private void loadMore() {
        HomeModel.getHomeData(new Subscriber<HomeBean>() {
            @Override
            public void onCompleted() {
                getMvpView().hideLoadMore();
                isLoading = false;
            }

            @Override
            public void onError(Throwable e) {
                getMvpView().showErr(e.toString());
                getMvpView().hideLoadMore();
                isLoading = false;
            }

            @Override
            public void onNext(HomeBean bean) {
                mAdapter.addAll(bean.getItems());
            }
        }, ++currentPage, System.currentTimeMillis());
    }
}
