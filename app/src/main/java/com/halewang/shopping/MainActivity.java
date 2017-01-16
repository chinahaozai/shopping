package com.halewang.shopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.halewang.shopping.model.bean.heat.HeatBean;
import com.halewang.shopping.model.bean.heat.HeatModel;
import com.halewang.shopping.model.bean.home.RecommendBean;
import com.halewang.shopping.model.bean.home.RecommendModel;
import com.halewang.shopping.model.bean.user.User;
import com.halewang.shopping.presenter.MainPresenter;
import com.halewang.shopping.utils.InternetUtil;
import com.halewang.shopping.utils.PrefUtil;
import com.halewang.shopping.view.MainView;
import com.search.material.library.MaterialSearchView;

import java.util.HashMap;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.QueryListener;
import cn.bmob.v3.listener.SaveListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
import cn.smssdk.gui.RegisterPage;
import de.hdodenhof.circleimageview.CircleImageView;
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
    private TextView mTvUser;
    private CircleImageView mAvatar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!InternetUtil.isNetworkAvailable(this)){
            Toast.makeText(this,"这都什么时代了，你居然还没连上网",Toast.LENGTH_LONG).show();
            finish();
        }
        ShareSDK.initSDK(this);
        Bmob.initialize(this, "32e83924210f9cf2fee8cb29bf9e3ced");

        //testBmobInsert();
        //testBmobQuery();
        initView();
        initToolbar();
        initMenu();
        initSearchView();
        Log.d(TAG, "onCreate: " + System.currentTimeMillis());
        presenter.onStart();

    }

    private void testBmobInsert() {
        User user = new User();
        user.setName("王浩");
        user.setPhone("13363738372");
        user.setPassword("diedigmndjk");
        user.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {
                if (e == null) {
                    Log.d(TAG, "添加数据成功，返回objectId为：" + s);
                } else {
                    Log.d(TAG, "添加错误: " + e.getMessage());
                }
            }
        });
    }

    private void testBmobQuery() {
        BmobQuery<User> bmobQuery = new BmobQuery<>();
        bmobQuery.getObject("54712df8e0", new QueryListener<User>() {
            @Override
            public void done(User user, BmobException e) {
                if (e == null) {
                    Log.d(TAG, "查询成功: " + user.toString());
                } else {
                    Log.d(TAG, "查询失败: " + e.getMessage());
                }
            }
        });
    }


    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        mTabLayout = (TabLayout) findViewById(R.id.tab);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        View view = navigationView.getHeaderView(0);
        mTvUser = (TextView) view.findViewById(R.id.tv_user);
        mTvUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PrefUtil.getBoolean(MainActivity.this, LoginActivity.IS_ONLINE, false)) {
                    startActivity(new Intent(MainActivity.this, UserInfoActivity.class));
                } else {
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                }
            }
        });
        mAvatar = (CircleImageView) view.findViewById(R.id.iv_avatar);
        mAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PrefUtil.getBoolean(MainActivity.this, LoginActivity.IS_ONLINE, false)) {
                    startActivity(new Intent(MainActivity.this, UserInfoActivity.class));
                } else {
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                }
            }
        });


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

        if (PrefUtil.getBoolean(this, LoginActivity.IS_ONLINE, false)) {
            //登陆后默认显示用户名，如果用户名为空则显示手机号
            mTvUser.setText(PrefUtil.getString(this, LoginActivity.USER, LoginActivity.PHONE));
            if (!TextUtils.isEmpty(PrefUtil.getString(this, LoginActivity.AVATAR, ""))) {
                Glide.with(this)
                        .load(PrefUtil.getString(this, LoginActivity.AVATAR, ""))
                        .centerCrop()
                        .into(mAvatar);
            }
        } else {
            mTvUser.setText("点击登录");
        }
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

        if (id == R.id.nav_about) {
            startActivity(new Intent(this,AboutActivity.class));
        } else if (id == R.id.nav_collection) {
            if (PrefUtil.getBoolean(this, LoginActivity.IS_ONLINE, false)) {
                startActivity(new Intent(this, CollectionActivity.class));
            } else {
                startActivity(new Intent(this, LoginActivity.class));
            }
        } else if (id == R.id.nav_compare) {
            if(Debug.IS_DEBUG) {
                startActivity(new Intent(MainActivity.this, CompareActivity.class));
            }else{
                mSearchView.showSearch();
            }
        } else if (id == R.id.nav_joy) {
            startActivity(new Intent(MainActivity.this, JoyActivity.class));

        } else if (id == R.id.nav_share) {
            showShareView();

        } else if (id == R.id.nav_quit) {
            finish();
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

}
