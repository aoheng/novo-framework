package com.novo.framework.core.protocol;

import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.util.JsonUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;


/***
 * 响应协议抽象类,所有的响应协议都应该继承该类
 * @ClassName: ResponseProtocol
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author chen chuang
 * @date 2020年10月11日 下午1:59:15
 *
 */
public abstract class ResponseProtocol<T> implements Serializable, MessageProcessor {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final ObjectMapper mapper = new ObjectMapper();
    /***
     * 响应信息，无论成功还是失败，都需要写入相应的信息
     */
    private String message;
    /***
     * 状态
     * 成功true，失败false
     */
    private Boolean isSuccess;
    /***
     * 响应码
     */
    private String code;
    /***
     * 响应数据
     */
    private T data;
    private String sessionId;

    /**
     * @param @return 设定文件
     * @return String    返回类型
     * @Title: toJson
     * @Description: 返回json格式。
     */
    public String toJson() {
        return JsonUtils.toJson(this);
    }

    /***
     *
     * @Title: toXml
     * @Description: 返回xml格式。这里应该是一个实现方法。因为时间关系，这里没有写出具体实现。
     * @param @return    设定文件
     * @return String    返回类型
     * @throws
     */
    public String toXml() {
        return null;
    }

    @Override
    public void writeMessage(Message msg) {
        this.message = msg.getMessage();
        this.code = msg.getCode();
        this.isSuccess = msg.getStatus();
    }

    @SuppressWarnings("unchecked")
    public T getData(Class<?> voClazz) {
//		if(data == null || voClazz == List.class || voClazz == Map.class || voClazz == Collection.class) {
        if (data == null) {
            return null;
        }
        try {
            String json = mapper.writeValueAsString(data);
            T obj = (T) mapper.readValue(json, voClazz);
            return obj;
        } catch (IOException e) {
            e.printStackTrace();
            throw new SystemException();
        }
    }

    @SuppressWarnings("unchecked")
    public T getData(Class<?> collectionClass, Class<?> voClazz) {
        if (data == null) {
            return null;
        }
        try {
            String json = mapper.writeValueAsString(data);
            if (collectionClass == List.class) {
                JavaType javaType = mapper.getTypeFactory().constructParametricType(collectionClass, voClazz);
                return (T) mapper.readValue(json, javaType);
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            throw new SystemException();
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }


}