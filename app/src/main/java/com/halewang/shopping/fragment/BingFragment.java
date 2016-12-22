package com.halewang.shopping.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.halewang.shopping.presenter.HotPresenter;
import com.halewang.shopping.view.fragment.HotView;

/**
 * Created by halewang on 2016/12/19.
 */

public class BingFragment extends BaseFragment<HotView,HotPresenter> implements HotView{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText("我是必应页");
        return textView;
    }

    @Override
    public HotPresenter initPresenter() {
        return null;
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
