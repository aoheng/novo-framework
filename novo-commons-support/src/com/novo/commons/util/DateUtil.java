package com.novo.commons.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期计算工具类
 * @author kemingheng
 * 2020年1月26日
 */
public class DateUtil {

	public static final String FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String DEFAULT_PATTERN_DAY = "yyyy-MM-dd";
	public static final String DEFAULT_PATTERN_HOUR = "yyyy-MM-dd HH";
	public static final String DEFAULT_PATTERN_MINUTE = "yyyy-MM-dd HH:mm";

	public static Date contractEndTime(int months) {
		Date date=new Date();
		String str=dateToString(date,FORMAT);
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		Date now = null;
		try {
			now = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		calendar.add(Calendar.MONTH, months);
		date=stringDate(sdf.format(calendar.getTime()),FORMAT);
		return date;
	}
	
	//续约
	public static Date contractEndTime(Date date,int months) {
		String str=dateToString(date,FORMAT);
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		Date now = null;
		try {
			now = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		calendar.add(Calendar.MONTH, months);
		date=stringDate(sdf.format(calendar.getTime()),FORMAT);
		return date;
	}

	//
	public static Date contractEndTime4Week(int week) {
		Date thisDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(thisDate);
		calendar.add(Calendar.WEEK_OF_YEAR, week);
		return calendar.getTime();
	}
	//
	public static Date contractEndTime4Week(Date thisDate, int week) {
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(thisDate);
			calendar.add(Calendar.WEEK_OF_YEAR, week);
			return calendar.getTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//
	public static Date contractEndTime4Day(int day) {
		Date thisDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(thisDate);
		calendar.add(Calendar.DAY_OF_YEAR, day);
		return calendar.getTime();
	}
	public static Date contractEndTime4Day(Date thisDate, int day) {
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(thisDate);
			calendar.add(Calendar.DAY_OF_YEAR, day);
			return calendar.getTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//
	public static Date contractEndTime4Hour(int hour) {
		Date thisDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(thisDate);
		calendar.add(Calendar.HOUR, hour);
		return calendar.getTime();
	}
	//
	public static Date contractEndTime4Hour(Date thisDate, int hour) {
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(thisDate);
			calendar.add(Calendar.HOUR, hour);
			return calendar.getTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//
	public static Date contractEndTime4Minute(int minute) {
		Date thisDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(thisDate);
		calendar.add(Calendar.MINUTE, minute);
		return calendar.getTime();
	}
	//
	public static Date contractEndTime4Minute(Date thisDate, int minute) {
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(thisDate);
			calendar.add(Calendar.MINUTE, minute);
			return calendar.getTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/*public static Date contractEndTime4Time(int time) {
		Date thisDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(thisDate);
		calendar.add(Calendar.WEEK_OF_YEAR, time);
		return calendar.getTime();
	}*/

	public static String dateToString(Date date,String type) {
		String dateStr = "";   
        //format的格式可以任意   
        DateFormat sdf = new SimpleDateFormat(type);   
        try {   
           dateStr = sdf.format(date);   
          
        } catch (Exception e) {   
            e.printStackTrace();   
        }  
	   return dateStr;
	}
	public static String dateToString(Date date) {
		String dateStr = "";
		//format的格式可以任意   
		DateFormat sdf = new SimpleDateFormat(FORMAT);
		try {
			dateStr = sdf.format(date);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateStr;
	}
	public static Date stringDate(String str,String type) {
        Date date=null;
        try {   
        	date= new SimpleDateFormat(type).parse(str);  
        } catch (Exception e) {   
            e.printStackTrace();   
        }  
	   return date;
	}
	public static Date stringDate(String dateStr) {
		Date date=null;
		try {
			date= new SimpleDateFormat(FORMAT).parse(dateStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	 /**  
     * 计算两个日期之间相差的天数  
     * @param smdate 较小的时间 
     * @param bdate  较大的时间 
     * @return 相差天数 
     * @throws ParseException  
     */    
    public static int daysBetween(Date smdate,Date bdate)     
    {    
        SimpleDateFormat sdf=new SimpleDateFormat(DEFAULT_PATTERN_DAY);
        try {
			smdate=sdf.parse(sdf.format(smdate));
			bdate=sdf.parse(sdf.format(bdate));  
		} catch (ParseException e) {
			e.printStackTrace();
		}  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(smdate);    
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(bdate);    
        long time2 = cal.getTimeInMillis();         
        long between_days=(time2-time1)/(1000*3600*24);  
            
       return Integer.parseInt(String.valueOf(between_days));           
    }   
    
    /**  
     * 计算两个日期之间相差的天数  
     * @param smdate 较小的时间 
     * @param bdate  较大的时间 
     * @return 相差天数 
     * @throws ParseException  
     */    
    public static int daysBetween(String smdate,String bdate)     
    {    
    	Date sdate=null,ddate=null;
        SimpleDateFormat sdf=new SimpleDateFormat(DEFAULT_PATTERN_DAY);
        try {
        	sdate=sdf.parse(smdate);
        	ddate=sdf.parse(bdate);  
		} catch (ParseException e) {
			e.printStackTrace();
		}  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(sdate);    
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(ddate);    
        long time2 = cal.getTimeInMillis();         
        long between_days=(time2-time1)/(1000*3600*24);  
            
       return Integer.parseInt(String.valueOf(between_days));           
    }   
    /**  
     * 计算两个日期之间相差的天数  
     * @param smdate 较小的时间 
     * @param bdate  较大的时间 
     * @return 相差天数 
     * @throws ParseException  
     */    
    public static int daysBetween(Date smdate,String bdate)     
    {    
    	Date ddate=null;
        SimpleDateFormat sdf=new SimpleDateFormat(DEFAULT_PATTERN_DAY);
        try {
        	smdate=sdf.parse(sdf.format(smdate));
        	ddate=sdf.parse(bdate);  
		} catch (ParseException e) {
			e.printStackTrace();
		}  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(smdate);    
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(ddate);    
        long time2 = cal.getTimeInMillis();         
        long between_days=(time2-time1)/(1000*3600*24);  
            
       return Integer.parseInt(String.valueOf(between_days));           
    }   
    
    /**
     * 获取N天后的日期
     * @param days
     * @return
     */
    public static String getAfterDatTime(int days) {
    	Calendar calendar2 = Calendar.getInstance();
	    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	    calendar2.add(Calendar.DATE, days);
	    String daysAfter = sdf2.format(calendar2.getTime());
		return daysAfter;
    }

	/**
	 * 指定日期,获取N天后的日期
	 * @param days
	 * @return
	 */
	public static String getAfterDatTime(String date,int days) {
		Calendar calendar2 = Calendar.getInstance();
		SimpleDateFormat sdf2 = new SimpleDateFormat(FORMAT);
		calendar2.setTimeInMillis(DateUtil.stringDate(date).getTime());
		calendar2.add(Calendar.DATE, days);
		String daysAfter = sdf2.format(calendar2.getTime());
		return daysAfter;
	}
    
    /**
     * 获取N分钟前的时间
     * @param minute
     * @return
     */
    public static String getBeforeMinuteTime(int minute) {
 	   SimpleDateFormat sdf=new SimpleDateFormat(FORMAT);
 	   Date date= new Date();
 	   String endTime=sdf.format(date.getTime()-1000*60*minute); //当前时间后N分钟
 	   return endTime;
    }

	/**
	 * 指定日期，获取N分钟前的时间
	 * @param minute
	 * @return
	 */
	public static String getBeforeMinuteTime(String date,int minute) {
		SimpleDateFormat sdf=new SimpleDateFormat(FORMAT);
		Date beforeDate= DateUtil.stringDate(date);
		String endTime=sdf.format(beforeDate.getTime()-1000*60*minute); //当前时间后N分钟
		return endTime;
	}
    
    /**
     * 获取N分钟后的日期
     * @param minute
     * @return
     */
   public static String getAfterMinuteTime(int minute) {
	   SimpleDateFormat sdf=new SimpleDateFormat(FORMAT);
	   Date date= new Date();
	   String startTime=sdf.format(date);                        //系统当前时间
	   String endTime=sdf.format(date.getTime()+1000*60*minute); //当前时间后N分钟
	   return endTime;
   }
   
   /**
    * 获取当前系统时间
    * @return String
    */
   public static String getCurrentTime() {
		Timestamp now=new Timestamp(System.currentTimeMillis());
		return now+"";
	}
   
   public static Date convertbeginDate(Date date) throws ParseException {
	   DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
	   DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	   String s = sdf.format(date);
	   
	   return sdf2.parse(s + " 00:00:00");
   }
   
   public static Date convertEndDate(Date date) throws ParseException {
	   DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
	   DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   String s = sdf.format(date);
	   
	   return sdf2.parse(s + " 23:59:59");
   }
   
    // 获得某天最大时间 2020-10-15 23:59:59
	public static Date getEndOfDay(Date date) {
		LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());;
		LocalDateTime endOfDay = localDateTime.with(LocalTime.MAX);
		return Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
	}
	
	// 获得某天最小时间 2020-10-15 00:00:00
	public static Date getStartOfDay(Date date) {
		LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
		LocalDateTime startOfDay = localDateTime.with(LocalTime.MIN);
		return Date.from(startOfDay.atZone(ZoneId.systemDefault()).toInstant());
	}


	public static String addMonth(String date,String dateType,int month){
		String nowDate = null;
		SimpleDateFormat format = new SimpleDateFormat(dateType);
		try {
			Date parse = format.parse(date);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(parse);
			calendar.add(Calendar.MONTH, month);
			nowDate = format.format(calendar.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return nowDate;
	}

	/**
	 * 时间戳转换成日期格式字符串
	 * @param millisecond 精确到毫秒的字符串
	 * @param format
	 * @return
	 */
	public static String timeStamp2Date(String millisecond,String format) {
		if(millisecond == null || millisecond.isEmpty() || millisecond.equals("null")){
			return "";
		}
		if(format == null || format.isEmpty()){
			format = FORMAT;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date(Long.valueOf(millisecond)));
	}

	/**
	 * 开始时间
	 * @param dateStr
	 * @return
	 */
	public static String startTimeString(String dateStr) {
		String date=null;
		try {
			date= dateStr+" 00:00:00";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 结束时间
	 * @param dateStr
	 * @return
	 */
	public static String endTimeString(String dateStr) {
		String date=null;
		try {
			date= dateStr+" 23:59:59";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
}
