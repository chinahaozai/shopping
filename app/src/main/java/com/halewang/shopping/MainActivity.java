package com.halewang.shopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.Gson;
import com.halewang.shopping.model.bean.banner.BannerBean;
import com.halewang.shopping.model.bean.banner.BannerModel;
import com.halewang.shopping.model.bean.home.RecommendBean;
import com.halewang.shopping.model.bean.home.RecommendModel;
import com.halewang.shopping.model.bean.hot.HotBean;
import com.halewang.shopping.model.bean.hot.HotModel;
import com.halewang.shopping.model.bean.seckill.SeckillBean;
import com.halewang.shopping.presenter.MainPresenter;
import com.halewang.shopping.view.MainView;
import com.search.material.library.MaterialSearchView;
import com.youth.banner.Banner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
import cn.smssdk.gui.RegisterPage;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import rx.Subscriber;

public class MainActivity extends BaseActivity<MainView, MainPresenter>
        implements MainView, NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "MainActivity";

    private MaterialSearchView mSearchView;
    private NavigationView mNavigationView;
    private DrawerLayout mDrawer;
    private ViewPager mViewPager;
    private Toolbar mToolbar;
    private TabLayout mTabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShareSDK.initSDK(this);
        SMSSDK.initSDK(this, "19e6883036546", "af7b43a7fee9b57942003b40c665acdd");
        initView();
        initToolbar();
        initMenu();
        initSearchView();
        Log.d(TAG, "onCreate: " + System.currentTimeMillis());
        presenter.onStart();

        RecommendModel.getRecommendData(new Subscriber<RecommendBean>() {
            @Override
            public void onCompleted() {
                Log.d(TAG, "onCompleted: finish");
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: finish");
            }

            @Override
            public void onNext(RecommendBean bean) {
                Log.d(TAG, "onNext: " + bean.toString());
            }
        }, 1, System.currentTimeMillis());

        Log.d(TAG, "onCreate: " + System.currentTimeMillis());
    }



    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        mTabLayout = (TabLayout) findViewById(R.id.tab);
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
        } else if (id == R.id.nav_joy) {
            startActivity(new Intent(MainActivity.this, JoyActivity.class));

        } else if (id == R.id.nav_share) {
            showShareView();

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_quit) {
            startActivity(new Intent(MainActivity.this, TablaoutTestActivity.class));
        }

        mDrawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public TabLayout getTabLayout() {
        return mTabLayout;
    }

    @Override
    public ViewPager getViewPager() {
        return mViewPager;
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

    private void register() {
        //打开注册页面
        RegisterPage registerPage = new RegisterPage();
        registerPage.setRegisterCallback(new EventHandler() {
            public void afterEvent(int event, int result, Object data) {
                Log.d(TAG, "register: " + "到了回调事件里");

                // 解析注册结果
                if (result == SMSSDK.RESULT_COMPLETE) {
                    @SuppressWarnings("unchecked")
                    HashMap<String, Object> phoneMap = (HashMap<String, Object>) data;
                    String country = (String) phoneMap.get("country");
                    String phone = (String) phoneMap.get("phone");
                    Log.d(TAG, "country: " + country);
                    Log.d(TAG, "phone: " + phone);
                    // 提交用户信息（此方法可以不调用）
                    //registerUser(country, phone);
                }else{
                    Log.d(TAG, "result: " + "失败");
                }
            }
        });
        registerPage.show(MainActivity.this);
        Log.d(TAG, "register: " + "还是可以打日志");
    }
}
