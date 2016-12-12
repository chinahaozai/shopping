package com.halewang.shopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.Gson;
import com.halewang.shopping.model.bean.seckill.SeckillBean;
import com.halewang.shopping.presenter.MainPresenter;
import com.halewang.shopping.view.MainView;
import com.search.material.library.MaterialSearchView;
import com.youth.banner.Banner;

import java.io.IOException;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends BaseActivity<MainView, MainPresenter>
        implements MainView, NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "MainActivity";

    private MaterialSearchView mSearchView;
    private NavigationView mNavigationView;
    private DrawerLayout mDrawer;
    private Banner mBanner;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShareSDK.initSDK(this);
        initView();
        initToolbar();
        initMenu();
        initSearchView();

        presenter.onStart();
        new Thread(new Runnable() {
            @Override
            public void run() {
                testMiaosha();

            }
        }).start();
    }

    private void initView() {
        mBanner = (Banner) findViewById(R.id.banner);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    }

    private void initToolbar() {
        setSupportActionBar(mToolbar);
    }

    private void initMenu() {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawer, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.setDrawerListener(toggle);
        toggle.syncState();

        mNavigationView = (NavigationView) findViewById(R.id.nav_view);
        mNavigationView.setNavigationItemSelectedListener(this);
    }

    private void initSearchView() {
        mSearchView = (MaterialSearchView) findViewById(R.id.search_view);
        mSearchView.setHint("输入商品信息");
        mSearchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Bundle bundle = new Bundle();
                bundle.putString("keyword", query);
                Intent intent = new Intent();
                intent.putExtra("search", bundle);
                intent.setClass(MainActivity.this, CompareActivity.class);
                startActivity(intent);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }


    private void testMiaosha() {
        OkHttpClient mOkHttpClient = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("size", "10")
                .build();
        Request request = new Request.Builder()
                .url("http://api.juanpi.com/open/jiukuaiyou")
                .post(formBody)
                .build();
        Call call = mOkHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {
                String str = response.body().string();
                String jsonData = str.substring(12, str.length() - 2);
                Gson gson = new Gson();
                SeckillBean bean = gson.fromJson(jsonData, SeckillBean.class);
                Log.i(TAG, jsonData);
                Log.d(TAG, "解析出来的数据 " + bean.getGoodslist().get(0).toString());

            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        mNavigationView.setCheckedItem(R.id.nav_seckill);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (mSearchView.isSearchOpen()) {
            mSearchView.closeSearch();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        mSearchView.setMenuItem(item);

        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_seckill) {
            // Handle the camera action
        } else if (id == R.id.nav_bargain) {

        } else if (id == R.id.nav_compare) {
            startActivity(new Intent(MainActivity.this, CompareActivity.class));
        }else if (id == R.id.nav_joy) {
            startActivity(new Intent(MainActivity.this, JoyActivity.class));

        } else if (id == R.id.nav_share) {
            showShareView();

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_quit) {

        }

        mDrawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public Banner getBanner() {
        return mBanner;
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
    public MainPresenter initPresenter() {
        return new MainPresenter(this);
    }

    private void showShareView() {
        OnekeyShare oks = new OnekeyShare();
        //关闭sso授权
        oks.disableSSOWhenAuthorize();

        // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间等使用
        oks.setTitle("比一比");
        // titleUrl是标题的网络链接，QQ和QQ空间等使用
        oks.setTitleUrl("http://www.baidu.com");
        // text是分享文本，所有平台都需要这个字段
        oks.setText("这个应用非常方便，终于不用挨个网站逛了，快来下载吧");
        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
        //oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
        // url仅在微信（包括好友和朋友圈）中使用
        oks.setUrl("http://www.baidu.com");
        // comment是我对这条分享的评论，仅在人人网和QQ空间使用
        oks.setComment("这个应用非常方便，终于不用挨个网站逛了，快来下载吧");
        // site是分享此内容的网站名称，仅在QQ空间使用
        oks.setSite(getString(R.string.app_name));
        // siteUrl是分享此内容的网站地址，仅在QQ空间使用
        oks.setSiteUrl("http://www.baidu.com");

        // 启动分享GUI
        oks.show(this);
    }
}
