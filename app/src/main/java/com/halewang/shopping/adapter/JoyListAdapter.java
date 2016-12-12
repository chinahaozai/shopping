package com.halewang.shopping.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.halewang.shopping.JoyActivity;
import com.halewang.shopping.R;
import com.halewang.shopping.model.bean.compare.ProductDetail;
import com.halewang.shopping.model.bean.joy.Joy;

import java.util.List;

/**
 * Created by halewang on 2016/11/24.
 */

public class JoyListAdapter extends RecyclerView.Adapter<JoyListAdapter.MyHolder>{
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
    private List<Joy> mDatas;
    private Context mContext;
    private View mView;

    public JoyListAdapter(Context mContext, List<Joy> mDatas){
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
        mView = LayoutInflater.from(mContext).inflate(R.layout.item_joy,parent,false);
        return new MyHolder(mView);
    }

    @Override
    public void onBindViewHolder(final MyHolder holder, final int position) {

        holder.tvContent.setText(mDatas.get(position).getContent());
        Glide.with(mContext).load(mDatas.get(position).getUrl())
                .asBitmap()
                .into(new SimpleTarget<Bitmap>(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL) {
                    @Override
                    public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                        int imageWidth = resource.getWidth();
                        int imageHeight = resource.getHeight();

                        int height = (int) getScreenWidth() * imageHeight / imageWidth;
                        ViewGroup.LayoutParams para = holder.imageView.getLayoutParams();
                        para.height = height;
                        holder.imageView.setLayoutParams(para);
                        Glide.with(mContext)
                                .load(mDatas.get(position).getUrl())
                                .fitCenter()
                                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                                .into(holder.imageView);
                    }
                });
    }

    private float getScreenWidth() {

        DisplayMetrics dm = new DisplayMetrics();

        JoyActivity mActivity = (JoyActivity)mContext;
        mActivity.getWindowManager().getDefaultDisplay().getMetrics(dm);

        float density = dm.density;      // 屏幕密度（像素比例：0.75/1.0/1.5/2.0）
        float screenWidth = (int) (dm.widthPixels);      // 屏幕宽（px，如：480px）
        return screenWidth;
    }


    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        TextView tvContent;
        ImageView imageView;
        public MyHolder(View itemView) {
            super(itemView);

            tvContent = (TextView) itemView.findViewById(R.id.tv_content);
            imageView = (ImageView) itemView.findViewById(R.id.imageview);
        }
    }
}
