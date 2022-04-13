package com.novo.commons.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: duanwenyou
 * @Description: 根据日期，转换成星座、生肖工具类
 * @Date: Created in 14:33 2020/03/12
 */
public class ZodiacUtil {

    public static final String[] zodiacArray = {"猴", "鸡", "狗", "猪", "鼠", "牛",
            "虎", "兔", "龙", "蛇", "马", "羊"};

    public static final String[] constellationArray = {"水瓶座", "双鱼座", "牡羊座",
            "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "魔羯座"};

    public static final int[] constellationEdgeDay = {20, 19, 21, 21, 21, 22,
            23, 23, 23, 23, 22, 22};

    /**
     * 根据日期获取生肖
     *
     * @return
     */
    public static String date2Zodica(Calendar time) {
        return zodiacArray[time.get(Calendar.YEAR) % 12];
    }

    /**
     * 根据日期获取生肖
     *
     * @return
     */
    public static String date2Zodica(String time) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = sdf.parse(time);
            c.setTime(date);

            String zodica = date2Zodica(c);
            System.out.println("生肖：" + zodica);
            return zodica;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据日期获取星座
     *
     * @param time
     * @return
     */
    public static String date2Constellation(Calendar time) {
        int month = time.get(Calendar.MONTH);
        int day = time.get(Calendar.DAY_OF_MONTH);
        if (day < constellationEdgeDay[month]) {
            month = month - 1;
        }
        if (month >= 0) {
            return constellationArray[month];
        }
        // default to return 魔羯
        return constellationArray[11];
    }

    /**
     * 根据日期获取星座
     *
     * @param time
     * @return
     */
    public static String date2Constellation(String time) {

        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = sdf.parse(time);
            c.setTime(date);

            String constellation = date2Constellation(c);
            System.out.println("星座：" + constellation);
            return constellation;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static void main(String[] args) {
        String test = date2Constellation(Calendar.getInstance());
        System.out.println("星座：" + test);
        String test1 = date2Zodica(Calendar.getInstance());
        System.out.println("生肖：" + test1);

        String dateStr = "1990-11-28";
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = sdf.parse(dateStr);
            c.setTime(date);

            String constellation = date2Constellation(c);
            System.out.println("星座：" + constellation);
            String zodica = date2Zodica(c);
            System.out.println("生肖：" + zodica);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}