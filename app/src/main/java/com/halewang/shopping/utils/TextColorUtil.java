package com.halewang.shopping.utils;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;

/**
 * Created by halewang on 2016/12/28.
 */

public class TextColorUtil {
    /**
     * 将字符串中的钱的部分变成红色
     *
     * @param str
     * @return
     */
    public static SpannableStringBuilder moneyTurnRed(String str) {
        SpannableStringBuilder builder = new SpannableStringBuilder(str);
        int start1 = str.indexOf("￥");
        int start2 = str.indexOf("$");
        int start3 = str.indexOf("日元");
        int begin = start1 != -1 ? start1 : start2 != -1 ? start2 : start3;
        int end = str.length();

        if (begin != -1) {
            builder.setSpan(new ForegroundColorSpan(Color.RED), begin, end, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        }else{
            Log.d("TEST_METHOD", str);
        }
        return builder;
    }
}
