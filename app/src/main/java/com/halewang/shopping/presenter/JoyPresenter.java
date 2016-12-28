package com.halewang.shopping.presenter;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.halewang.shopping.adapter.JoyListAdapter;
import com.halewang.shopping.model.bean.joy.Joy;
import com.halewang.shopping.model.bean.joy.JoyBean;
import com.halewang.shopping.model.bean.joy.JoyModel;
import com.halewang.shopping.model.bean.randjoy.RandJoyBean;
import com.halewang.shopping.model.bean.randjoy.RandJoyModel;
import com.halewang.shopping.utils.InternetUtil;
import com.halewang.shopping.view.JoyView;

import java.util.List;

import rx.Subscriber;

/**
 * Created by halewang on 2016/11/16.
 */

public class JoyPresenter extends BasePresenter<JoyView> {

    private static final String TAG = "JoyPresenter";

    private Context mContext;
    private boolean isLoading = false;

    private Subscriber<JoyBean> mSubscriber = new Subscriber<JoyBean>() {
        @Override
        public void onCompleted() {
            getMvpView().hideLoading(false);    //这里传true or false都一样 不做特殊处理
        }

        @Override
        public void onError(Throwable e) {
            getMvpView().showErr(e.toString());
        }

        @Override
        public void onNext(JoyBean bean) {
            List<Joy> joys = bean.getResult().getData();
            mAdapter = new JoyListAdapter(mContext, joys);
            getMvpView().getRecyclerView().setAdapter(mAdapter);
        }
    };

    private JoyListAdapter mAdapter;

    public JoyPresenter(Context context) {
        mContext = context;
        getJoyList();

    }

    @Override
    public void onStart() {
        super.onStart();
        getMvpView().getRecyclerView().addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();

                int totalItemCount = layoutManager.getItemCount();

                int lastVisibleItem = layoutManager.findLastVisibleItemPosition();
                /*Log.d(TAG, "totalItemCount: " + totalItemCount);
                Log.d(TAG, "lastVisibleItem: " + lastVisibleItem);*/
                if (!isLoading && totalItemCount < (lastVisibleItem + 2)) {
                    getMvpView().onLoadMore();
                    loadMore(true);
                    isLoading = true;
                }
            }
        });
        RecyclerView.ItemAnimator animator = new DefaultItemAnimator();
        animator.setChangeDuration(0);
        getMvpView().getRecyclerView().setItemAnimator(animator);

        initRefresh();
    }

    private void initRefresh() {
        getMvpView().getSwipeRefreshLayout().setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if (!InternetUtil.isNetworkAvailable(mContext)) {
                    Snackbar.make(getMvpView().getSwipeRefreshLayout(), "网络连接失败，请检测手机网络连接",
                            Snackbar.LENGTH_LONG).setAction("Action", null).show();
                }else {
                    loadMore(false);
                }
            }
        });
    }

    private void getJoyList() {
        JoyModel.getJoyList(mSubscriber, 1, 20);
    }

    /**
     * 加载更多数据
     *
     * @param isLoadMore true是加载更多,false是刷新数据
     */
    private void loadMore(final boolean isLoadMore) {
        Log.d(TAG, "loadMore: " + "finish");
        RandJoyModel.getRandJoyList(new Subscriber<RandJoyBean>() {
            @Override
            public void onCompleted() {
                Log.d(TAG, "onCompleted: finish");
                if (isLoadMore) {
                    getMvpView().onLoadMoreFinish();
                    isLoading = false;
                } else {
                    getMvpView().hideLoading(false);
                }
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: finish");
                getMvpView().showErr(e.toString());
            }

            @Override
            public void onNext(RandJoyBean bean) {
                Log.d(TAG, "onNext: finish");
                List<Joy> result = bean.getResult();
                if (isLoadMore) {
                    mAdapter.addAll(result);
                } else {
                    mAdapter.refreshData(result);
                }
            }
        });
    }
}
