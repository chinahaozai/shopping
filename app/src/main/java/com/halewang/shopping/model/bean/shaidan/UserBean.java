package com.halewang.shopping.model.bean.shaidan;

/**
 * Created by halewang on 2016/12/20.
 */

public class UserBean {
    private String avatar;
    private String avatar200;
    private int id;
    private String nickname;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar200() {
        return avatar200;
    }

    public void setAvatar200(String avatar200) {
        this.avatar200 = avatar200;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "User{" +
                "AVATAR='" + avatar + '\'' +
                ", avatar200='" + avatar200 + '\'' +
                ", id=" + id +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
