package com.halewang.shopping.model.bean.home;

import java.util.List;

/**
 * Created by halewang on 2016/12/27.
 */

public class HomeBean {
    private List<Home> items;
    private int nextpage;
    private int status;

    public List<Home> getItems() {
        return items;
    }

    public void setItems(List<Home> items) {
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
        return "HomeBean{" +
                "items=" + items +
                ", nextpage=" + nextpage +
                ", status=" + status +
                '}';
    }
}
