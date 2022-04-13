package com.novo.commons.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HttpClientUtils
{
    public static Log log = LogFactory.getLog(HttpClientUtils.class);

    /**
     * 向指定URL发送GET方法的请求
     * 
     * @param url 发送请求的URL
     * @param param  请求参数，请求参数应该是name1=value1&name2=value2的形式。
     * @return URL所代表远程资源的响应
     */
    public static String sendGet(String url, String param)
    {
        String result = "";
        BufferedReader in = null;
        try
        {
            String urlName = url + "?" + param;
            URL realUrl = new URL(urlName);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            // 建立实际的连接
            conn.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = conn.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet())
            {
                log.info(key + "--->" + map.get(key));
            }
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            String line;
            while ((line = in.readLine()) != null)
            {
                result += "\n" + line;
            }
        }
        catch (Exception e)
        {
            log.info("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally
        {
            try
            {
                if (in != null)
                {
                    in.close();
                }
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定URL发送POST方法的请求
     * 
     * @param url 发送请求的URL
     * @param param 请求参数，请求参数应该是name1=value1&name2=value2的形式。
     * @return URL所代表远程资源的响应
     */
    public static String sendPost(String url, String param)
    {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try
        {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);

            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            log.info("\n发送报文:" + param);

            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            String line;
            while ((line = in.readLine()) != null)
            {
                result += "\n" + line;
            }
            log.info("\n接收报文:" + result);
        }
        catch (Exception e)
        {
            log.info("发送POST请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输出流、输入流
        finally
        {
            try
            {
                if (out != null)
                {
                    out.close();
                }
                if (in != null)
                {
                    in.close();
                }
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定URL发送POST方法的请求
     * @param url 发送请求的URL
     * @param param 请求参数，请求参数应该是name1=value1&name2=value2的形式。
     * @return URL所代表远程资源的响应
     */
    public static String sendHttpRequest(String requestUrl, String str) throws Exception
    {
        BufferedReader reader = null;
        String response = "";
        try
        {
            // 接报文的地址URL
            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 设置连接参数
            conn.setRequestMethod("POST");
            conn.setConnectTimeout(20 * 1000);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setAllowUserInteraction(true);
            // 写入数据
            DataOutputStream output = new DataOutputStream(conn.getOutputStream());
            log.info("\n 发送报文:\n" + str);
            output.writeBytes(new String(str.getBytes("utf-8"), "iso-8859-1"));
            output.flush();
            output.close();
            InputStream is = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "utf-8"));

            String st = null;
            while ((st = reader.readLine()) != null)
            {
                // response = br.readLine();
                response += "\n" + st;
            }
            response = new String(response);
            log.info("\n 接收报文:" + response);
        }
        catch (java.net.ConnectException e)
        {
            e.printStackTrace();
            throw new Exception();
        }
        finally
        {
            if (reader != null)
            {
                reader.close();
            }
        }
        return response;
    }

    /**
     * 接收微信异步通知请求
     * @param req
     * @return
     */
    public static String notifyRequest(HttpServletRequest req)
    {
        InputStream is;
        String line = "";
        String request = "";
        try
        {
            req.setCharacterEncoding("utf-8");
            is = req.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));

            while ((line = br.readLine()) != null)
            {
                request = request + line;
            }

        }
        catch (IOException e)
        {
            return "解析数据失败";
        }
        log.info("request=" + request);
        return request;
    }

    /**
     * 微信异步通知响应
     * @param resp
     * @param jsonObject
     */
    public static void notifyResponse(HttpServletResponse resp, String str)
    {
        resp.setContentType("text/xml");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = null;
        try
        {
            out = resp.getWriter();
            out.println(str);
            log.info("response=" + str);
        }
        catch (IOException e)
        {
            e.printStackTrace();

        }
        finally
        {
            out.flush();
            out.close();
        }
    }

    public static void main(String args[]) throws Exception
    {

        // StringBuffer str = new StringBuffer();
        // str.append("<xml>");
        // str.append("<appid>wxe9efccb7f1d78303</appid>");
        // str.append("<mch_id>1290037201</mch_id>");
        // str.append("<sub_mch_id>1305503301</sub_mch_id>");
        // str.append("<nonce_str>fcdf698a5d673435e0a5a6f9ffea05ca</nonce_str>");
        // str.append("<sign>1CE8B0E028585870C3527E231B5308F6</sign>");
        // str.append("<body>潮仁汇会员卡</body>");
        // str.append("<out_trade_no>20200118191500129003720209224092</out_trade_no>");
        // str.append("<total_fee>1</total_fee>");
        // str.append("<spbill_create_ip>127.0.0.1</spbill_create_ip>");
        // str.append("<notify_url>http://pay.esapos.com:8091/esa_membsync/NotifyUrl</notify_url>");
        // str.append("<trade_type>JSAPI</trade_type>");
        // str.append("<openid>ocDWOwiDp2IilP8fUOF492e5HizM</openid>");
        // str.append("</xml>");
        //
        // String uniReqXml = WxPayService.createChaUnifiedorderData("ocDWOwiDp2IilP8fUOF492e5HizM","13045897440");
        // System.out.println(uniReqXml);
        // // // 发送POST请求
        // String s1 = HttpClientUtils.sendPost(
        // "https://api.mch.weixin.qq.com/pay/unifiedorder",
        // uniReqXml);
        // //
        // Map<String, String> map=XmlUtils.parseXml(s1);
        // log.info(map);
        //

        // System.out.println(URLDecoder.decode("潮人汇会员卡充值", "utf-8"));

    }

}
