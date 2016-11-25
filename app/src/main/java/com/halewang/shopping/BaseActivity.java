package com.halewang.shopping;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.halewang.shopping.presenter.Presenter;
import com.halewang.shopping.view.BaseView;

/**
 * Created by halewang on 2016/11/16.
 */

public abstract class BaseActivity<V extends BaseView, P extends Presenter<V>> extends AppCompatActivity{

    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = initPresenter();

    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.attachView((V)this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    // 实例化presenter
    public abstract P initPresenter();
}
