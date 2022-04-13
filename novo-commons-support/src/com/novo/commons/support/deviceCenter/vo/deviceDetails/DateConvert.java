package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import org.apache.commons.beanutils.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author BinksRao on 2020/9/30
 */
public class DateConvert implements Converter {
    @Override
    public Object convert(Class class1, Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof Date) {
            return value;
        }
        if (value instanceof Long) {
            Long longValue = (Long) value;
            return new Date(longValue.longValue());
        }
        if (value instanceof String) {
            String dateStr = (String) value;
            Date endTime = null;
            try {
                String regexp1 = "([0-9]{4})-([0-1][0-9])-([0-3][0-9])T([0-2][0-9]):([0-6][0-9]):([0-6][0-9])";
                String regexp2 = "([0-9]{4})-([0-1][0-9])-([0-3][0-9]) ([0-2][0-9]):([0-6][0-9]):([0-6][0-9])";
                String regexp3 = "([0-9]{4})-([0-1][0-9])-([0-3][0-9])";
                if (dateStr.matches(regexp1)) {
                    dateStr = dateStr.split("T")[0] + " " + dateStr.split("T")[1];
                    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    endTime = sdf.parse(dateStr);
                    return endTime;
                } else if (dateStr.matches(regexp2)) {
                    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    endTime = sdf.parse(dateStr);
                    return endTime;
                } else if (dateStr.matches(regexp3)) {
                    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    endTime = sdf.parse(dateStr);
                    return endTime;
                } else {
                    return dateStr;
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return value;
    }
}