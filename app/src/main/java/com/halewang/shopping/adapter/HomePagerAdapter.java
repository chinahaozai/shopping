package com.halewang.shopping.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import java.util.List;

/**
 * Created by halewang on 2016/12/19.
 */

public class HomePagerAdapter extends FragmentStatePagerAdapter{
    private List<Fragment> mFragments;
    private List<String> mTabs;

    public HomePagerAdapter(FragmentManager fm, List<Fragment> mFragments, List<String> mTabs) {
        super(fm);
        this.mFragments = mFragments;
        this.mTabs = mTabs;

    }

    @Override
    public Fragment getItem(int position) {
        Log.d("halewang", "call getItem( " + position + " )");
        return mFragments.get(position);
    }


    @Override
    public int getCount() {
        return mTabs.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabs.get(position);
    }
}
