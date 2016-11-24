package com.halewang.shopping;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.halewang.shopping.adapter.CompareListAdapter;
import com.halewang.shopping.adapter.decoration.DividerItemDecoration;
import com.halewang.shopping.presenter.ComparePresenter;
import com.halewang.shopping.view.CompareView;

import java.util.ArrayList;
import java.util.List;

public class CompareActivity extends BaseActivity<CompareView,ComparePresenter> implements CompareView {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);

        List<String> mDatas = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            mDatas.add("这是第"+i+"条数据");
        }

        setupToolbar();
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        CompareListAdapter mAdapter = new CompareListAdapter(this, mDatas);
        mRecyclerView.setAdapter(mAdapter);
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
        return new ComparePresenter();
    }

    @Override
    public void showLoading(String msg) {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showErr(String err) {

    }

    @Override
    public RecyclerView getRecyclerView() {
        return mRecyclerView;
    }
}
