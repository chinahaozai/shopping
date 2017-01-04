package com.halewang.shopping.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.halewang.shopping.ProductDetailActivity;
import com.halewang.shopping.ProductDetailActivity2;
import com.halewang.shopping.R;
import com.halewang.shopping.adapter.ShaidanListAdapter2;
import com.halewang.shopping.global.API;
import com.halewang.shopping.model.bean.home.HomeBean;
import com.halewang.shopping.model.bean.shaidan.Shaidan;
import com.halewang.shopping.model.bean.shaidan.ShaidanBean;
import com.halewang.shopping.model.bean.shaidan.ShaidanModel;
import com.halewang.shopping.utils.InternetUtil;
import com.halewang.shopping.view.fragment.ShaidanView;

import java.util.List;

import rx.Subscriber;

/**
 * Created by halewang on 2016/12/22.
 */

public class ShaidanPresenter extends BasePresenter<ShaidanView> {

    private Context mContext;
    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mRefreshLayout;
    private ShaidanListAdapter2 mAdapter;
    private int currentPage = 1;

    public ShaidanPresenter(Context context) {
        mContext = context;
    }

    @Override
    public void onStart() {
        super.onStart();
        mRecyclerView = getMvpView().getRecyclerView();
        mRefreshLayout = getMvpView().getRefreshLayout();
        initRefresh();
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        ShaidanModel.getShaidanData(new Subscriber<ShaidanBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(ShaidanBean bean) {
                final List<Shaidan> items = bean.getItems();
                /*ShaidanListAdapter adapter = new ShaidanListAdapter(mContext, items);
                adapter.setOnItemClickListener(new ShaidanListAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Intent intent = new Intent(mContext, ProductDetailActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("url", API.OFFICIAL_URL +items.get(position).getShow_url());
                        bundle.putString("brand", "");
                        intent.putExtra("detail", bundle);
                        mContext.startActivity(intent);
                    }
                });*/
                mRecyclerView.addOnItemTouchListener(new OnItemChildClickListener() {
                    @Override
                    public void onSimpleItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                        Shaidan shaidan = (Shaidan) adapter.getItem(position);
                        switch (view.getId()) {
                            case R.id.shaidan_item:
                                Intent intent = new Intent(mContext, ProductDetailActivity2.class);
                                Bundle bundle = new Bundle();
                                bundle.putString("url", API.OFFICIAL_URL + shaidan.getShow_url());
                                bundle.putString("brand", "");
                                intent.putExtra("detail", bundle);
                                mContext.startActivity(intent);
                                break;
                            default:
                                break;
                        }
                    }
                });
                mAdapter = new ShaidanListAdapter2(items);
                mAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
                mAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
                    @Override
                    public void onLoadMoreRequested() {
                        loadMore();
                    }
                });
                mRecyclerView.setAdapter(mAdapter);
            }
        }, 1, System.currentTimeMillis());
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
                    ShaidanModel.getShaidanData(new Subscriber<ShaidanBean>() {
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
                        public void onNext(ShaidanBean bean) {
                            mAdapter.refreshData(bean.getItems());
                        }
                    }, 1, System.currentTimeMillis());
                }
            }
        });
    }

    private void loadMore(){
        ShaidanModel.getShaidanData(new Subscriber<ShaidanBean>() {
            @Override
            public void onCompleted() {
                mAdapter.loadMoreComplete();
            }

            @Override
            public void onError(Throwable e) {
                mAdapter.loadMoreFail();
            }

            @Override
            public void onNext(ShaidanBean bean) {
                mAdapter.addData(bean.getItems());
            }
        }, ++currentPage, System.currentTimeMillis());
    }
}
