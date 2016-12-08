package com.halewang.shopping;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;

public class JoyActivity extends AppCompatActivity {

    private static final String TAG = "JoyActivity";
    //private String testUrl = "http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201611/30/02AD3BD909D49E054C54684626CB8D10.gif";
    private String testUrl = "http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201611/30/561AC4817ACD58A33C175DF121176A03.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joy);

        final ImageView imageView = (ImageView) findViewById(R.id.iv_test);
        /*Glide.with(this)
                .load("http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201612/06/C01B0DEDA28B9FE80E09639D540505E9.gif")
                .fitCenter()
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                //.asGif()
                //.load("http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201612/05/2DCA69EDA643DF94DC8C0BE707DC3D31.jpg")
                .into(imageView);*/

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
                });


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
}
