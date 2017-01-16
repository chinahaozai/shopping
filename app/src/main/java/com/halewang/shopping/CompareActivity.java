package com.halewang.shopping;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.halewang.shopping.adapter.decoration.DividerItemDecoration;
import com.halewang.shopping.model.bean.meizi.MeiziData;
import com.halewang.shopping.model.service.ApiManage;
import com.halewang.shopping.presenter.ComparePresenter;
import com.halewang.shopping.utils.InternetUtil;
import com.halewang.shopping.view.CompareView;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class CompareActivity extends BaseActivity<CompareView,ComparePresenter> implements CompareView {

    private static final String TAG = "CompareActivity";

    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mRefreshLayout;
    private ImageView mImageView;

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            hideLoading(false);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);

        setupToolbarLayout();
        initRefreshLayout();
        initRecyclerView();
        if(!Debug.IS_DEBUG) {
            presenter.getCompareList(getKeyword());
        }
        presenter.onStart();
    }

    private String getKeyword(){
        Intent intent = getIntent();
        return intent.getBundleExtra("search").getString("keyword");
    }

    private void initRefreshLayout(){
        mRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.refresh_layout);
        mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //个人感觉这里根本不用刷新，除非一天都在这个界面不动，第二天刷新（简直zz）
                mHandler.sendEmptyMessageDelayed(0,2000);
            }
        });
        showLoading();
    }

    private void initRecyclerView(){

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));
    }

    void setupToolbarLayout() {
        mImageView = (ImageView) findViewById(R.id.image_top);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("商品集合");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    public ComparePresenter initPresenter() {
        return new ComparePresenter(this);
    }

    @Override
    public void showLoading() {
        mRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                mRefreshLayout.setRefreshing(true);
            }
        });
    }

    @Override
    public void hideLoading(boolean isFirstLoad) {
        mRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                mRefreshLayout.setRefreshing(false);
            }
        });
        if(InternetUtil.isNetworkAvailable(this)) {
            mRecyclerView.smoothScrollToPosition(0);
            if (!isFirstLoad) {
                Toast.makeText(this, "刷新完成", Toast.LENGTH_SHORT).show();
            }
        }else{
            Snackbar.make(mRefreshLayout, "网络连接失败，请检测手机网络连接", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
    }

    @Override
    public void showErr(String err) {

    }

    @Override
    public RecyclerView getRecyclerView() {
        return mRecyclerView;
    }

    @Override
    public ImageView getImageView() {
        return mImageView;
    }

    @Override
    public FloatingActionButton getFloatingActionButton() {
        return (FloatingActionButton) findViewById(R.id.search_fab);
    }
}
