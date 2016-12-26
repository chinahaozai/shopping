package com.halewang.shopping.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.halewang.shopping.ProductDetailActivity;
import com.halewang.shopping.R;
import com.halewang.shopping.adapter.HotListAdapter;
import com.halewang.shopping.adapter.HotListAdapter2;
import com.halewang.shopping.global.API;
import com.halewang.shopping.model.bean.hot.Hot;
import com.halewang.shopping.model.bean.hot.HotBean;
import com.halewang.shopping.model.bean.hot.HotModel;
import com.halewang.shopping.view.fragment.HotView;

import java.util.List;

import rx.Subscriber;

/**
 * Created by halewang on 2016/12/21.
 */

public class HotPresenter extends BasePresenter<HotView>{

    private static final String TAG = "HotPresenter";
    private Context mContext;
    private Subscriber<HotBean> mSubscriber = new Subscriber<HotBean>() {
        @Override
        public void onCompleted() {
            Log.d(TAG, "   onCompleted:" + System.currentTimeMillis());
        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(HotBean bean) {
            Log.d(TAG, " onNext: finish" + System.currentTimeMillis());
            final List<Hot> items = bean.getItems();
            /*HotListAdapter adapter = new HotListAdapter(mContext, items);
            adapter.setOnItemClickListener(new HotListAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    Intent intent = new Intent(mContext, ProductDetailActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("url", API.OFFICIAL_URL +items.get(position).getPost_url());
                    bundle.putString("brand", "");
                    intent.putExtra("detail", bundle);
                    mContext.startActivity(intent);
                }
            });*/
            mRecyclerView.addOnItemTouchListener(new OnItemChildClickListener() {
                @Override
                public void onSimpleItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                    Hot hot = (Hot)adapter.getItem(position);
                    switch (view.getId()){
                        case R.id.hot_item:
                            Intent intent = new Intent(mContext, ProductDetailActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putString("url", API.OFFICIAL_URL +hot.getPost_url());
                            bundle.putString("brand", "");
                            intent.putExtra("detail", bundle);
                            mContext.startActivity(intent);
                            break;
                        default:
                            break;
                    }
                }
            });
            HotListAdapter2 adapter = new HotListAdapter2(items);
            adapter.openLoadAnimation();
            mRecyclerView.setAdapter(adapter);
        }
    };
    private RecyclerView mRecyclerView;

    public HotPresenter(Context context){
        mContext = context;
        Log.d(TAG, "  HotPresenter:" + System.currentTimeMillis());
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: finish" + System.currentTimeMillis());
        initRecyclerView();
    }

    private void initRecyclerView(){
        mRecyclerView = getMvpView().getRecyclerView();
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        HotModel.getHotData(mSubscriber,System.currentTimeMillis());
    }
}
