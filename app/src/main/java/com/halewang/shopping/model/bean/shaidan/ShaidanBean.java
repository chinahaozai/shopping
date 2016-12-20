package com.halewang.shopping.model.bean.shaidan;

import java.util.List;

/**
 * Created by halewang on 2016/12/20.
 */

public class ShaidanBean {
    private List<Shaidan> items;
    private int nextpage;
    private int status;

    public List<Shaidan> getItems() {
        return items;
    }

    public void setItems(List<Shaidan> items) {
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
        return "ShaidanBean{" +
                "items=" + items +
                ", nextpage=" + nextpage +
                ", status=" + status +
                '}';
    }
}
