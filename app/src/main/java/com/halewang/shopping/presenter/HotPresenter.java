package com.halewang.shopping.presenter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.halewang.shopping.view.fragment.HotView;

/**
 * Created by halewang on 2016/12/21.
 */

public class HotPresenter extends BasePresenter<HotView>{

    private Context mContext;

    public HotPresenter(Context context){
        mContext = context;
    }

    @Override
    public void onStart() {
        super.onStart();
        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView mRecyclerView = getMvpView().getRecyclerView();

    }
}
