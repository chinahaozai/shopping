package com.halewang.shopping;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.halewang.shopping.adapter.CompareListAdapter;
import com.halewang.shopping.adapter.decoration.DividerItemDecoration;
import com.halewang.shopping.model.ProductModel;
import com.halewang.shopping.presenter.ComparePresenter;
import com.halewang.shopping.view.CompareView;

import java.util.ArrayList;
import java.util.List;

public class CompareActivity extends BaseActivity<CompareView,ComparePresenter> implements CompareView {

    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mRefreshLayout;

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
    }

    private void initRecyclerView(){
         /*CompareListAdapter mAdapter = new CompareListAdapter(this, mDatas);
        mRecyclerView.setAdapter(mAdapter);*/
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));
    }

    void setupToolbar() {
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
    public void hideLoading() {
        mRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                mRefreshLayout.setRefreshing(false);
            }
        });
    }

    @Override
    public void showErr(String err) {

    }

    @Override
    public RecyclerView getRecyclerView() {
        return mRecyclerView;
    }
}
