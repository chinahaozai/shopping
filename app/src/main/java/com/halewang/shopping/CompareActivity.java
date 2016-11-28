package com.halewang.shopping;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.halewang.shopping.adapter.decoration.DividerItemDecoration;
import com.halewang.shopping.presenter.ComparePresenter;
import com.halewang.shopping.view.CompareView;

public class CompareActivity extends BaseActivity<CompareView,ComparePresenter> implements CompareView {

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

        setupToolbar();
        initRefreshLayout();
        initRecyclerView();
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
         /*CompareListAdapter mAdapter = new CompareListAdapter(this, mDatas);
        mRecyclerView.setAdapter(mAdapter);*/
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));
    }

    void setupToolbar() {
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
        //mRecyclerView.scrollToPosition(0);
        mRecyclerView.smoothScrollToPosition(0);
        if(!isFirstLoad) {
            Toast.makeText(this, "刷新完成", Toast.LENGTH_SHORT).show();
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
