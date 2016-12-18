package com.halewang.shopping.model.bean.banner;

import java.util.List;

/**
 * Created by Wang Hao on 2016/12/18.
 */

public class BannerBean {
    private List<BannerDetail> items;
    private int nextpage;
    private int status;

    public List<BannerDetail> getItems() {
        return items;
    }

    public void setItems(List<BannerDetail> items) {
        this.items = items;
    }

    public int getNextpage() {
        return nextpage;
    }

    public void setNextpage(int nextpage) {
        this.nextpage = nextpage;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BannerBean{" +
                "items=" + items +
                ", nextpage=" + nextpage +
                ", status=" + status +
                '}';
    }
}
