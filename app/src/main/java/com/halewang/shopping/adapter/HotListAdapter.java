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
import com.halewang.shopping.model.bean.hot.Hot;

import java.util.List;

/**
 * Created by halewang on 2016/11/24.
 */

public class HotListAdapter extends RecyclerView.Adapter<HotListAdapter.MyHolder>{
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
    private List<Hot> mDatas;
    private Context mContext;
    private View mView;

    public HotListAdapter(Context mContext, List<Hot> mDatas){
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
        mView = LayoutInflater.from(mContext).inflate(R.layout.item_hot,parent,false);
        return new MyHolder(mView);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {

        holder.hotItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mItemClickListener.onItemClick(view, position);
            }
        });
        holder.tvTitle.setText(mDatas.get(position).getPost_title());
        holder.tvTime.setText(mDatas.get(position).getTime());
        holder.tvCommentCount.setText(mDatas.get(position).getComment_count());
        Glide.with(mContext)
                .load(mDatas.get(position).getThumbnail())
                .centerCrop()
                .into(holder.imageView);
    }


    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        CardView hotItem;
        ImageView imageView;
        TextView tvTitle;
        TextView tvTime;
        TextView tvCommentCount;

        public MyHolder(View itemView) {
            super(itemView);

            hotItem = (CardView) itemView.findViewById(R.id.hot_item);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvTime = (TextView) itemView.findViewById(R.id.tv_time);
            tvCommentCount = (TextView) itemView.findViewById(R.id.tv_comment_count);
            imageView = (ImageView) itemView.findViewById(R.id.image_hot);
        }
    }
}
