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

import com.halewang.shopping.R;
import com.halewang.shopping.presenter.HomePresenter;
import com.halewang.shopping.presenter.HotPresenter;
import com.halewang.shopping.view.fragment.HomeView;
import com.halewang.shopping.view.fragment.HotView;
import com.youth.banner.Banner;

/**
 * Created by halewang on 2016/12/19.
 */

public class HomeFragment extends BaseFragment<HomeView,HomePresenter> implements HomeView{

    private static final String TAG = "HomeFragment";
    private RecyclerView mRecyclerView;
    //private Banner mBanner;
    private SwipeRefreshLayout mRefreshLayout;
    private View header;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        header = inflater.inflate(R.layout.item_home_header, container, false);
        View view = inflater.inflate(R.layout.fragment_home,container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerview_home);
        //mBanner = (Banner) view.findViewById(R.id.banner_home);
        mRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.refresh_home);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public HomePresenter initPresenter() {
        Log.d(TAG, "initPresenter: finish");

        return new HomePresenter(getActivity());
    }

    /*@Override
    public Banner getBanner() {
        return mBanner;
    }*/

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
    @Override
    public View getHeader(){
        return header;
    }
}
