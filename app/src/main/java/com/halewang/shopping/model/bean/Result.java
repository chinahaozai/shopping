package com.halewang.shopping.model.bean;

import java.util.List;

/**
 * Created by halewang on 2016/11/21.
 */

public class Result {
    private int SearchItemsCount;
    private List<ProductDetail> SearchResultList;

    public int getSearchItemsCount() {
        return SearchItemsCount;
    }

    public void setSearchItemsCount(int searchItemsCount) {
        SearchItemsCount = searchItemsCount;
    }

    public List<ProductDetail> getSearchResultList() {
        return SearchResultList;
    }

    public void setSearchResultList(List<ProductDetail> searchResultList) {
        SearchResultList = searchResultList;
    }

    @Override
    public String toString() {
        return "Result{" +
                "SearchItemsCount=" + SearchItemsCount +
                ", SearchResultList=" + SearchResultList +
                '}';
    }
}
