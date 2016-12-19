package com.halewang.shopping;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.halewang.shopping.adapter.HomePagerAdapter;
import com.halewang.shopping.fragment.BingFragment;
import com.halewang.shopping.fragment.HomeFragment;
import com.halewang.shopping.fragment.HotFragment;
import com.halewang.shopping.fragment.ShaidanFragment;

import java.util.ArrayList;
import java.util.List;

public class TablaoutTestActivity extends AppCompatActivity {

    List<Fragment> mFragments;
    private TabLayout mTabLayout;
    List<String> mTabs;
    private ViewPager mPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablaout_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("比一比");
        mPager = (ViewPager) findViewById(R.id.viewpager);
        mTabLayout = (TabLayout) findViewById(R.id.tab);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabs = new ArrayList<>();
        mTabs.add("首页");
        mTabs.add("晒单");
        mTabs.add("必应");
        mTabs.add("热门");

        mFragments = new ArrayList<>();
        mFragments.add(new HomeFragment());
        mFragments.add(new ShaidanFragment());
        mFragments.add(new BingFragment());
        mFragments.add(new HotFragment());

        HomePagerAdapter mAdapter = new HomePagerAdapter(this.getSupportFragmentManager(), mFragments, mTabs);
        mPager.setAdapter(mAdapter);
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabs.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabs.get(1)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabs.get(2)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabs.get(3)));
        mTabLayout.setupWithViewPager(mPager);
        mTabLayout.setTabsFromPagerAdapter(mAdapter);

    }
}
