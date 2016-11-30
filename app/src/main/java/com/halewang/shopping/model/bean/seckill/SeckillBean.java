package com.halewang.shopping.model.bean.seckill;

import java.util.List;

/**
 * Created by halewang on 2016/11/30.
 */

public class SeckillBean {
    private String datetime;
    private int code;
    private String message;
    private String website;
    private List<Seckill> goodslist;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Seckill> getGoodslist() {
        return goodslist;
    }

    public void setGoodslist(List<Seckill> goodslist) {
        this.goodslist = goodslist;
    }

    @Override
    public String toString() {
        return "SeckillBean{" +
                "datetime='" + datetime + '\'' +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", website='" + website + '\'' +
                ", goodslist=" + goodslist +
                '}';
    }
}
