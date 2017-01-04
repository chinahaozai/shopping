package com.halewang.shopping.utils;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by halewang on 2017/1/4.
 */

public class TimeUtil {

    public static String timeToDate(long time){
        SimpleDateFormat sdfTwo = new SimpleDateFormat("yyyy年MM月dd日HH时mm分",
                Locale.getDefault());
        return sdfTwo.format(time);
    }

    public static String timeToDate(String time){
        return timeToDate(Long.valueOf(time));
    }
}
