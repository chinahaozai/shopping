package com.halewang.shopping.view;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

/**
 * Created by halewang on 2016/12/6.
 */

public interface MainView extends BaseView{
    TabLayout getTabLayout();
    ViewPager getViewPager();
}
