package com.halewang.shopping.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.halewang.shopping.R;
import com.halewang.shopping.presenter.HeatPresenter;
import com.halewang.shopping.view.fragment.HeatView;

/**
 * Created by halewang on 2017/1/3.
 */

public class HeatFragment extends BaseFragment<HeatView,HeatPresenter> implements HeatView{

    private View mView;
    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mRefreshLayout;
    private Context mContext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_heat,container,false);
        mRecyclerView = (RecyclerView) mView.findViewById(R.id.recyclerview_heat);
        mRefreshLayout = (SwipeRefreshLayout) mView.findViewById(R.id.refresh_heat);
        mContext = getActivity();
        return mView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public HeatPresenter initPresenter() {
        return new HeatPresenter(mContext);
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
        mRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                mRefreshLayout.setRefreshing(false);
            }
        });
    }

    @Override
    public void showErr(String err) {

    }
}
