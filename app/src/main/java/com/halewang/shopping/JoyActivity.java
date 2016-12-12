package com.halewang.shopping;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.halewang.shopping.presenter.JoyPresenter;
import com.halewang.shopping.view.JoyView;

public class JoyActivity extends BaseActivity<JoyView,JoyPresenter> implements JoyView{

    private static final String TAG = "JoyActivity";
    //private String testUrl = "http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201611/30/02AD3BD909D49E054C54684626CB8D10.gif";
    private String testUrl = "http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201612/10/8B8E6F95AB757873CF1FC28B33BB43F4.png";

    private RecyclerView mRecyclerView;
    private RelativeLayout rlLoadMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joy);

        initView();
        initToolBar();
        initRecyclerView();

        presenter.onStart();

        /*final ImageView imageView = (ImageView) findViewById(R.id.iv_test);

        Glide.with(this).load(testUrl)
                .asBitmap()
                .into(new SimpleTarget<Bitmap>(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL) {
                    @Override
                    public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                        int imageWidth = resource.getWidth();
                        int imageHeight = resource.getHeight();
                        Log.d(TAG, "imageWidth: "+ imageWidth);
                        Log.d(TAG, "imageHeight: "+ imageHeight);
                        int height = (int) getScreenWidth() * imageHeight / imageWidth;
                        ViewGroup.LayoutParams para = imageView.getLayoutParams();
                        para.height = height;
                        Log.d(TAG, "height: " + height);
                        imageView.setLayoutParams(para);
                        Glide.with(JoyActivity.this)
                                .load(testUrl)
                                .fitCenter()
                                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                                .into(imageView);
                    }
                });*/


    }

    private void initView(){
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        rlLoadMore = (RelativeLayout) findViewById(R.id.rl_load_more);
    }

    private void initToolBar(){

    }

    private void initRecyclerView(){
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private float getScreenWidth() {

        DisplayMetrics dm = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(dm);

        float density = dm.density;      // 屏幕密度（像素比例：0.75/1.0/1.5/2.0）
        Log.d(TAG, "density: " + density);
        float screenWidth = (int) (dm.widthPixels);      // 屏幕宽（px，如：480px）
        Log.d(TAG, "screenWidth: " + screenWidth);
        return screenWidth;
    }

    @Override
    public JoyPresenter initPresenter() {
        return new JoyPresenter(this);
    }

    @Override
    public RecyclerView getRecyclerView() {
        return mRecyclerView;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading(boolean isFirstLoad) {
        Toast.makeText(this,"加载完成",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showErr(String err) {

    }

    @Override
    public void onLoadMore() {
        rlLoadMore.setVisibility(View.VISIBLE);
    }

    @Override
    public void onLoadMoreFinish() {
        //Toast.makeText(this,"加载完成",Toast.LENGTH_SHORT).show();
        rlLoadMore.setVisibility(View.GONE);
    }
}
