package com.halewang.shopping.presenter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.halewang.shopping.adapter.CompareListAdapter;
import com.halewang.shopping.model.CompareModel;
import com.halewang.shopping.model.bean.compare.ProductBean;
import com.halewang.shopping.model.bean.compare.ProductDetail;
import com.halewang.shopping.model.bean.meizi.MeiziData;
import com.halewang.shopping.model.service.ApiManage;
import com.halewang.shopping.view.CompareView;

import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
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

        }

        @Override
        public void onNext(ProductBean bean) {
            if (bean.getReason().equals("success")) {
                List<ProductDetail> list = bean.getResult().getSearchResultList();
                CompareListAdapter mAdapter = new CompareListAdapter(mContext, list);
                mAdapter.setOnItemClickListener(new CompareListAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Toast.makeText(mContext, "试试点击", Toast.LENGTH_SHORT).show();
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
        CompareModel.getCompareList(mSubscriber, "魅族Pro6", 1, 20);
    }


    @Override
    public void onStart() {
        /*if(isAttachView()){
            getMvpView().showLoading();
            Log.d(TAG, "ComparePresenter: loading complete");
        }else{
            Log.d(TAG, "ComparePresenter: view not attached");
        }*/
        initMeizi();
        getMvpView().getFloatingActionButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getMvpView().getRecyclerView().smoothScrollToPosition(0);
            }
        });
    }
    private void initMeizi(){
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
                        Log.e(TAG, "onError: "+e.toString());
                    }

                    @Override
                    public void onNext(MeiziData data) {
                        Glide.with(mContext)
                                .load(data.getResults().get(0).getUrl())
                                .centerCrop()
                                .into(getMvpView().getImageView());
                    }
                });
                /*.subscribe(new Action1<MeiziData>() {
                    @Override
                    public void call(MeiziData data) {
                        Glide.with(mContext)
                                .load(data.getResults().get(0).url)
                                .centerCrop()
                                .into(getMvpView().getImageView());
                    }
                });*/
    }

}
