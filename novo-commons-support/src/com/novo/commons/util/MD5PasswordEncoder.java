package com.novo.commons.util;

/**
 * @author of Aoheng
 * @TODO MD5加密方法
 * @date 2020-01-23 16:26
 **/

public class MD5PasswordEncoder {


    /**
     * 密码三加盐加密
     *
     * @param password
     * @param salt
     * @return
     */
    public static String encode(String password, String salt) {
        String encode = new String();
        if (salt == null) {
            salt = "";
        }
        encode = MD5.encode(MD5.encode(password) + MD5.encode(salt));
        return encode;
    }
}