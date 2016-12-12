package com.halewang.shopping.model.bean.randjoy;

import com.halewang.shopping.model.bean.joy.Joy;

import java.util.List;

/**
 * Created by halewang on 2016/12/12.
 */

public class RandJoyBean {

    private String reason;
    private String error_code;
    private List<Joy> result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public List<Joy> getResult() {
        return result;
    }

    public void setResult(List<Joy> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "RandJoyBean{" +
                "reason='" + reason + '\'' +
                ", error_code='" + error_code + '\'' +
                ", result=" + result +
                '}';
    }
}
