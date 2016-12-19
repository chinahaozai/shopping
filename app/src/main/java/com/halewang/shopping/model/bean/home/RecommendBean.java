package com.halewang.shopping.model.bean.home;

import java.util.List;

/**
 * Created by halewang on 2016/12/19.
 */

public class RecommendBean {

    private List<Recommend> items;
    private int nextpage;
    private int status;

    public List<Recommend> getItems() {
        return items;
    }

    public void setItems(List<Recommend> items) {
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
        return "RecommendBean{" +
                "items=" + items +
                ", nextpage=" + nextpage +
                ", status=" + status +
                '}';
    }
}
