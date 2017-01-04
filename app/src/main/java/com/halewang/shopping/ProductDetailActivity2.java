package com.halewang.shopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.halewang.shopping.presenter.ProductDetailPresenter;
import com.halewang.shopping.view.ProductDetailView;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

public class ProductDetailActivity2 extends BaseActivity<ProductDetailView,ProductDetailPresenter>
        implements ProductDetailView{

    private static final String TAG = "ProductDetailActivity";
    private WebView mWebView;
    private ProgressBar mProgress;
    private String title;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail2);

        ShareSDK.initSDK(this);

        title = getBrand();
        url = getUrl();
        setupToolbar();
        initView();
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_product_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.deal_share:
                showShareView();
                return true;
            default:

                return super.onOptionsItemSelected(item);

        }
    }

    private void showShareView() {
        Log.d(TAG, "showShareView: " + url);
        OnekeyShare oks = new OnekeyShare();
        //关闭sso授权
        oks.disableSSOWhenAuthorize();

        // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间等使用
        oks.setTitle(title);
        // titleUrl是标题的网络链接，QQ和QQ空间等使用
        oks.setTitleUrl(url);
        // text是分享文本，所有平台都需要这个字段
        oks.setText("这太便宜了，快来买吧。" + url);
        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
        //oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
        // url仅在微信（包括好友和朋友圈）中使用
        oks.setUrl(url);
        // comment是我对这条分享的评论，仅在人人网和QQ空间使用
        oks.setComment("这太便宜了，快来买吧。" + url);
        // site是分享此内容的网站名称，仅在QQ空间使用
        oks.setSite(getString(R.string.app_name));
        // siteUrl是分享此内容的网站地址，仅在QQ空间使用
        oks.setSiteUrl(url);

        // 启动分享GUI
        oks.show(this);
    }
}
