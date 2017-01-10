package com.halewang.shopping;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

import com.halewang.shopping.presenter.SignUpPresenter;
import com.halewang.shopping.utils.FileUtil;
import com.halewang.shopping.view.SignUpView;

import java.io.File;

import de.hdodenhof.circleimageview.CircleImageView;

public class SignUpActivity extends BaseActivity<SignUpView, SignUpPresenter> implements SignUpView {

    private static final int REQUESTCODE_PICK = 0;		// 相册选图标记
    private static final int REQUESTCODE_TAKE = 1;		// 相机拍照标记
    private static final int REQUESTCODE_CUTTING = 2;	// 图片裁切标记
    private static final String IMAGE_FILE_NAME = "avatarImage.jpg";// 头像文件名称
    private String urlpath; // 图片本地路径

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        presenter.onStart();

    }

    @Override
    public SignUpPresenter initPresenter() {
        return new SignUpPresenter(this);
    }

    @Override
    public EditText getUser() {
        return (EditText) findViewById(R.id.et_sign_user);
    }

    @Override
    public EditText getPassword() {
        return (EditText) findViewById(R.id.et_sign_password);
    }

    @Override
    public EditText getPasswordConfirm() {
        return (EditText) findViewById(R.id.et_sign_password_confirm);
    }

    @Override
    public Button getBtnCommit() {
        return (Button) findViewById(R.id.btn_commit);
    }

    @Override
    public CircleImageView getCircleAvatar() {
        return (CircleImageView) findViewById(R.id.ci_avatar);
    }

    @Override
    public FrameLayout getSignLayout() {
        return (FrameLayout) findViewById(R.id.sign_layout);
    }

    @Override
    public void takePhoto() {
        Intent takeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //下面这句指定调用相机拍照后的照片存储的路径
        takeIntent.putExtra(MediaStore.EXTRA_OUTPUT,
                Uri.fromFile(new File(Environment.getExternalStorageDirectory(), IMAGE_FILE_NAME)));
        startActivityForResult(takeIntent, REQUESTCODE_TAKE);
    }

    @Override
    public void pickPhoto() {
        Intent pickIntent = new Intent(Intent.ACTION_PICK, null);
        // 如果朋友们要限制上传到服务器的图片类型时可以直接写如："image/jpeg 、 image/png等的类型"
        pickIntent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(pickIntent, REQUESTCODE_PICK);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading(boolean isFirstLoad) {

    }

    @Override
    public void showErr(String err) {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        switch (requestCode) {
            case REQUESTCODE_PICK:// 直接从相册获取
                try {
                    startPhotoZoom(data.getData());
                } catch (NullPointerException e) {
                    e.printStackTrace();// 用户点击取消操作
                }
                break;
            case REQUESTCODE_TAKE:// 调用相机拍照
                File temp = new File(Environment.getExternalStorageDirectory() + "/" + IMAGE_FILE_NAME);
                startPhotoZoom(Uri.fromFile(temp));
                break;
            case REQUESTCODE_CUTTING:// 取得裁剪后的图片
                if (data != null) {
                    setPicToView(data);
                }
                break;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    /**
     * 裁剪图片方法实现
     * @param uri
     */
    public void startPhotoZoom(Uri uri) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        // crop=true是设置在开启的Intent中设置显示的VIEW可裁剪
        intent.putExtra("crop", "true");
        // aspectX aspectY 是宽高的比例
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        // outputX outputY 是裁剪图片宽高
        intent.putExtra("outputX", 300);
        intent.putExtra("outputY", 300);
        intent.putExtra("return-data", true);
        startActivityForResult(intent, REQUESTCODE_CUTTING);
    }

    /**
     * 保存裁剪之后的图片数据
     * @param picdata
     */
    private void setPicToView(Intent picdata) {
        Bundle extras = picdata.getExtras();
        if (extras != null) {
            // 取得SDCard图片路径做显示
            Bitmap photo = extras.getParcelable("data");
            Drawable drawable = new BitmapDrawable(null, photo);
            urlpath = FileUtil.saveFile(this, "temphead.jpg", photo);
            CircleImageView circleImageView = (CircleImageView) findViewById(R.id.ci_avatar);
            circleImageView.setImageBitmap(photo);
        }
    }
}
