package com.novo.framework.core.protocol;

import com.novo.framework.core.util.StringUtils;

public class BaseResponseProtocol<T> extends ResponseProtocol<T> {

    private static final long serialVersionUID = 1L;

    public static <T> BaseResponseProtocol<T> create(Message message, T data) {
        BaseResponseProtocol response = new BaseResponseProtocol();
        response.writeMessage(message);
        response.setData(data);
        return response;
    }

    /** 成功 */
    public static <T> BaseResponseProtocol<T> success(String msg) {
        return success(msg, null);
    }

    /** 成功 */
    public static <T> BaseResponseProtocol<T> success(String msg, T data) {
        BaseResponseProtocol res = new BaseResponseProtocol();
        res.writeMessage(ResponseMessage.CODE_SUCCESS);
        if (!StringUtils.isBlank(msg))
            res.setMessage(msg);
        res.setData(data);
        return res;
    }

    /** 失败 */
    public static <T> BaseResponseProtocol<T> failed(String msg) {
        BaseResponseProtocol res = new BaseResponseProtocol();
        res.writeMessage(ResponseMessage.CODE_FAIL);
        if (!StringUtils.isBlank(msg))
            res.setMessage(msg);
        return res;
    }

    @Override
    public String toString() {
        return this.toJson();
    }
}
