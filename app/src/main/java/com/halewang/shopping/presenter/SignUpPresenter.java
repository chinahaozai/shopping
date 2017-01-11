package com.halewang.shopping.presenter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.Snackbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.halewang.shopping.LoginActivity;
import com.halewang.shopping.R;
import com.halewang.shopping.SignUpActivity;
import com.halewang.shopping.model.bean.user.User;
import com.halewang.shopping.utils.InternetUtil;
import com.halewang.shopping.utils.MD5Util;
import com.halewang.shopping.utils.PatternUtil;
import com.halewang.shopping.utils.PrefUtil;
import com.halewang.shopping.view.LoginView;
import com.halewang.shopping.view.SignUpView;
import com.halewang.shopping.widght.fitsystemwindowlayout.SelectPicPopupWindow;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;
import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
import cn.smssdk.gui.RegisterPage;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by halewang on 2017/1/6.
 */

public class SignUpPresenter extends BasePresenter<SignUpView> {

    private static final String TAG = "LoginPresenter";

    private Context mContext;
    private SignUpView mView;
    private CircleImageView mCircleAvatar;
    private EditText etUser;
    private EditText etPassWord;
    private EditText etPassWordConfirm;
    private Button btnCommit;
    private SelectPicPopupWindow menuWindow;
    private boolean result = true;


    public SignUpPresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void onStart() {
        initView();
    }

    private void initView(){
        mView = getMvpView();
        mCircleAvatar = mView.getCircleAvatar();
        etUser = mView.getUser();
        etPassWord = mView.getPassword();
        etPassWordConfirm = mView.getPasswordConfirm();
        btnCommit = mView.getBtnCommit();

        mCircleAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuWindow = new SelectPicPopupWindow(mContext, itemsOnClick);
                menuWindow.showAtLocation(mView.getSignLayout(),
                        Gravity.BOTTOM| Gravity.CENTER_HORIZONTAL, 0, 0);
            }
        });

        btnCommit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commit();
            }
        });
    }

    //为弹出窗口实现监听类
    private View.OnClickListener itemsOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            menuWindow.dismiss();
            switch (v.getId()) {
                // 拍照
                case R.id.takePhotoBtn:

                    mView.takePhoto();
                    break;
                // 相册选择图片
                case R.id.pickPhotoBtn:

                    mView.pickPhoto();
                    break;
                default:
                    break;
            }
        }
    };

    private void commit(){
        switch (1) {
            case 1:
                if (!InternetUtil.isNetworkAvailable(mContext)) {
                    Snackbar.make(mView.getSignLayout(), "网络连接失败，请检测网络", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    result = false;
                    break;
                }
            case 2:
                if (TextUtils.isEmpty(etUser.getText().toString())) {
                    Snackbar.make(mView.getSignLayout(), "用户名不能为空", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    result = false;
                    break;
                }
            case 3:
                if (!TextUtils.isEmpty(etPassWord.getText().toString()) && !PatternUtil.matchPassword(etPassWord.getText().toString())) {
                    Snackbar.make(mView.getSignLayout(), "请使用6-16位且不包含特殊字符的密码", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    result = false;
                    break;
                }
            case 4:
                if(!TextUtils.isEmpty(etPassWord.getText().toString()) && !TextUtils.isEmpty(etPassWordConfirm.getText().toString())){
                    if(!etPassWord.getText().toString().equals(etPassWordConfirm.getText().toString())){
                        Snackbar.make(mView.getSignLayout(), "密码不一致", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                        result = false;
                    }
                }else{
                    Snackbar.make(mView.getSignLayout(), "密码不能为空", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    result = false;
                }
                break;
            default:
                break;
        }

        if(result){
            doCommit();
        }
    }

    private void doCommit(){
        User user = new User();
        user.setName(etUser.getText().toString());
        user.setPhone(SignUpActivity.phoneNum);
        user.setPassword(MD5Util.encrypt(etPassWord.getText().toString()));
        user.setAvatar(SignUpActivity.avatarPath);
        user.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {
                if(e == null){
                    Toast.makeText(mContext,"注册成功",Toast.LENGTH_SHORT).show();
                    SignUpActivity mActivity = (SignUpActivity) mView;
                    mActivity.finish();
                }else{
                    Toast.makeText(mContext,"注册失败",Toast.LENGTH_SHORT).show();
                    Log.d(TAG, "注册失败: "+e.getMessage());
                }
            }
        });
    }
}
