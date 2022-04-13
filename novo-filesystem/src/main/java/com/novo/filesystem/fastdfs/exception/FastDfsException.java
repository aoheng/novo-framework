package com.novo.filesystem.fastdfs.exception;

/**
 * FastDFS客户端异常 基类
 * <p>
 * 作者：aoheng
 * 创建时间：2021/02/01 1:22 <br/>
 */
public class FastDfsException extends RuntimeException {
    public FastDfsException(String message) {
        super(message);
    }

    public FastDfsException(String message, Throwable cause) {
        super(message, cause);
    }
}

