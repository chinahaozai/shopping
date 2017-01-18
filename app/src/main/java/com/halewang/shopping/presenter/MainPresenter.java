package com.halewang.shopping.presenter;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.halewang.shopping.MainActivity;
import com.halewang.shopping.adapter.HomePagerAdapter;
import com.halewang.shopping.fragment.HeatFragment;
import com.halewang.shopping.fragment.HomeFragment;
import com.halewang.shopping.fragment.HotFragment;
import com.halewang.shopping.fragment.ShaidanFragment;
import com.halewang.shopping.view.MainView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by halewang on 2016/12/6.
 */

public class MainPresenter extends BasePresenter<MainView>{

    private static final String TAG = "MainPresenter";

    private Context mContext;
    private List<String> dealTitles;
    private List<String> imageUrls;
    private List<String> dealUrls;
    private List<String> mTabs;
    private List<Fragment> mFragments;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    //private Banner mBanner;

    public MainPresenter(Context context){
        mContext = context;
    }

    @Override
    public void onStart() {
        super.onStart();
        //initBannerData2();
        initTabLayout();
        initViewPager();
    }

    private void initTabLayout(){
        mTabLayout = getMvpView().getTabLayout();
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabs = new ArrayList<>();
        mTabs.add("首页");
        mTabs.add("晒单");
        mTabs.add("人气");
        mTabs.add("热门");
    }

    private void initViewPager(){
        mViewPager = getMvpView().getViewPager();
        mViewPager.setOffscreenPageLimit(4);
        mFragments = new ArrayList<>();
        mFragments.add(new HomeFragment());
        mFragments.add(new ShaidanFragment());
        mFragments.add(new HeatFragment());
        mFragments.add(new HotFragment());

        MainActivity activity = (MainActivity) mContext;
        HomePagerAdapter mAdapter = new HomePagerAdapter(activity.getSupportFragmentManager(), mFragments, mTabs);
        mViewPager.setAdapter(mAdapter);
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabs.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabs.get(1)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabs.get(2)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabs.get(3)));
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabsFromPagerAdapter(mAdapter);
    }

}
