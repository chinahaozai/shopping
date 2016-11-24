package com.halewang.shopping.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.halewang.shopping.R;

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
    private List<String> mDatas;
    private Context mContext;

    public CompareListAdapter(Context mContext, List<String> mDatas){
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

        return new MyHolder(LayoutInflater.from(mContext).inflate(R.layout.item_compare,parent,false));
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        holder.tv.setText(mDatas.get(position));
        if(mItemClickListener != null){
            holder.tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mItemClickListener.onItemClick(view, position);
                }
            });
        }
        if(mItemLongClickListener != null){
            holder.tv.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    //mItemLongClickListener.OnItemLongClick(view, position);
                    removeData(position);
                    return false;
                }
            });
        }
    }


    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        TextView tv;
        public MyHolder(View itemView) {
            super(itemView);

            tv = (TextView) itemView.findViewById(R.id.tv_test);
        }
    }
}
