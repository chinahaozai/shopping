package com.halewang.shopping.view;

import android.webkit.WebView;
import android.widget.ProgressBar;

/**
 * Created by halewang on 2016/11/29.
 */

public interface ProductDetailView extends BaseView{
    WebView getWebView();
    String getShow_url();
    ProgressBar getProgressBar();
}
