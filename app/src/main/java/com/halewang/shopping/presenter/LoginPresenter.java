package com.halewang.shopping.presenter;

import android.content.Context;
import android.graphics.Paint;
import android.support.design.widget.Snackbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.halewang.shopping.model.bean.user.User;
import com.halewang.shopping.utils.InternetUtil;
import com.halewang.shopping.utils.PatternUtil;
import com.halewang.shopping.view.LoginView;

import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

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
    }

    private void initView() {
        mView = getMvpView();
        etUser = mView.getUser();
        etPassWord = mView.getpassword();
        tvSignUp = mView.getSignUp();
        tvForgetPassword = mView.getForgetPassword();
        tvForgetPassword.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
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

                if(result){
                    doLogin();
                }

            }
        });
    }

    /**
     * 真正执行登录操作
     */
    private void doLogin(){
        BmobQuery<User> userQuery = new BmobQuery<>();
        userQuery.addWhereEqualTo("phone", etUser.getText().toString());
        userQuery.addWhereEqualTo("password", etPassWord.getText().toString());
        userQuery.findObjects(new FindListener<User>() {
            @Override
            public void done(List<User> list, BmobException e) {
                if(list.size() > 0){
                    Log.d(TAG, "登录成功");
                }else{
                    Log.d(TAG, "登录失败");
                }
            }
        });
    }
}
