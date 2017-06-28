package com.canghailongyin.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mingyue on 2017/6/28.
 */
public class DateUtils {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String getDate(){
        return sdf.format(new Date());
    }
}
