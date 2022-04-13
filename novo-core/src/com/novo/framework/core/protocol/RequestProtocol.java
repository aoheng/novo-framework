package com.novo.framework.core.protocol;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.novo.framework.core.exception.SystemException;

import java.io.Serializable;

/***
 * 请求协议抽象类，所有的请求都应该继承该类
 * @ClassName: RequestProtocol
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author chen chuang
 * @date 2020年10月11日 下午2:02:29
 *
 */
public abstract class RequestProtocol implements Serializable {


    public static final String base_param_sessionId = "sessionId";
    public static final String base_param_serviceName = "serviceName";
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.setSerializationInclusion(Include.NON_NULL);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    /***
     * 任务ID，UUID16位字符。
     * 该ID应该由网关生成。从发起到结束，taskId作为唯一凭证，记录整个请求的生命周期。
     */
    protected String taskId;
    /***
     * 数据格式
     * 指定响应的数据格式，可提供json和xml两种
     * 响应协议通过该字段适配相应的数据类型。
     */
    protected String format;
    /***
     * 数据签名
     */
    protected String sign;
    /***
     * 字符类型，默认utf-8
     */
    protected String inputCharset = "UTF-8";

    /***
     * 服务名称
     */
    protected String serviceName;

    protected String sessionId;

    public String toJson() {
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new SystemException();
        }
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getInputCharset() {
        return inputCharset;
    }

    public void setInputCharset(String inputCharset) {
        this.inputCharset = inputCharset;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


}
