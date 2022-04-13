package com.novo.filesystem.fastdfs.exception;

/**
 * 非FastDFS本身的错误码抛出的异常，socket连不上时抛出的异常
 * 作者：aoheng
 * 创建时间：2021/02/01 11:41 <br/>
 */
public class FastDfsConnectException extends FastDfsUnavailableException {
    public FastDfsConnectException(String message, Throwable t) {
        super(message, t);
    }
}