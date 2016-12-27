package com.halewang.shopping.adapter;

import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.halewang.shopping.R;
import com.halewang.shopping.model.bean.hot.Hot;
import com.halewang.shopping.model.bean.shaidan.Shaidan;

import java.util.List;

/**
 * Created by halewang on 2016/12/26.
 */

public class ShaidanListAdapter2 extends BaseQuickAdapter<Shaidan, BaseViewHolder>{

    private static final String TAG = "ShaidanListAdapter2";

    public ShaidanListAdapter2(List<Shaidan> datas){
        super(R.layout.item_shaidan,datas);
    }


    @Override
    protected void convert(BaseViewHolder helper, Shaidan item) {
        helper.addOnClickListener(R.id.shaidan_item)
                .setText(R.id.tv_shaidan, item.getTitle());

        String url = item.getThumb_picture().replace("https","http");
        Glide.with(mContext)
                .load(url)
                .centerCrop()
                .into((ImageView) helper.getView(R.id.image_shaidan));

        Log.d(TAG, "convert: " + item.getThumb_picture());
    }
}
