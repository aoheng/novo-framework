package com.novo.commons.util;

import org.apache.commons.beanutils.PropertyUtilsBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Encoder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import java.beans.PropertyDescriptor;
import java.util.*;

/**
 * 签名工具
 * kemingheng
 * 2020
 */
public class SignOutsideUtils {

    private final static Logger LOG = LoggerFactory.getLogger(SignOutsideUtils.class);


    /**
     * 传入实体类获取签名
     */
    public static String getSign(Object obj, String signKey) {
        HashMap<String, Object> map = beanToMap(obj);
        return SignOutsideUtils.getSign(map, signKey);
    }

    /**
     * 将json字符串转换成jsonObject
     */
    public static HashMap<String, Object> toMap(HttpServletRequest request) {
        HashMap<String, Object> data = new HashMap<String, Object>();
        Enumeration<?> enu = request.getParameterNames();
        while (enu.hasMoreElements()) {
            String key = (String) enu.nextElement();
            if (!key.equals("sign")) {
                //LOG.info(key+"......键值对......."+request.getParameter(key));
                data.put(key, request.getParameter(key));
            }
        }
        return data;
    }

    /**
     * 将javabean实体类转为map类型
     */
    public static HashMap<String, Object> beanToMap(Object obj) {
        HashMap<String, Object> map = new HashMap<String, Object>(0);
        try {
            PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
            PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj);
            for (int i = 0; i < descriptors.length; i++) {
                String name = descriptors[i].getName();
                if (!"class".equals(name) && !"sign".equals(name)) {
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
     * 第一步
     * ◆ 参数名ASCII码从小到大排序（字典序）；
     * ◆ 如果参数的值为空不参与签名；
     * ◆ 参数名区分大小写；
     * ◆ 验证调用返回或微信主动通知签名时，传送的sign参数不参与签名，将生成的签名与该sign值作校验。
     * 第二步：
     * 在stringA最后拼接上AppKey得到stringSignTemp字符串，并对stringSignTemp进行MD5运算，再将得到的字符串所有字符转换为大写，得到sign值signValue。
     */
    public static String getSign(Map<String, Object> map, String signKey) {
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() != null && entry.getValue() != "") {
                list.add(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }
        int size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        result += "SignKey=" + signKey;
        LOG.info("Sign Before MD5:" + result);
        result = MD5.MD5Encode(result).toUpperCase();
        LOG.info("Sign Result:" + result);
        return result;
    }


    /*************************************vivo签名工具类****************************************************/

    /**
     * vivo签名工具类
     * @param header
     * @param body
     * @return
     */
    public static String getVivoSign(Object header,Object body,String appSecret){
        HashMap<String, Object> headerMap = new HashMap<String, Object>(0);
        try {
            PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
            PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(header);
            for (int i = 0; i < descriptors.length; i++) {
                String name = descriptors[i].getName();
                if (!"class".equals(name) && !"signature".equals(name)) {
                    headerMap.put(name, propertyUtilsBean.getNestedProperty(header, name));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getVivoSign(headerMap,body,appSecret);
    }

    /**
     * vivo签名
     * 1.对参数做字典序升序排列，参与排序的参数包括 header 里面除了 signature 外的所有非空参数，如果参数值为空则不参与签名
     * 2.排序好的参数格式化成“参数名称”（统一转换为小写）=“参数值”的形式，
     * 3.将 body 的 JSON 字符串附在字符串 A 后面，得到字符串 B
     * 4.使用 HmacSHA256 签名算法对字符串 B 进行签名，得到对应的签名数组再使用 URL SAFE Base64 进行编码
     */
    public static String getVivoSign(Map<String, Object> header,Object body,  String appSecret) {
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, Object> entry : header.entrySet()) {
            if (!entry.getKey().equals("signature")&&entry.getValue()!=null&&!entry.getValue().equals("")) {
                list.add(entry.getKey().toLowerCase(Locale.US)+"=" + entry.getValue() + "&");
            }
        }
        int size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.deleteCharAt(sb.length()-1).toString();
        result = result+ body;
        LOG.info("novoyun-sha256_HMAC加密前:{},appSecret:{}" , result,appSecret);
        String sign = sha256_HMAC(result,appSecret);//HmacSHA256 签名
        LOG.info("novoyun-加密后签名:{}" , sign);
        return sign;
    }

    /**
     * sha256_HMAC加密,Base64 进行编码
     * @param message
     * @param secret
     * @return
     */
    public static String sha256_HMAC(String message, String secret) {
        String hash = "";
        try {
            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
            sha256_HMAC.init(secret_key);
            byte[] bytes = sha256_HMAC.doFinal(message.getBytes());
            hash=safeUrlBase64Encode(bytes);
            //LOG.info("URL SAFE Base64进行编码:{}" , hash);
        } catch (Exception e) {
            LOG.error("Error HmacSHA256 ===========" + e.getMessage());
        }
        return hash;
    }

    /**
     * URL SAFE Base64编码：对特殊字符替换
     * @param data
     * @return
     */
    public static String safeUrlBase64Encode(byte[] data){
        String encodeBase64 = new BASE64Encoder().encode(data);
        String safeBase64Str = encodeBase64.replace('+', '-');
        safeBase64Str = safeBase64Str.replace('/', '_');
        safeBase64Str = safeBase64Str.replaceAll("=", "");
        return safeBase64Str;
    }

    /**
     * 为保障clientSecret的安全，需要对其进行RSA非对称加密
     * @param clientSecret
     * @return
     * @throws Exception
     */
    public static String getVivoClientSecret(String clientSecret,String publicKey) throws Exception {
        byte[] bytes = RSAUtils.encryptByPublicKey(clientSecret.getBytes(), publicKey);
        String encryptedClientSecret = RSAUtils.binToHex(bytes);
        return encryptedClientSecret;
    }


}
