package com.halewang.shopping.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.halewang.shopping.Debug;
import com.halewang.shopping.ProductDetailActivity;
import com.halewang.shopping.ProductDetailActivity2;
import com.halewang.shopping.adapter.CompareListAdapter;
import com.halewang.shopping.global.API;
import com.halewang.shopping.model.bean.compare.CompareModel;
import com.halewang.shopping.model.bean.compare.ProductBean;
import com.halewang.shopping.model.bean.compare.ProductDetail;
import com.halewang.shopping.model.bean.meizi.MeiziData;
import com.halewang.shopping.model.service.ApiManage;
import com.halewang.shopping.utils.InternetUtil;
import com.halewang.shopping.view.CompareView;

import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by halewang on 2016/11/16.
 */

public class ComparePresenter extends BasePresenter<CompareView> {

    private static final String TAG = "ComparePresenter";

    private Context mContext;

    private Subscriber<ProductBean> mSubscriber = new Subscriber<ProductBean>() {
        @Override
        public void onCompleted() {
            Toast.makeText(mContext, "加载完成", Toast.LENGTH_SHORT).show();
            getMvpView().hideLoading(true);
        }

        @Override
        public void onError(Throwable e) {
            Toast.makeText(mContext, "加载失败", Toast.LENGTH_SHORT).show();
            getMvpView().showErr(e.toString());
        }

        @Override
        public void onNext(ProductBean bean) {
            if (bean.getReason().equals("success")) {
                final List<ProductDetail> list = bean.getResult().getSearchResultList();
                CompareListAdapter mAdapter = new CompareListAdapter(mContext, list);
                mAdapter.setOnItemClickListener(new CompareListAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        if(InternetUtil.isNetworkAvailable(mContext)) {
                            Intent intent = new Intent(mContext, ProductDetailActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putString(ProductDetailActivity2.SHOW_URL, list.get(position).getSpurl());
                            bundle.putString(ProductDetailActivity2.TITLE, list.get(position).getSpname());
                            bundle.putString(ProductDetailActivity2.BUY_URL, list.get(position).getSpurl());
                            bundle.putString(ProductDetailActivity2.IMAGE_URL, list.get(position).getSppic());
                            intent.putExtra("detail", bundle);
                            mContext.startActivity(intent);
                        }else{
                            Snackbar.make(view, "网络连接失败，请检测手机网络连接", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                        }
                    }
                });
                getMvpView().getRecyclerView().setAdapter(mAdapter);
            } else {
                Toast.makeText(mContext, "加载失败", Toast.LENGTH_SHORT).show();
            }
        }
    };

    public ComparePresenter(Context context) {
        mContext = context;
        if(Debug.IS_DEBUG) {
            getCompareList("hello world");
        }
    }

    public void getCompareList(String keyword){
        CompareModel.getCompareList(mSubscriber, keyword, 1, 20);
    }


    @Override
    public void onStart() {

        initMeizi();
        getMvpView().getFloatingActionButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getMvpView().getRecyclerView().smoothScrollToPosition(0);
            }
        });
    }

    private void initMeizi() {
        ApiManage.getMeiziService().getMeizhiData(1)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<MeiziData>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: " + e.toString());
                    }

                    @Override
                    public void onNext(MeiziData data) {
                        Glide.with(mContext)
                                .load(data.getResults().get(0).getUrl())
                                .centerCrop()
                                //.placeholder(R.drawable.toolbar_bg)
                                .crossFade()
                                .into(getMvpView().getImageView());
                    }
                });

    }

}
