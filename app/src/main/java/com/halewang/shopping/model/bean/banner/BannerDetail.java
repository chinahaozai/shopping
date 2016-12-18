package com.halewang.shopping.model.bean.banner;

/**
 * Created by Wang Hao on 2016/12/18.
 */

public class BannerDetail {
    private String money_url;
    private String pic;
    private String post_title;
    private String post_url;
    private String slide_thumb;
    private String time;

    public String getMoney_url() {
        return money_url;
    }

    public void setMoney_url(String money_url) {
        this.money_url = money_url;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
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

    public String getSlide_thumb() {
        return slide_thumb;
    }

    public void setSlide_thumb(String slide_thumb) {
        this.slide_thumb = slide_thumb;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "BannerDetail{" +
                "money_url='" + money_url + '\'' +
                ", pic='" + pic + '\'' +
                ", post_title='" + post_title + '\'' +
                ", post_url='" + post_url + '\'' +
                ", slide_thumb='" + slide_thumb + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
