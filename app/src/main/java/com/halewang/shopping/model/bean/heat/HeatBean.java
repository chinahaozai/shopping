package com.halewang.shopping.model.bean.heat;

import java.util.List;

/**
 * Created by halewang on 2017/1/3.
 */

public class HeatBean {
    private List<Heat> products;
    private int rtn;

    public List<Heat> getProducts() {
        return products;
    }

    public void setProducts(List<Heat> products) {
        this.products = products;
    }

    public int getRtn() {
        return rtn;
    }

    public void setRtn(int rtn) {
        this.rtn = rtn;
    }

    @Override
    public String toString() {
        return "HeatBean{" +
                "products=" + products +
                ", rtn=" + rtn +
                '}';
    }
}
