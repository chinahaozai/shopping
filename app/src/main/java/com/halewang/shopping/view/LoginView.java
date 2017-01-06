package com.halewang.shopping.view;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by halewang on 2016/12/6.
 */

public interface LoginView extends BaseView{
    EditText getUser();
    EditText getpassword();
    TextView getSignUp();
    TextView getForgetPassword();
    Button getLogin();
}
