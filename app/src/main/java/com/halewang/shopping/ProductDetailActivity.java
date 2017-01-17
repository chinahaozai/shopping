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
import android.widget.Toast;

import com.cjj.MaterialRefreshLayout;
import com.cjj.MaterialRefreshListener;
import com.halewang.shopping.model.bean.user.Collection;
import com.halewang.shopping.presenter.ProductDetailPresenter;
import com.halewang.shopping.utils.PrefUtil;
import com.halewang.shopping.view.ProductDetailView;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

public class ProductDetailActivity extends BaseActivity<ProductDetailView,ProductDetailPresenter>
        implements ProductDetailView{

    private static final String TAG = "ProductDetailActivity";
    private WebView mWebView;
    private ProgressBar mProgress;
    private MaterialRefreshLayout mMaterialRefreshLayout;
    private String show_title;
    private String show_url;
    private String buy_url;
    private String image_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        ShareSDK.initSDK(this);

        show_title = getShow_title();
        show_url = getShow_url();
        buy_url = getBuy_url();
        image_url = getImage_url();
        setupToolbar();
        initView();
        initRefreshLayout();
        presenter.onStart();
    }

    void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(!TextUtils.isEmpty(show_title)) {
            toolbar.setTitle(show_title);
        }else{
            toolbar.setTitle(R.string.product_detail);
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

    private String getShow_title(){
        return getIntent().getBundleExtra("detail").getString(ProductDetailActivity2.TITLE);
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

    public String getShow_url() {
        return getIntent().getBundleExtra("detail").getString(ProductDetailActivity2.SHOW_URL);
    }

    private String getBuy_url(){
        return getIntent().getBundleExtra("detail").getString(ProductDetailActivity2.BUY_URL);
    }

    private String getImage_url(){
        return getIntent().getBundleExtra("detail").getString(ProductDetailActivity2.IMAGE_URL);
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
            case R.id.deal_collection:
                doCollection();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    private void showShareView() {
        Log.d(TAG, "showShareView: " + show_url);
        OnekeyShare oks = new OnekeyShare();
        //关闭sso授权
        oks.disableSSOWhenAuthorize();

        // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间等使用
        oks.setTitle(show_url);
        // titleUrl是标题的网络链接，QQ和QQ空间等使用
        oks.setTitleUrl(show_url);
        // text是分享文本，所有平台都需要这个字段
        oks.setText("这太便宜了，快来买吧。" + show_url);
        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
        //oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
        // url仅在微信（包括好友和朋友圈）中使用
        oks.setUrl(show_url);
        // comment是我对这条分享的评论，仅在人人网和QQ空间使用
        oks.setComment("这太便宜了，快来买吧。" + show_url);
        // site是分享此内容的网站名称，仅在QQ空间使用
        oks.setSite(getString(R.string.app_name));
        // siteUrl是分享此内容的网站地址，仅在QQ空间使用
        oks.setSiteUrl(show_url);

        // 启动分享GUI
        oks.show(this);
    }

    private void doCollection(){
        if(PrefUtil.getBoolean(this,LoginActivity.IS_ONLINE,false)){
            Collection collection = new Collection();
            collection.setPhone(PrefUtil.getString(this,LoginActivity.PHONE,""));
            collection.setShow_url(show_url);
            collection.setBuy_url(buy_url);
            collection.setImage_url(image_url);
            collection.setShow_title(show_title);
            collection.save(new SaveListener<String>() {
                @Override
                public void done(String s, BmobException e) {
                    if(e == null){
                        Toast.makeText(ProductDetailActivity.this,"已收藏",Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(ProductDetailActivity.this,"收藏失败，请检测网络",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }else{
            startActivity(new Intent(this,LoginActivity.class));
        }
    }
}
