package com.novo.filesystem.fastdfs.exception;

/**
 * 映射异常
 * 作者：aoheng
 * 创建时间：2021/02/01 1:41 <br/>
 */
public class FastDfsColumnMapException extends RuntimeException {
    public FastDfsColumnMapException() {
    }

//    public FastDfsColumnMapException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
//        super(message, cause, enableSuppression, writableStackTrace);
//    }

    public FastDfsColumnMapException(String message, Throwable cause) {
        super(message, cause);
    }

    public FastDfsColumnMapException(String message) {
        super(message);
    }

    public FastDfsColumnMapException(Throwable cause) {
        super(cause);
    }
}