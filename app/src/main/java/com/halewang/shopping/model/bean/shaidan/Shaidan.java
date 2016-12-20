package com.halewang.shopping.model.bean.shaidan;

/**
 * Created by halewang on 2016/12/20.
 */

public class Shaidan {
    private String title;
    private String comment_num;
    private String content;
    private String show_url;
    private String id;
    private String thumb_picture;
    private UserBean user_info;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment_num() {
        return comment_num;
    }

    public void setComment_num(String comment_num) {
        this.comment_num = comment_num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getShow_url() {
        return show_url;
    }

    public void setShow_url(String show_url) {
        this.show_url = show_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThumb_picture() {
        return thumb_picture;
    }

    public void setThumb_picture(String thumb_picture) {
        this.thumb_picture = thumb_picture;
    }

    public UserBean getUser_info() {
        return user_info;
    }

    public void setUser_info(UserBean user_info) {
        this.user_info = user_info;
    }

    @Override
    public String toString() {
        return "Shaidan{" +
                "title='" + title + '\'' +
                ", comment_num='" + comment_num + '\'' +
                ", content='" + content + '\'' +
                ", show_url='" + show_url + '\'' +
                ", id='" + id + '\'' +
                ", thumb_picture='" + thumb_picture + '\'' +
                ", user_info=" + user_info +
                '}';
    }
}
