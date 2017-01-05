package com.halewang.shopping;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.halewang.shopping.model.bean.meizi.MeiziData;
import com.halewang.shopping.model.service.ApiManage;
import com.halewang.shopping.utils.BlurBitmap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class LoginActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mImageView = (ImageView) findViewById(R.id.iv_background);
        File f = new File("/sdcard/test.png");
        if(f.exists()){
            Glide.with(this)
                    .load(f.getPath())
                    .centerCrop()
                    .into(mImageView);
            //mImageView.setImageBitmap(BlurBitmap.blur(this,BitmapFactory.decodeFile(f.getPath())));
        }else{
            Toast.makeText(this,"图片不存在",Toast.LENGTH_SHORT).show();
        }
        /*Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test);
        mImageView.setImageBitmap(BlurBitmap.blur(LoginActivity.this,bitmap));
*/
        /*ApiManage.getMeiziService().getMeizhiData(1)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<MeiziData>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onNext(MeiziData data) {
                        Glide.with(LoginActivity.this)
                                .load(data.getResults().get(0).getUrl())
                                .asBitmap()
                                .into(new SimpleTarget<Bitmap>() {
                                    @Override
                                    public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                                        //saveMyBitmap("test", resource);
                                        //mImageView.setImageBitmap(BlurBitmap.blur(LoginActivity.this,bitmap));
                                        //mImageView.setImageBitmap(resource);
                                        *//*int width = Math.round(resource.getWidth() * 1f);
                                        int height = Math.round(resource.getHeight() * 1f);
                                        // 将缩小后的图片做为预渲染的图片。
                                        Bitmap inputBitmap = Bitmap.createScaledBitmap(resource, width, height, false);*//*
                                        saveMyBitmap("test",resource);
                                    }
                                });
                    }
                });*/
    }

    public void saveMyBitmap(String bitName, Bitmap mBitmap) {
        File f = new File("/sdcard/" + bitName + ".png");
        try {
            f.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
        }
        FileOutputStream fOut = null;
        try {
            fOut = new FileOutputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        mBitmap.compress(Bitmap.CompressFormat.PNG, 100, fOut);
        try {
            fOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*Glide.with(this)
                .load(f.getPath())
                .centerCrop()
                .into(mImageView);*/
    }
}
