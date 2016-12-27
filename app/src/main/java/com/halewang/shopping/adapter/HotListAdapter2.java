package com.halewang.shopping.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.halewang.shopping.R;
import com.halewang.shopping.model.bean.hot.Hot;

import java.util.List;

/**
 * Created by halewang on 2016/12/26.
 */

public class HotListAdapter2 extends BaseQuickAdapter<Hot, BaseViewHolder>{

    public HotListAdapter2(List<Hot> datas){
        super(R.layout.item_hot,datas);
    }


    @Override
    protected void convert(BaseViewHolder helper, Hot item) {
        helper.addOnClickListener(R.id.hot_item)
                .setText(R.id.tv_title, item.getPost_title())
                .setText(R.id.tv_time, item.getTime())
                .setText(R.id.tv_comment_count, item.getComment_count());

        String url = item.getThumbnail().replace("https","http");
        Glide.with(mContext)
                .load(url)
                .centerCrop()
                .into((ImageView) helper.getView(R.id.image_hot));
    }
}
