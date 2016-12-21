package com.halewang.shopping.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.halewang.shopping.model.bean.shaidan.ShaidanBean;
import com.halewang.shopping.model.bean.shaidan.ShaidanModel;
import com.halewang.shopping.presenter.HotPresenter;
import com.halewang.shopping.view.fragment.HotView;

import rx.Subscriber;

/**
 * Created by halewang on 2016/12/19.
 */

public class ShaidanFragment extends BaseFragment<HotView,HotPresenter> implements HotView{

    private static final String TAG = "ShaidanFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText("我是晒单页");
        ShaidanModel.getShaidanData(new Subscriber<ShaidanBean>() {
            @Override
            public void onCompleted() {
                Log.d(TAG, "onCompleted: finish");
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: Application occur error");
            }

            @Override
            public void onNext(ShaidanBean bean) {
                Log.d(TAG, "onNext: " + bean.toString());
            }
        },1,System.currentTimeMillis());
        return textView;
    }

    @Override
    public HotPresenter initPresenter() {
        return new HotPresenter(getActivity());
    }

    @Override
    public RecyclerView getRecyclerView() {
        return null;
    }

    @Override
    public SwipeRefreshLayout getRefreshLayout() {
        return null;
    }

    @Override
    public void showLoadMore() {

    }

    @Override
    public void hideLoadMore() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading(boolean isFirstLoad) {

    }

    @Override
    public void showErr(String err) {

    }
}
