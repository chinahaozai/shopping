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
import com.halewang.shopping.model.bean.home.Home;
import com.halewang.shopping.model.bean.shaidan.Shaidan;
import com.youth.banner.Banner;

import java.util.List;

/**
 * Created by halewang on 2016/11/24.
 */

public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.MyHolder>{

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


    private static final int TYPE_HEADER = 0;
    private static final int TYPE_NORMAL = 1;
    private OnItemClickListener mItemClickListener;
    private OnItemLongClickListener mItemLongClickListener;
    private List<Home> mDatas;
    private Context mContext;
    private View mView;
    private View mHeader;

    public HomeListAdapter(Context mContext, List<Home> mDatas, View mHeader){
        this.mDatas = mDatas;
        this.mContext = mContext;
        this.mHeader = mHeader;
    }

    public void removeData(int position){
        mDatas.remove(position);
        notifyItemRemoved(position);
        notifyDataSetChanged();
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == TYPE_NORMAL) {
            mView = LayoutInflater.from(mContext).inflate(R.layout.item_home, parent, false);
            return new MyHolder(mView, viewType);
        }else{
            //mHeader = LayoutInflater.from(mContext).inflate(R.layout.item_home_header, parent, false);
            return new MyHolder(mHeader, viewType);
        }
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {

        if(getItemViewType(position) == TYPE_NORMAL) {
            holder.homeItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mItemClickListener.onItemClick(view, position);
                }
            });
            holder.tvTitle.setText(mDatas.get(position - 1).getPost_title());
            Glide.with(mContext)
                    .load(mDatas.get(position - 1).getThumbnail())
                    .centerCrop()
                    .into(holder.imageView);
        }else{
            initHeader();
        }
    }

    private void initHeader(){

    }

    @Override
    public int getItemCount() {
        return mDatas.size() + 1;
    }

    class MyHolder extends RecyclerView.ViewHolder{

        CardView homeItem;
        ImageView imageView;
        TextView tvTitle;
        Banner banner;

        public MyHolder(View itemView, int viewType) {
            super(itemView);
            if(viewType == TYPE_NORMAL) {
                homeItem = (CardView) itemView.findViewById(R.id.home_item);
                tvTitle = (TextView) itemView.findViewById(R.id.tv_home_item);
                imageView = (ImageView) itemView.findViewById(R.id.image_home_item);
            }else{
                banner = (Banner) itemView.findViewById(R.id.banner_header);
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        return position == 0 ? TYPE_HEADER : TYPE_NORMAL;
    }
}
