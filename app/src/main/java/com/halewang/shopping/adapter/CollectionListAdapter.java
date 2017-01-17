package com.halewang.shopping.adapter;

import android.text.Html;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.halewang.shopping.R;
import com.halewang.shopping.model.bean.user.Collection;

import java.util.List;

/**
 * Created by halewang on 2016/12/26.
 */

public class CollectionListAdapter extends BaseQuickAdapter<Collection, BaseViewHolder> {

    public CollectionListAdapter(List<Collection> datas){
        super(R.layout.item_collection,datas);
    }


    @Override
    protected void convert(BaseViewHolder helper, Collection item) {
        helper.addOnClickListener(R.id.image_collection)
                .addOnClickListener(R.id.btn_delete)
                .addOnClickListener(R.id.tv_title)
                .setText(R.id.tv_title, Html.fromHtml(item.getShow_title()));

        String url = item.getImage_url().replace("https","http");
        //System.out.println("处理后的地址----->"+url);
        Glide.with(mContext)
                .load(url)
                .centerCrop()
                .into((ImageView) helper.getView(R.id.image_collection));
    }

}
