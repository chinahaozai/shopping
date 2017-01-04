package com.halewang.shopping.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.halewang.shopping.ProductDetailActivity;
import com.halewang.shopping.R;
import com.halewang.shopping.adapter.HeatListAdapter;
import com.halewang.shopping.adapter.HotListAdapter2;
import com.halewang.shopping.global.API;
import com.halewang.shopping.model.bean.heat.Heat;
import com.halewang.shopping.model.bean.heat.HeatBean;
import com.halewang.shopping.model.bean.heat.HeatModel;
import com.halewang.shopping.model.bean.hot.Hot;
import com.halewang.shopping.model.bean.hot.HotBean;
import com.halewang.shopping.model.bean.hot.HotModel;
import com.halewang.shopping.view.fragment.HeatView;
import com.halewang.shopping.view.fragment.HotView;

import java.util.List;

import rx.Subscriber;

/**
 * Created by halewang on 2016/12/21.
 */

public class HeatPresenter extends BasePresenter<HeatView> {

    private static final String TAG = "HeatPresenter";
    private Context mContext;
    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mRefreshLayout;
    private HeatListAdapter mAdapter;
    private int start = 0;
    private int count = 20;

    private Subscriber<HeatBean> mSubscriber = new Subscriber<HeatBean>() {
        @Override
        public void onCompleted() {
        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(HeatBean bean) {
            final List<Heat> items = bean.getProducts();
            mAdapter = new HeatListAdapter(items);
            mAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_BOTTOM);
            mAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
                @Override
                public void onLoadMoreRequested() {
                    loadMore();
                }
            });
            mRecyclerView.setAdapter(mAdapter);
        }
    };

    public HeatPresenter(Context context) {
        mContext = context;
        //Log.d(TAG, "  HotPresenter:" + System.currentTimeMillis());
    }

    @Override
    public void onStart() {
        super.onStart();
        //Log.d(TAG, "onStart: finish" + System.currentTimeMillis());
        initRecyclerView();
        initRefresh();
    }

    private void initRecyclerView() {
        mRecyclerView = getMvpView().getRecyclerView();
        mRefreshLayout = getMvpView().getRefreshLayout();
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.addOnItemTouchListener(new OnItemChildClickListener() {
            @Override
            public void onSimpleItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                Heat heat = (Heat) adapter.getItem(position);
                switch (view.getId()) {
                    case R.id.heat_item:
                        Intent intent = new Intent(mContext, ProductDetailActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("url", heat.getBuyaddr());
                        bundle.putString("brand", "");
                        intent.putExtra("detail", bundle);
                        mContext.startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });
        HeatModel.getHeatList(mSubscriber, start, count);
    }

    private void initRefresh() {
        Log.d(TAG, "initRefresh: finish");
        System.out.println("initRefresh: finish");
        mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                System.out.println("刷新监听已触发");
                HeatModel.getHeatList(new Subscriber<HeatBean>() {
                    @Override
                    public void onCompleted() {
                        getMvpView().hideLoading(false);
                        start = 0;
                    }

                    @Override
                    public void onError(Throwable e) {
                        getMvpView().showErr(e.toString());
                    }

                    @Override
                    public void onNext(HeatBean bean) {
                        mAdapter.refreshData(bean.getProducts());
                        Log.d(TAG, "onNext: 刷新数据条目数" + bean.getProducts().size());
                        System.out.println("刷新数据条目数" + bean.getProducts().size());
                    }
                }, 0, count);
            }
        });
    }

    private void loadMore() {

        HeatModel.getHeatList(new Subscriber<HeatBean>() {
            @Override
            public void onCompleted() {
                getMvpView().hideLoading(false);
                start += count;
                mAdapter.loadMoreComplete();
                System.out.println("加载更多OnCompleted完成");
            }

            @Override
            public void onError(Throwable e) {
                getMvpView().showErr(e.toString());
                mAdapter.loadMoreFail();
            }

            @Override
            public void onNext(HeatBean bean) {
                mAdapter.addData(bean.getProducts());
                System.out.println("加载更多OnNext完成");
            }
        }, start + count, count);
    }
}
