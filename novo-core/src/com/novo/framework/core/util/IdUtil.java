package com.novo.framework.core.util;

import java.util.Date;

public class IdUtil {

    public static Long getId() {
        long date = new Date().getTime();
        long random = (long) (Math.random() * 89999) + 10000;
        return Long.valueOf(((date + "") + (random + "")));
    }

}
