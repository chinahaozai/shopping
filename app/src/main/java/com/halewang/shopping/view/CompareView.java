package com.halewang.shopping.view;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

/**
 * Created by halewang on 2016/11/16.
 */

public interface CompareView extends BaseView{

    RecyclerView getRecyclerView();
    ImageView getImageView();
    FloatingActionButton getFloatingActionButton();

}
