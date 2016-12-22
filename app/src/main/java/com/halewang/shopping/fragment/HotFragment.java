package com.halewang.shopping.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.halewang.shopping.ProductDetailActivity;
import com.halewang.shopping.R;
import com.halewang.shopping.adapter.HotListAdapter;
import com.halewang.shopping.global.API;
import com.halewang.shopping.model.bean.hot.Hot;
import com.halewang.shopping.model.bean.hot.HotBean;
import com.halewang.shopping.model.bean.hot.HotModel;
import com.halewang.shopping.presenter.HotPresenter;
import com.halewang.shopping.view.fragment.HotView;

import java.util.List;

import rx.Subscriber;

/**
 * Created by halewang on 2016/12/19.
 */

public class HotFragment extends BaseFragment<HotView,HotPresenter> implements HotView{

    private static final String TAG = "HotFragment";

    private View mView;
    private Context mContext;

    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mRefreshLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_hot,container,false);
        mRecyclerView = (RecyclerView) mView.findViewById(R.id.recyclerview_hot);
        mRefreshLayout = (SwipeRefreshLayout) mView.findViewById(R.id.refresh_hot);
        mContext = getActivity();
        Log.d(TAG, "onCreateView: finish" + System.currentTimeMillis());
        return mView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);

    }

    @Override
    public HotPresenter initPresenter() {
        return new HotPresenter(mContext);
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
