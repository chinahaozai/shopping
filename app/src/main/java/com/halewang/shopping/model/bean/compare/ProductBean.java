package com.halewang.shopping.model.bean.compare;

/**
 * Created by halewang on 2016/11/21.
 */

public class ProductBean {
    private String error_code;
    private String reason;
    private Result result;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ProductBean{" +
                "result=" + result +
                ", reason='" + reason + '\'' +
                ", error_code='" + error_code + '\'' +
                '}';
    }
}
