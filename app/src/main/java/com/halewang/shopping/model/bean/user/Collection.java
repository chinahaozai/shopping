package com.halewang.shopping.model.bean.user;

import cn.bmob.v3.BmobObject;

/**
 * Created by halewang on 2016/12/30.
 */

public class Collection extends BmobObject{
    private String phone;
    private String image_url;
    private String show_title;
    private String show_url;
    private String buy_url;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getShow_title() {
        return show_title;
    }

    public void setShow_title(String title) {
        this.show_title = title;
    }

    public String getShow_url() {
        return show_url;
    }

    public void setShow_url(String show_url) {
        this.show_url = show_url;
    }

    public String getBuy_url() {
        return buy_url;
    }

    public void setBuy_url(String buy_url) {
        this.buy_url = buy_url;
    }
}
