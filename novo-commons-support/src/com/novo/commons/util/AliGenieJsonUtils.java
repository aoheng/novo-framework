package com.novo.commons.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author MickeyChen
 * @date 2020/12/14
 */
public class AliGenieJsonUtils {

    public static JSONObject request2Str(HttpServletRequest request, BufferedReader br) {
        // Header部分
//        Enumeration<?> enum1 = request.getHeaderNames();
//        while (enum1.hasMoreElements()) {
//            String key = (String) enum1.nextElement();
//            String value = request.getHeader(key);
//            LOG.info(key + "\t" + value);
//        }
        // body部分
        String inputLine;
        String str = "";
        try {
            while ((inputLine = br.readLine()) != null) {
                str += inputLine;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject req = JSONObject.parseObject(str);
        return req;
    }

}
