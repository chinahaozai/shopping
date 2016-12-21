package com.halewang.shopping.view.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import com.halewang.shopping.view.BaseView;

/**
 * Created by halewang on 2016/12/21.
 */

public interface HotView extends BaseView{
    RecyclerView getRecyclerView();
    SwipeRefreshLayout getRefreshLayout();
    void showLoadMore();
    void hideLoadMore();
}
