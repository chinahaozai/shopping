package com.halewang.shopping.view;

/**
 * Created by halewang on 2016/11/16.
 */

public interface BaseView {
    /**
     * 显示进度条
     */
    void showLoading();
    /**
     * 隐藏进度条
     */
    void hideLoading();
    /**
     * 显示加载错误
     * @param err 错误内容
     */
    void showErr(String err);
}
