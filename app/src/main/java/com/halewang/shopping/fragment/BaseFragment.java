package com.halewang.shopping.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.halewang.shopping.presenter.Presenter;
import com.halewang.shopping.view.BaseView;

/**
 * Created by halewang on 2016/12/19.
 */

public abstract class BaseFragment<V extends BaseView, P extends Presenter<V>> extends Fragment {

    private static final String TAG = "BaseFragment";
    protected P mPresenter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mPresenter = initPresenter();
        if(mPresenter != null) {
            Log.d(TAG, "onViewCreated:mPresenter created");
            mPresenter.attachView((V) this);
            mPresenter.onStart();
            Log.d(TAG, "onViewCreated: mPresenter onStart called");
        }else{
            Log.d(TAG, "onViewCreated: mPresenter is null");
        }
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mPresenter != null) {
            mPresenter.detachView();
        }
    }

    public abstract P initPresenter();
}
