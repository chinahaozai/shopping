package com.halewang.shopping;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.halewang.shopping.presenter.LoginPresenter;
import com.halewang.shopping.view.LoginView;

public class LoginActivity extends BaseActivity<LoginView,LoginPresenter> implements LoginView{

    public final static String USER_INFO = "user_info";     //SharePreferences 名字

    public final static String USER = "user";
    public final static String PHONE = "phone";
    public final static String AVATAR = "avatar";

    public final static String IS_ONLINE = "is_online";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        presenter.onStart();

    }

    @Override
    public LoginPresenter initPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    public EditText getUser() {
        return (EditText) findViewById(R.id.et_login_user);
    }

    @Override
    public EditText getpassword() {
        return (EditText) findViewById(R.id.et_login_password);
    }

    @Override
    public TextView getSignUp() {
        return (TextView) findViewById(R.id.tv_sign_up);
    }

    @Override
    public TextView getForgetPassword() {
        return (TextView) findViewById(R.id.tv_forget_password);
    }

    @Override
    public Button getLogin() {
        return (Button) findViewById(R.id.btn_login );
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

    /*public void saveMyBitmap(String bitName, Bitmap mBitmap) {
        File f = new File("/sdcard/" + bitName + ".png");
        try {
            f.createNewFile();
        } catch (IOException e) {

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
    }*/
}
