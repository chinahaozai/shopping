package com.halewang.shopping.presenter;

import com.halewang.shopping.view.BaseView;

/**
 * Created by halewang on 2016/11/16.
 * 这是个基础接口
 * 用来接收BaseView的子类
 */

public interface Presenter<V extends BaseView> {
    /**
     * presenter和对应的view绑定
     * @param mvpView  目标view
     */
    void attachView(V mvpView);
    /**
     * presenter与view解绑
     */
    void detachView();

    void onStart();

}
