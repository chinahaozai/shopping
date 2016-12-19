package com.halewang.shopping;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.halewang.shopping.presenter.JoyPresenter;
import com.halewang.shopping.view.JoyView;

public class JoyActivity extends BaseActivity<JoyView, JoyPresenter> implements JoyView {

    private static final String TAG = "JoyActivity";
    //private String testUrl = "http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201611/30/02AD3BD909D49E054C54684626CB8D10.gif";
    private String testUrl = "http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201612/10/8B8E6F95AB757873CF1FC28B33BB43F4.png";

    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RelativeLayout rlLoadMore;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joy);

        initView();
        initToolBar();
        initRecyclerView();

        presenter.onStart();

    }

    private void initView() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.refresh_layout);
        rlLoadMore = (RelativeLayout) findViewById(R.id.rl_load_more);
    }

    private void initToolBar() {
        mToolbar.setTitle("每日趣图");
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowTitleEnabled(false);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void initRecyclerView() {
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private float getScreenWidth() {

        DisplayMetrics dm = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(dm);

        float density = dm.density;      // 屏幕密度（像素比例：0.75/1.0/1.5/2.0）
        Log.d(TAG, "density: " + density);
        float screenWidth = (int) (dm.widthPixels);      // 屏幕宽（px，如：480px）
        Log.d(TAG, "screenWidth: " + screenWidth);
        return screenWidth;
    }

    @Override
    public JoyPresenter initPresenter() {
        return new JoyPresenter(this);
    }

    @Override
    public RecyclerView getRecyclerView() {
        return mRecyclerView;
    }

    @Override
    public SwipeRefreshLayout getSwipeRefreshLayout() {
        return mSwipeRefreshLayout;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading(boolean isFirstLoad) {
        mSwipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                mSwipeRefreshLayout.setRefreshing(false);
            }
        });

    }

    @Override
    public void showErr(String err) {

    }

    @Override
    public void onLoadMore() {
        rlLoadMore.setVisibility(View.VISIBLE);
    }

    @Override
    public void onLoadMoreFinish() {
        //Toast.makeText(this,"加载完成",Toast.LENGTH_SHORT).show();
        rlLoadMore.setVisibility(View.GONE);
    }
}
