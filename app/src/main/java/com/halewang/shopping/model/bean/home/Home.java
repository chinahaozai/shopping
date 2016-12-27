package com.halewang.shopping.model.bean.home;

/**
 * Created by halewang on 2016/12/27.
 */

public class Home {
    private String baichuan_link;
    private int comment_coun;
    private String exact_time;
    private String id;
    private String item_name;
    private String money_url;
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

    public int getComment_coun() {
        return comment_coun;
    }

    public void setComment_coun(int comment_coun) {
        this.comment_coun = comment_coun;
    }

    public String getExact_time() {
        return exact_time;
    }

    public void setExact_time(String exact_time) {
        this.exact_time = exact_time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getMoney_url() {
        return money_url;
    }

    public void setMoney_url(String money_url) {
        this.money_url = money_url;
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
        return "Home{" +
                "baichuan_link='" + baichuan_link + '\'' +
                ", comment_coun=" + comment_coun +
                ", exact_time='" + exact_time + '\'' +
                ", id='" + id + '\'' +
                ", item_name='" + item_name + '\'' +
                ", money_url='" + money_url + '\'' +
                ", post_title='" + post_title + '\'' +
                ", post_url='" + post_url + '\'' +
                ", price='" + price + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
