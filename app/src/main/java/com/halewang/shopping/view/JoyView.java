package com.halewang.shopping.view;

import android.support.v7.widget.RecyclerView;

/**
 * Created by halewang on 2016/11/16.
 */

public interface JoyView extends BaseView {

    RecyclerView getRecyclerView();

    void onLoadMore();
    void onLoadMoreFinish();

}
