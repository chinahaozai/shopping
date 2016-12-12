package com.halewang.shopping.presenter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.halewang.shopping.adapter.JoyListAdapter;
import com.halewang.shopping.model.bean.joy.Joy;
import com.halewang.shopping.model.bean.joy.JoyBean;
import com.halewang.shopping.model.bean.joy.JoyModel;
import com.halewang.shopping.model.bean.randjoy.RandJoyBean;
import com.halewang.shopping.model.bean.randjoy.RandJoyModel;
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
            JoyListAdapter adapter = new JoyListAdapter(mContext, joys);
            getMvpView().getRecyclerView().setAdapter(adapter);
        }
    };

    private Subscriber<RandJoyBean> mRandJoyBeanSubscriber = new Subscriber<RandJoyBean>() {
        @Override
        public void onCompleted() {
            getMvpView().onLoadMoreFinish();
            isLoading = false;
        }

        @Override
        public void onError(Throwable e) {
            getMvpView().showErr(e.toString());
        }

        @Override
        public void onNext(RandJoyBean bean) {
            List<Joy> result = bean.getResult();
            for (Joy randJoy : result) {
                Log.d(TAG, "RandJoy: " + randJoy.getContent());
                Log.d(TAG, "RandJoyPicUrl: " + randJoy.getUrl());
            }
        }
    };

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

                if (!isLoading && totalItemCount < (lastVisibleItem + 2)) {
                    getMvpView().onLoadMore();
                    loadMore();
                    isLoading = true;
                }
            }
        });
    }

    private void getJoyList() {
        JoyModel.getJoyList(mSubscriber, 1, 20);
    }

    private void loadMore() {
        Log.d(TAG, "loadMore: " + "finish");
        RandJoyModel.getRandJoyList(mRandJoyBeanSubscriber);
    }
}
