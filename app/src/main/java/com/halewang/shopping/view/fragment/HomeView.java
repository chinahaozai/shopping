package com.halewang.shopping.view.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.halewang.shopping.view.BaseView;
import com.youth.banner.Banner;

/**
 * Created by halewang on 2016/12/21.
 */

public interface HomeView extends BaseView{
    RecyclerView getRecyclerView();
    //Banner getBanner();
    View getHeader();
    SwipeRefreshLayout getRefreshLayout();
    void showLoadMore();
    void hideLoadMore();
}
