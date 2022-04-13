package com.novo.commons.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;


/**
 * 随机生成   工具类
 * @author kemingheng   2020年9月30日
 */
public class RandomUtils {
	
	/**
	 * 6位随机数字验证码
	 * @return
	 */
	public static String getNumber(){
	    String code = new Random().nextInt(900000) + 100000 + "";
		return code;
	}
	
	/**
	 * 随机生成数字和英文
	 * @param length  随机长度
	 * @return
	 */
	public static String numChar(int length){
		String val = "";  
        Random random = new Random();  
        //参数length，表示生成几位随机数  
        for(int i = 0; i < length; i++) {  
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";  
            //输出字母还是数字  
            if( "char".equalsIgnoreCase(charOrNum) ) {  
                //输出是大写字母还是小写字母  
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;  
                val += (char)(random.nextInt(26) + temp);  
            } else if( "num".equalsIgnoreCase(charOrNum) ) {  
                val += String.valueOf(random.nextInt(10));  
            }  
        }  
        return val;
	}
	
	/**
	 * 随机生成订单号（时间戳，2位随机数）
	 * @return
	 */
	public static String orderNo2(){
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		final String code = df.format(new Date()) + (new Random().nextInt(90)+10);
		return code;
	}
	
	/**
	 * 随机生成订单号（时间戳，3位随机数）
	 * @return
	 */
	public static String orderNo3(){
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		final String code = df.format(new Date()) + (new Random().nextInt(900)+100);
		return code;
	}
	
	/**
	 * 随机生成订单号（时间戳，4位随机数）--本平台订单号采用此方案
	 * @return
	 */
	public static String orderNo4(){
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		final String code = df.format(new Date()) + (new Random().nextInt(9000)+1000);
		return code;
	}
	
	/**
	 * 退款订单号（时间戳，3位随机数）
	 * @return
	 */
	public static String refundNo3(){
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		final String code ="TK"+df.format(new Date()) + (new Random().nextInt(900)+100);
		return code;
	}
	
	/**
	 * uuid通用唯一识别码
	 * @return
	 */
	public static String getUuid(){
		return UUID.randomUUID()+"";
	}
	
}
