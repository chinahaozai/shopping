package com.halewang.shopping.model.bean.joy;

/**
 * Created by halewang on 2016/12/8.
 */

public class JoyBean {
    private String error_code;
    private String reason;
    private JoyData result;

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

    public JoyData getResult() {
        return result;
    }

    public void setResult(JoyData result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "JoyBean{" +
                "error_code='" + error_code + '\'' +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                '}';
    }
}
