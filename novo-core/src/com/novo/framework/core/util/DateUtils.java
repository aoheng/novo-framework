package com.novo.framework.core.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by aoheng
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {

    private static final String YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";

    private static final String YYYYMMDD_HHMMSS = "yyyyMMdd_HHmmss";

    public static long getDifferSeconds(Date date) {
        return (date.getTime() - System.currentTimeMillis()) / 1000;
    }

    public static long getDifferMinutes(Date date) {
        return (date.getTime() - System.currentTimeMillis()) / 1000 / 60;
    }

    public static long getDifferHours(Date date) {
        return (date.getTime() - System.currentTimeMillis()) / 1000 / 60 / 60;
    }

    public static long getDifferDays(Date date) {
        return (date.getTime() - System.currentTimeMillis()) / 1000 / 60 / 60 / 24;
    }

    public static String long2DateString(String dateFormat, Long millSec) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        Date date = new Date(millSec);
        return sdf.format(date);
    }

    /** 时间戳转日期 */
    public static Date long2Date(long timestamp) {
        int len = String.valueOf(timestamp).length();
        if (len <= 10 && len > 0)
            return new Date(timestamp * 1000);
        if (len == 13)
            return new Date(timestamp);
        throw new UnsupportedOperationException(String.format("DateUtils.long2Date方法的参数（%s）不合法", timestamp));
    }

    public static String date2String(Date date) {
        return date2String(date, YYYYMMDDHHMMSS);
    }

    public static String date2String(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    public static Date string2Date(String date) throws ParseException {
        return string2Date(date, YYYYMMDDHHMMSS);
    }

    public static Date string2Date(String date, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(date);
    }

    /**
     * 比较两个日期
     */
    public static int compareDate(String DATE1, String DATE2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        int result = -999;
        try {
            Date dt1 = df.parse(DATE1);
            Date dt2 = df.parse(DATE2);
            if (dt1.getTime() > dt2.getTime()) {
                return result = 1;//dt1 在dt2前
            } else if (dt1.getTime() < dt2.getTime()) {
                return result = -1;//dt1在dt2后
            } else {
                return result = 0;//dt1=dt2
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return result;
    }

    /**
     * 格式化日期格式为：yyMMMdd<br>
     * generate by: vakin jiang
     * at 2012-10-17
     */
    public static String formatToyymmdd(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        return format.format(date).toUpperCase();
    }


    /**
     * 格式化日期格式为：yyMMMdd<br>
     * generate by: vakin jiang
     * at 2012-10-17
     */
    public static String formatToHHmmss(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("HHmmss", Locale.ENGLISH);
        return format.format(date).toUpperCase();
    }

    /** 获取指定日期所属当周一开始时间 */
    public static Date getRelatedWeekStart(Date dt) {
        TemporalField fieldISO = WeekFields.of(Locale.FRANCE).dayOfWeek();
        LocalDate localDate = date2LocalDate(dt).with(fieldISO, 1);
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /** 获取指定日期所属当周日开始时间 */
    public static Date getRelatedWeekEnd(Date dt) {
        TemporalField fieldISO = WeekFields.of(Locale.FRANCE).dayOfWeek();
        LocalDate localDate = date2LocalDate(dt).with(fieldISO, 7);
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /** 获取指定日期所属当月第一天开始时间 */
    public static Date getRelatedMonthStart(Date dt) {
        LocalDate localDate = date2LocalDate(dt).with(TemporalAdjusters.firstDayOfMonth());
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /** 获取指定日期所属当月最后一天开始时间 */
    public static Date getRelatedMonthEnd(Date dt) {
        LocalDate localDate = date2LocalDate(dt).with(TemporalAdjusters.lastDayOfMonth());
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /** date转换成localdate */
    public static LocalDate date2LocalDate(Date dt) {
        Instant instant = dt.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        return localDateTime.toLocalDate();
    }

    /** 获取本周一开始时间 */
    public static Date getCurrentWeekStart() {
        return getRelatedWeekStart(new Date());
    }

    /** 获取本周日开始时间 */
    public static Date getCurrentWeekEnd() {
        return getRelatedWeekEnd(new Date());
    }

    /** 获取本月第一天开始时间 */
    public static Date getCurrentMonthStart() {
        return getRelatedMonthStart(new Date());
    }

    /** 获取本月最后一天开始时间 */
    public static Date getCurrentMonthEnd() {
        return getRelatedMonthEnd(new Date());
    }

    public static int daysBetween(Date smdate, Date bdate) {
        Calendar cal = Calendar.getInstance();
        long time1 = 0;
        long time2 = 0;
        try {
            cal.setTime(smdate);
            time1 = cal.getTimeInMillis();
            cal.setTime(bdate);
            time2 = cal.getTimeInMillis();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long between_days = (time2 - time1) / (1000 * 3600 * 24);
        return Integer.parseInt(String.valueOf(between_days));
    }

    public static boolean hasSameDay(int[] d1, int[] d2) {
        for (int i : d1) {
            for (int j : d2) {
                if (i == j)
                    return true;
            }
        }
        return false;
    }
}
