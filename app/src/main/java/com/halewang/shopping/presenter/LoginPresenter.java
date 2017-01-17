package com.halewang.shopping.presenter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.halewang.shopping.LoginActivity;
import com.halewang.shopping.SignUpActivity;
import com.halewang.shopping.model.bean.user.User;
import com.halewang.shopping.utils.InternetUtil;
import com.halewang.shopping.utils.MD5Util;
import com.halewang.shopping.utils.PatternUtil;
import com.halewang.shopping.utils.PrefUtil;
import com.halewang.shopping.view.LoginView;

import java.util.HashMap;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
import cn.smssdk.gui.RegisterPage;

/**
 * Created by halewang on 2017/1/6.
 */

public class LoginPresenter extends BasePresenter<LoginView> {

    private static final String TAG = "LoginPresenter";

    private Context mContext;
    private LoginView mView;
    private EditText etUser;
    private EditText etPassWord;
    private TextView tvSignUp;
    private TextView tvForgetPassword;
    private Button btnLogin;

    boolean result = true;

    public LoginPresenter(Context mContext) {
        this.mContext = mContext;

    }

    @Override
    public void onStart() {
        initView();
        login();
        initSignUp();
    }

    private void initView() {
        mView = getMvpView();
        etUser = mView.getUser();
        etPassWord = mView.getpassword();
        tvSignUp = mView.getSignUp();
        tvForgetPassword = mView.getForgetPassword();
        tvForgetPassword.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        tvForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"该功能暂停使用",Toast.LENGTH_SHORT).show();
            }
        });
        btnLogin = mView.getLogin();
    }

    /**
     * 检测登录前准备
     */
    private void login() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (1) {
                    case 1:
                        if (!InternetUtil.isNetworkAvailable(mContext)) {
                            Snackbar.make(btnLogin, "网络连接失败，请检测网络", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            result = false;
                        }
                    case 2:
                        if (!TextUtils.isEmpty(etUser.getText().toString()) && PatternUtil.matchUserName(etUser.getText().toString())) {

                        } else {
                            Snackbar.make(btnLogin, "用户名格式不正确", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            result = false;
                        }
                    case 3:
                        if (TextUtils.isEmpty(etPassWord.getText().toString())) {
                            Snackbar.make(btnLogin, "密码不能为空", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            result = false;
                        }
                        break;
                    default:
                        break;
                }

                if (result) {
                    mView.showLoading();
                    doLogin();
                }

            }
        });
    }

    /**
     * 真正执行登录操作
     */
    private void doLogin() {
        Log.d(TAG, "doLogin: " + MD5Util.encrypt(etPassWord.getText().toString()));
        System.out.println("加密后的密码" + MD5Util.encrypt(etPassWord.getText().toString()));
        BmobQuery<User> userQuery = new BmobQuery<>();
        userQuery.addWhereEqualTo("phone", etUser.getText().toString());
        userQuery.addWhereEqualTo("password", MD5Util.encrypt(etPassWord.getText().toString()));
        userQuery.findObjects(new FindListener<User>() {
            @Override
            public void done(List<User> list, BmobException e) {
                if (list.size() > 0) {
                    User user = list.get(0);
                    PrefUtil.putString(mContext, LoginActivity.USER, user.getName());
                    PrefUtil.putString(mContext, LoginActivity.PHONE, user.getPhone());
                    PrefUtil.putString(mContext, LoginActivity.AVATAR, user.getAvatar());
                    PrefUtil.putBoolean(mContext, LoginActivity.IS_ONLINE, true);
                    LoginActivity loginActivity = (LoginActivity) mView;
                    loginActivity.finish();
                    Toast.makeText(mContext, "登录成功", Toast.LENGTH_SHORT).show();
                    Log.d(TAG, "登录成功");
                } else {
                    Log.d(TAG, "登录失败");
                }
                mView.hideLoading(true);
            }
        });
    }

    private void initSignUp() {
        SMSSDK.initSDK(mContext, "19e6883036546", "af7b43a7fee9b57942003b40c665acdd");

        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSignUp();
                //mContext.startActivity(new Intent(mContext, SignUpActivity.class));
            }
        });
    }

    private void doSignUp() {
        //打开注册页面
        RegisterPage registerPage = new RegisterPage();
        registerPage.setRegisterCallback(new EventHandler() {
            public void afterEvent(int event, int result, Object data) {
                Log.d(TAG, "register: " + "到了回调事件里");

                // 解析注册结果
                if (result == SMSSDK.RESULT_COMPLETE) {
                    @SuppressWarnings("unchecked")
                    HashMap<String, Object> phoneMap = (HashMap<String, Object>) data;
                    String country = (String) phoneMap.get("country");
                    String phone = (String) phoneMap.get("phone");
                    Log.d(TAG, "country: " + country);
                    Log.d(TAG, "phone: " + phone);
                    // 提交用户信息（此方法可以不调用）
                    //registerUser(country, phone);
                    Intent intent = new Intent(mContext, SignUpActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString(SignUpActivity.PHONE_NUM, phone);
                    intent.putExtra(SignUpActivity.PHONE, bundle);
                    mContext.startActivity(intent);

                } else {
                    Log.d(TAG, "result: " + "失败");
                }
            }
        });
        registerPage.show(mContext);
    }
}
