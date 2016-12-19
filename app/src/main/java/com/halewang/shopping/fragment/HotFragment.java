package com.halewang.shopping.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.halewang.shopping.ProductDetailActivity;
import com.halewang.shopping.R;
import com.halewang.shopping.adapter.CompareListAdapter;
import com.halewang.shopping.adapter.HotListAdapter;
import com.halewang.shopping.model.bean.compare.CompareModel;
import com.halewang.shopping.model.bean.compare.ProductBean;
import com.halewang.shopping.model.bean.compare.ProductDetail;
import com.halewang.shopping.model.bean.hot.Hot;
import com.halewang.shopping.model.bean.hot.HotBean;
import com.halewang.shopping.model.bean.hot.HotModel;
import com.halewang.shopping.utils.InternetUtil;

import java.util.List;

import rx.Subscriber;

/**
 * Created by halewang on 2016/12/19.
 */

public class HotFragment extends BaseFragment{

    private View mView;
    private Context mContext;
   /* private Subscriber<ProductBean> mSubscriber = new Subscriber<ProductBean>() {
        @Override
        public void onCompleted() {
            Toast.makeText(mContext, "加载完成", Toast.LENGTH_SHORT).show();
            //getMvpView().hideLoading(true);
        }

        @Override
        public void onError(Throwable e) {
            Toast.makeText(mContext, "加载失败", Toast.LENGTH_SHORT).show();
            //getMvpView().showErr(e.toString());
        }

        @Override
        public void onNext(ProductBean bean) {
            if (bean.getReason().equals("success")) {
                final List<ProductDetail> list = bean.getResult().getSearchResultList();
                System.out.println(bean.toString());
                CompareListAdapter mAdapter = new CompareListAdapter(mContext, list);
                mAdapter.setOnItemClickListener(new CompareListAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        if(InternetUtil.isNetworkAvailable(mContext)) {
                            Intent intent = new Intent(mContext, ProductDetailActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putString("url", list.get(position).getSpurl());
                            bundle.putString("brand", list.get(position).getBrandName());
                            intent.putExtra("detail", bundle);
                            mContext.startActivity(intent);
                        }else{
                            Snackbar.make(view, "网络连接失败，请检测手机网络连接", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            //Toast.makeText(mContext,"网络连接失败，请检测手机网络连接",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                mRecyclerView.setAdapter(mAdapter);
            } else {
                Toast.makeText(mContext, "加载失败", Toast.LENGTH_SHORT).show();
            }
        }
    };*/
    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_hot,container,false);
        mContext = getActivity();
        mRecyclerView = (RecyclerView) mView.findViewById(R.id.recyclerview_hot);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        //CompareModel.getCompareList(mSubscriber, "test", 1, 20);
        HotModel.getHotData(new Subscriber<HotBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(HotBean bean) {
                List<Hot> items = bean.getItems();
                HotListAdapter adapter = new HotListAdapter(mContext, items);
                mRecyclerView.setAdapter(adapter);
            }
        },System.currentTimeMillis());
        return mView;
    }

    /*@Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mRecyclerView = (RecyclerView) mView.findViewById(R.id.recyclerview_hot);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        //CompareModel.getCompareList(mSubscriber, "test", 1, 20);
        HotModel.getHotData(new Subscriber<HotBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(HotBean bean) {
                List<Hot> items = bean.getItems();
                HotListAdapter adapter = new HotListAdapter(mContext, items);
                mRecyclerView.setAdapter(adapter);
            }
        },System.currentTimeMillis());
    }*/
}
