package com.halewang.shopping.model.bean.compare;

/**
 * Created by halewang on 2016/11/21.
 */

public class ProductDetail {
    private String spname;
    private String sppic;
    private String spurl;
    private String spprice;
    private String className;
    private String brandName;
    private String siteName;
    private String commentUrl;
    private String commentCount;
    private String TitleHighLighter;
    private String ziying;
    private String siteid;
    private String id;

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    public String getSppic() {
        return sppic;
    }

    public void setSppic(String sppic) {
        this.sppic = sppic;
    }

    public String getSpurl() {
        return spurl;
    }

    public void setSpurl(String spurl) {
        this.spurl = spurl;
    }

    public String getSpprice() {
        return spprice;
    }

    public void setSpprice(String spprice) {
        this.spprice = spprice;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getCommentUrl() {
        return commentUrl;
    }

    public void setCommentUrl(String commentUrl) {
        this.commentUrl = commentUrl;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getTitleHighLighter() {
        return TitleHighLighter;
    }

    public void setTitleHighLighter(String titleHighLighter) {
        TitleHighLighter = titleHighLighter;
    }

    public String getZiying() {
        return ziying;
    }

    public void setZiying(String ziying) {
        this.ziying = ziying;
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductDetail{" +
                "spname='" + spname + '\'' +
                ", sppic='" + sppic + '\'' +
                ", spurl='" + spurl + '\'' +
                ", spprice='" + spprice + '\'' +
                ", className='" + className + '\'' +
                ", brandName='" + brandName + '\'' +
                ", siteName='" + siteName + '\'' +
                ", commentUrl='" + commentUrl + '\'' +
                ", commentCount='" + commentCount + '\'' +
                ", TitleHighLighter='" + TitleHighLighter + '\'' +
                ", ziying='" + ziying + '\'' +
                ", siteid='" + siteid + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
