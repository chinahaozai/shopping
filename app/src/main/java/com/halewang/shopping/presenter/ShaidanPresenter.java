package com.halewang.shopping.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.halewang.shopping.ProductDetailActivity;
import com.halewang.shopping.R;
import com.halewang.shopping.adapter.HotListAdapter;
import com.halewang.shopping.adapter.ShaidanListAdapter;
import com.halewang.shopping.adapter.ShaidanListAdapter2;
import com.halewang.shopping.global.API;
import com.halewang.shopping.model.bean.hot.Hot;
import com.halewang.shopping.model.bean.shaidan.Shaidan;
import com.halewang.shopping.model.bean.shaidan.ShaidanBean;
import com.halewang.shopping.model.bean.shaidan.ShaidanModel;
import com.halewang.shopping.view.fragment.ShaidanView;

import java.util.List;

import rx.Subscriber;

/**
 * Created by halewang on 2016/12/22.
 */

public class ShaidanPresenter extends BasePresenter<ShaidanView> {

    private Context mContext;
    private RecyclerView mRecyclerView;

    public ShaidanPresenter(Context context){
        mContext = context;
    }

    @Override
    public void onStart() {
        super.onStart();
        mRecyclerView = getMvpView().getRecyclerView();
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        ShaidanModel.getShaidanData(new Subscriber<ShaidanBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(ShaidanBean bean) {
                final List<Shaidan> items = bean.getItems();
                /*ShaidanListAdapter adapter = new ShaidanListAdapter(mContext, items);
                adapter.setOnItemClickListener(new ShaidanListAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Intent intent = new Intent(mContext, ProductDetailActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("url", API.OFFICIAL_URL +items.get(position).getShow_url());
                        bundle.putString("brand", "");
                        intent.putExtra("detail", bundle);
                        mContext.startActivity(intent);
                    }
                });*/
                mRecyclerView.addOnItemTouchListener(new OnItemChildClickListener() {
                    @Override
                    public void onSimpleItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                        Shaidan shaidan = (Shaidan)adapter.getItem(position);
                        switch (view.getId()){
                            case R.id.shaidan_item:
                                Intent intent = new Intent(mContext, ProductDetailActivity.class);
                                Bundle bundle = new Bundle();
                                bundle.putString("url", API.OFFICIAL_URL +shaidan.getShow_url());
                                bundle.putString("brand", "");
                                intent.putExtra("detail", bundle);
                                mContext.startActivity(intent);
                                break;
                            default:
                                break;
                        }
                    }
                });
                ShaidanListAdapter2 adapter = new ShaidanListAdapter2(items);
                adapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
                mRecyclerView.setAdapter(adapter);
            }
        },1,System.currentTimeMillis());
    }
}
