package com.halewang.shopping.view;

import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by halewang on 2016/12/6.
 */

public interface SignUpView extends BaseView{
    CircleImageView getCircleAvatar();
    EditText getUser();
    EditText getPassword();
    EditText getPasswordConfirm();
    Button getBtnCommit();
    FrameLayout getSignLayout();
    void takePhoto();
    void pickPhoto();

}
