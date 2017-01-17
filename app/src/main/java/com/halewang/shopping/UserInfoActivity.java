package com.halewang.shopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.halewang.shopping.utils.PrefUtil;

public class UserInfoActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView ivAvatar;
    private EditText etUsername;
    private EditText etPassword;
    private Button btnCommitUsername;
    private Button btnCommitPassword;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        initView();
        initData();

    }

    private void initView(){
        ivAvatar = (ImageView) findViewById(R.id.iv_avatar);
        etUsername = (EditText) findViewById(R.id.et_username);
        etPassword = (EditText) findViewById(R.id.et_password);
        btnCommitUsername = (Button) findViewById(R.id.btn_commit_username);
        btnCommitPassword = (Button) findViewById(R.id.btn_commit_password);
        btnLogout = (Button) findViewById(R.id.btn_logout);
    }

    private void initData(){
        Glide.with(this)
                .load(PrefUtil.getString(this,LoginActivity.AVATAR,""))
                .centerCrop()
                .into(ivAvatar);

        etUsername.setText(PrefUtil.getString(this,LoginActivity.USER,""));

        btnCommitUsername.setOnClickListener(this);
        btnCommitPassword.setOnClickListener(this);
        btnLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_commit_username:
                commitUsername();
                break;
            case R.id.btn_commit_password:
                commitPassword();
                break;
            case R.id.btn_logout:
                logout();
                break;
            default:
                break;
        }
    }

    private void commitUsername(){

    }

    private void commitPassword(){

    }

    private void logout(){
        PrefUtil.putBoolean(this,LoginActivity.IS_ONLINE,false);
        finish();
    }
}
