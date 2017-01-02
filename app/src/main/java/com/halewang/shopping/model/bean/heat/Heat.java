package com.halewang.shopping.model.bean.heat;

/**
 * Created by Wang Hao on 2017/1/2.
 */

public class Heat {
    private String buyaddr;
    private String hot;
    private String id;
    private String img;
    private String title;
    private String titleurl;

    public String getBuyaddr() {
        return buyaddr;
    }

    public void setBuyaddr(String buyaddr) {
        this.buyaddr = buyaddr;
    }

    public String getHot() {
        return hot;
    }

    public void setHot(String hot) {
        this.hot = hot;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleurl() {
        return titleurl;
    }

    public void setTitleurl(String titleurl) {
        this.titleurl = titleurl;
    }

    @Override
    public String toString() {
        return "Heat{" +
                "buyaddr='" + buyaddr + '\'' +
                ", hot='" + hot + '\'' +
                ", id='" + id + '\'' +
                ", img='" + img + '\'' +
                ", title='" + title + '\'' +
                ", titleurl='" + titleurl + '\'' +
                '}';
    }
}
