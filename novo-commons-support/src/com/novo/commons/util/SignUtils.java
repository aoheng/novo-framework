package com.novo.commons.util;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.PropertyUtilsBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * App加密签名工具类    MD5签名
 * @author kemingheng
 * 2020年8月30日
 */
public class SignUtils {
	
	private static final Logger LOG = LoggerFactory.getLogger(SignUtils.class);
	
	/**
	 * 签名：json对象转换map,再进行md5签名
	 * @param object
	 * @return
	 */
	public static String GetSign(HttpServletRequest request,String appKey){
		HashMap<String, Object> map=SignUtils.toMap(request);
		return SignUtils.getSign(map,appKey);
	}
	
	/**
	 * 传入实体类获取签名
	 * @param obj
	 * @return
	 */
	public static String getSign(Object obj,String appKey){
		HashMap<String, Object> map=beanToMap(obj);
		return SignUtils.getSign(map,appKey);
	}
	
	/**
	 * 将json字符串转换成jsonObject  
	 * @param object
	 * @return
	 */
	public static HashMap<String, Object> toMap(HttpServletRequest request){  
	       HashMap<String, Object> data = new HashMap<String, Object>();  
	       Enumeration<?> enu=request.getParameterNames();
	       while(enu.hasMoreElements()){
	    	   String key=(String)enu.nextElement();
	    	   if (!key.equals("sign")) {
	    		   //LOG.info(key+"......键值对......."+request.getParameter(key));
	    		   data.put(key,request.getParameter(key));
	    	   }
	       }
	       
	       return data;  
	 } 
	
	/**
	 * 将javabean实体类转为map类型
	 * @param obj
	 * @return
	 */
	public static HashMap<String, Object> beanToMap(Object obj) {
		HashMap<String, Object> map = new HashMap<String, Object>(0); 
        try {
            PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
            PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj);
            for (int i = 0; i < descriptors.length; i++) {
                String name = descriptors[i].getName();
                if (!"class".equals(name)&&!"sign".equals(name)) {
                	map.put(name, propertyUtilsBean.getNestedProperty(obj, name));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
	
	/**
	 * map集合签名
	 *  第一步
	 * ◆ 参数名ASCII码从小到大排序（字典序）； 
	 * ◆ 如果参数的值为空不参与签名； 
	 * ◆ 参数名区分大小写； 
	 * ◆ 验证调用返回或微信主动通知签名时，传送的sign参数不参与签名，将生成的签名与该sign值作校验。
	 * 第二步：
	 * 在stringA最后拼接上AppKey得到stringSignTemp字符串，并对stringSignTemp进行MD5运算，再将得到的字符串所有字符转换为大写，得到sign值signValue。
	 * @param map
	 * @return
	 */
	public static String getSign(Map<String,Object> map,String appKey){
        ArrayList<String> list = new ArrayList<String>();
        for(Map.Entry<String,Object> entry:map.entrySet()){
            if(entry.getValue()!=null&&entry.getValue()!=""){
                list.add(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }
        int size = list.size();
        String [] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i ++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        result += "AppKey=" + appKey;
        LOG.info("Sign Before MD5:" + result);
        result = MD5.MD5Encode(result).toUpperCase();
        LOG.info("Sign Result:" + result);
        return result;
    }
	
	

}
