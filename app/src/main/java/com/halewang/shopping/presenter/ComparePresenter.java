package com.halewang.shopping.presenter;

import android.content.Context;
import android.widget.Toast;

import com.halewang.shopping.adapter.CompareListAdapter;
import com.halewang.shopping.model.ProductModel;
import com.halewang.shopping.model.bean.ProductBean;
import com.halewang.shopping.model.bean.ProductDetail;
import com.halewang.shopping.view.CompareView;

import java.util.List;

import rx.Subscriber;

/**
 * Created by halewang on 2016/11/16.
 */

public class ComparePresenter extends BasePresenter<CompareView>{

    private Context mContext;

    private Subscriber<ProductBean> mSubscriber= new Subscriber<ProductBean>() {
        @Override
        public void onCompleted() {
            Toast.makeText(mContext,"加载完成",Toast.LENGTH_SHORT).show();
            getMvpView().hideLoading();
        }

        @Override
        public void onError(Throwable e) {
            Toast.makeText(mContext,"加载失败",Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onNext(ProductBean bean) {
            /*Toast.makeText(mContext,"搜索结果的第一个品牌是"+bean.getResult().getSearchResultList()
                    .get(0).getBrandName(),Toast.LENGTH_SHORT).show();*/
            List<ProductDetail> list = bean.getResult().getSearchResultList();
            CompareListAdapter mAdapter = new CompareListAdapter(mContext, list);
            getMvpView().getRecyclerView().setAdapter(mAdapter);
        }
    };

    public ComparePresenter(Context context){
        mContext = context;
        ProductModel.getCompareList(mSubscriber,"魅族Pro6",1,20);
    }

    @Override
    public void onResume() {
        super.onResume();
        getMvpView().showLoading();

    }
}
