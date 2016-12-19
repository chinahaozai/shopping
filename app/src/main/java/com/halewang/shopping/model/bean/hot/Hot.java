package com.halewang.shopping.model.bean.hot;

/**
 * Created by halewang on 2016/12/19.
 */

public class Hot {
    private String baichuan_link;
    private String comment_count;
    private String exact_time;
    private String post_title;
    private String post_url;
    private String price;
    private String thumbnail;
    private String time;

    public String getBaichuan_link() {
        return baichuan_link;
    }

    public void setBaichuan_link(String baichuan_link) {
        this.baichuan_link = baichuan_link;
    }

    public String getComment_count() {
        return comment_count;
    }

    public void setComment_count(String comment_count) {
        this.comment_count = comment_count;
    }

    public String getExact_time() {
        return exact_time;
    }

    public void setExact_time(String exact_time) {
        this.exact_time = exact_time;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPost_url() {
        return post_url;
    }

    public void setPost_url(String post_url) {
        this.post_url = post_url;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Hot{" +
                "baichuan_link='" + baichuan_link + '\'' +
                ", comment_count='" + comment_count + '\'' +
                ", exact_time='" + exact_time + '\'' +
                ", post_title='" + post_title + '\'' +
                ", post_url='" + post_url + '\'' +
                ", price='" + price + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
