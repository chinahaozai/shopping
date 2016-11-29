package com.halewang.shopping;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.cjj.MaterialRefreshLayout;
import com.cjj.MaterialRefreshListener;
import com.halewang.shopping.presenter.ProductDetailPresenter;
import com.halewang.shopping.view.ProductDetailView;

public class ProductDetailActivity extends BaseActivity<ProductDetailView,ProductDetailPresenter>
        implements ProductDetailView{

    private WebView mWebView;
    private TextView mTitle;
    private ProgressBar mProgress;
    private MaterialRefreshLayout mMaterialRefreshLayout;
    private String url;
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        url = getUrl();
        title = getBrand();
        setupToolbar();

        initView();
        initWebView();
        initRefreshLayout();
    }

    void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(!TextUtils.isEmpty(title)) {
            toolbar.setTitle(title);
        }else{
            toolbar.setTitle("商品详情");
        }
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //onBackPressed();
                finish();
            }
        });
    }

    private String getUrl(){
        Intent intent = getIntent();
        return intent.getBundleExtra("detail").getString("url");
    }
    private String getBrand(){
        Intent intent = getIntent();
        return intent.getBundleExtra("detail").getString("brand");
    }

    /**
     * 初始化View
     */
    private void initView() {
        //mTitle = (TextView) findViewById(R.id.title);
        mProgress = (ProgressBar) findViewById(R.id.Progress);
        mWebView = (WebView) findViewById(R.id.webview);
        mMaterialRefreshLayout = (MaterialRefreshLayout) findViewById(R.id.refresh);
    }

    /**
     * 初始化WebView
     */
    private void initWebView() {
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setBlockNetworkImage(false);
        mWebView.loadUrl(url);
        mWebView.setWebViewClient(new MyWebviewClient());
        mWebView.setWebChromeClient(new MyChromeClient());
    }
    /**
     * 初始化RefreshLayout刷新
     * 不解释，相关的请看文章头部的MaterialRefreshLayout的连接
     */
    private void initRefreshLayout() {
        //mMaterialRefreshLayout.setProgressColors(new int[]{R.color.colorProgress,R.color.colorProgress2});
        mMaterialRefreshLayout.setMaterialRefreshListener(new MaterialRefreshListener() {
            @Override
            public void onRefresh(MaterialRefreshLayout materialRefreshLayout) {
                //下拉刷新停止
                mWebView.loadUrl(mWebView.getUrl());
                mMaterialRefreshLayout.finishRefresh();
            }
        });
    }

    /**
     * 重写MyWebviewClient方法
     *
     * shouldOverrideUrlLoading（） 拦截网页跳转，是之继续在WebView中进行跳转
     * onPageStarted（） 开始加载的时候（显示进度条）
     * onPageFinished（） 夹在结束的时候（隐藏进度条）
     */
    private class MyWebviewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return false;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            mProgress.setVisibility(View.VISIBLE);

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            mProgress.setVisibility(View.GONE);

        }
    }
    /**
     * 重写MyChromeClient方法
     *
     * onProgressChanged（） 设置动态进度条
     * onReceivedTitle（） 设置WebView的头部标题
     * onReceivedIcon（）  设置WebView的头部图标
     */
    private class MyChromeClient extends WebChromeClient {
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
            mProgress.setProgress(newProgress);

        }

        @Override
        public void onReceivedTitle(WebView view, String title) {
            super.onReceivedTitle(view, title);
            //mTitle.setText(title);
        }

        @Override
        public void onReceivedIcon(WebView view, Bitmap icon) {
            super.onReceivedIcon(view, icon);
        }
    }

    /**
     * 实现WebView的回退栈
     *
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode== KeyEvent.KEYCODE_BACK && mWebView.canGoBack()){
            mWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public ProductDetailPresenter initPresenter() {
        return new ProductDetailPresenter();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading(boolean isFirstLoad) {

    }

    @Override
    public void showErr(String err) {

    }
}
