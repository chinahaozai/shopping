package com.halewang.shopping.adapter;

import android.text.Html;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.halewang.shopping.R;
import com.halewang.shopping.model.bean.heat.Heat;
import com.halewang.shopping.utils.TimeUtil;

import java.util.Date;
import java.util.List;

/**
 * Created by halewang on 2016/12/26.
 */

public class HeatListAdapter extends BaseQuickAdapter<Heat, BaseViewHolder>{

    private static final String TAG = "HeatListAdapter";

    public HeatListAdapter(List<Heat> datas){
        super(R.layout.item_heat,datas);
    }


    @Override
    protected void convert(BaseViewHolder helper, Heat item) {
        helper.addOnClickListener(R.id.heat_item)
                .setText(R.id.tv_title_heat, Html.fromHtml(item.getTitle()))
                //.setText(R.id.tv_time_heat, TimeUtil.timeToDate(item.getHottime()))
                .setText(R.id.tv_hot_heat, item.getHot()+"℃");
        /*System.out.println("商品时间 " + TimeUtil.timeToDate(item.getHottime()));
        System.out.println("当前时间 " + TimeUtil.timeToDate(System.currentTimeMillis()));*/

        Glide.with(mContext)
                .load(item.getImg())
                .centerCrop()
                .into((ImageView) helper.getView(R.id.image_heat));

    }
}
