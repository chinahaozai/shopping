package com.halewang.shopping.model.bean.hot;

import java.util.List;

/**
 * Created by halewang on 2016/12/19.
 */

public class HotBean {
    private List<Hot> items;

    public List<Hot> getItems() {
        return items;
    }

    public void setItems(List<Hot> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "HotBean{" +
                "items=" + items +
                '}';
    }
}
