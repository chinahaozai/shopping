package com.halewang.shopping.model.bean.joy;

import java.util.List;

/**
 * Created by halewang on 2016/12/8.
 */

public class JoyData {
    private List<Joy> data;

    public List<Joy> getData() {
        return data;
    }

    public void setData(List<Joy> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JoyData{" +
                "data=" + data +
                '}';
    }
}
