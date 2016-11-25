package com.halewang.shopping.presenter;

import com.halewang.shopping.view.BaseView;

/**
 * Created by halewang on 2016/11/16.
 */

public class BasePresenter<V extends BaseView> implements Presenter<V> {

    private V mView;

    @Override
    public void attachView(V view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    /**
     * 判断 view是否为空
     *
     * @return
     */
    public boolean isAttachView() {
        return mView != null;
    }

    /**
     * 返回目标view
     *
     * @return
     */
    public V getMvpView() {
        return mView;
    }

    @Override
    public void onResume() {

    }
}
