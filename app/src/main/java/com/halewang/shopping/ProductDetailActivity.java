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
    private ProgressBar mProgress;
    private MaterialRefreshLayout mMaterialRefreshLayout;
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        title = getBrand();
        setupToolbar();

        initView();
        initRefreshLayout();
        presenter.onStart();
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
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private String getBrand(){
        Intent intent = getIntent();
        return intent.getBundleExtra("detail").getString("brand");
    }

    /**
     * 初始化View
     */
    private void initView() {
        mProgress = (ProgressBar) findViewById(R.id.Progress);
        mWebView = (WebView) findViewById(R.id.webview);
        mMaterialRefreshLayout = (MaterialRefreshLayout) findViewById(R.id.refresh);
    }

    /**
     * 初始化RefreshLayout刷新
     */
    private void initRefreshLayout() {
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
        return new ProductDetailPresenter(this);
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

    @Override
    public WebView getWebView() {
        return mWebView;
    }

    @Override
    public ProgressBar getProgressBar() {
        return mProgress;
    }

    @Override
    public String getUrl() {
        Intent intent = getIntent();
        return intent.getBundleExtra("detail").getString("url");
    }
}
