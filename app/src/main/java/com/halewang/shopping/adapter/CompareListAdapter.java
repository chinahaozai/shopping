package com.halewang.shopping.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.halewang.shopping.R;
import com.halewang.shopping.model.bean.compare.ProductDetail;

import java.util.List;

/**
 * Created by halewang on 2016/11/24.
 */

public class CompareListAdapter extends RecyclerView.Adapter<CompareListAdapter.MyHolder>{
    public interface OnItemClickListener{
        void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        mItemClickListener = onItemClickListener;
    }

    public interface OnItemLongClickListener{
        void OnItemLongClick(View view, int position);
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener){
        mItemLongClickListener = onItemLongClickListener;
    }

    private OnItemClickListener mItemClickListener;
    private OnItemLongClickListener mItemLongClickListener;
    private List<ProductDetail> mDatas;
    private Context mContext;
    private View mView;

    public CompareListAdapter(Context mContext, List<ProductDetail> mDatas){
        this.mDatas = mDatas;
        this.mContext = mContext;
    }

    public void removeData(int position){
        mDatas.remove(position);
        notifyItemRemoved(position);
        notifyDataSetChanged();
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mView = LayoutInflater.from(mContext).inflate(R.layout.item_compare,parent,false);
        return new MyHolder(mView);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {

        holder.compareItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mItemClickListener.onItemClick(view, position);
            }
        });
        holder.tvDescription.setText(mDatas.get(position).getSpname());
        holder.tvBrand.setText("品牌:" + mDatas.get(position).getBrandName());
        holder.tvPrice.setText("价格:" + mDatas.get(position).getSpprice()+"¥");
        holder.tvSite.setText("来源:" + mDatas.get(position).getSiteName());
        holder.tvComment.setText("评论:"+ mDatas.get(position).getCommentCount()+"条");
        Glide.with(mContext)
                .load(mDatas.get(position).getSppic())
                .centerCrop()
                .into(holder.imageView);
    }


    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        TextView tvDescription;
        TextView tvBrand;
        TextView tvPrice;
        TextView tvSite;
        TextView tvComment;
        ImageView imageView;
        CardView compareItem;
        public MyHolder(View itemView) {
            super(itemView);

            tvDescription = (TextView) itemView.findViewById(R.id.tv_description);
            tvBrand = (TextView) itemView.findViewById(R.id.tv_brand);
            tvPrice = (TextView) itemView.findViewById(R.id.tv_price);
            tvSite = (TextView) itemView.findViewById(R.id.tv_site);
            tvComment = (TextView) itemView.findViewById(R.id.tv_comment);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            compareItem = (CardView) itemView.findViewById(R.id.compare_item);
        }
    }
}
