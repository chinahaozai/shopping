package com.halewang.shopping.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.halewang.shopping.presenter.Presenter;
import com.halewang.shopping.view.BaseView;

/**
 * Created by halewang on 2016/12/19.
 */

public abstract class BaseFragment<V extends BaseView, P extends Presenter<V>> extends Fragment {

    protected P mPresenter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mPresenter = initPresenter();
        if(mPresenter != null) {
            mPresenter.attachView((V) this);
            mPresenter.onStart();
        }
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

    public abstract P initPresenter();
}
