package com.halewang.shopping.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.halewang.shopping.R;
import com.halewang.shopping.presenter.ShaidanPresenter;
import com.halewang.shopping.view.fragment.ShaidanView;

/**
 * Created by halewang on 2016/12/19.
 */

public class ShaidanFragment extends BaseFragment<ShaidanView,ShaidanPresenter> implements ShaidanView{

    private static final String TAG = "ShaidanFragment";
    private View mView;
    private Context mContext;

    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mRefreshLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_shaidan,container,false);
        mRecyclerView = (RecyclerView) mView.findViewById(R.id.recyclerview_shaidan);
        mRefreshLayout = (SwipeRefreshLayout) mView.findViewById(R.id.refresh_shaidan);
        mContext = getActivity();
        Log.d(TAG, "onCreateView: finish" + System.currentTimeMillis());
        return mView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public ShaidanPresenter initPresenter() {
        return new ShaidanPresenter(mContext);
    }

    @Override
    public RecyclerView getRecyclerView() {
        return mRecyclerView;
    }

    @Override
    public SwipeRefreshLayout getRefreshLayout() {
        return mRefreshLayout;
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
