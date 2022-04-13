package com.novo.filesystem.fastdfs.exception;

/**
 * 上传图片异常
 * 作者：aoheng
 * 创建时间：2021/02/01 11:47 <br/>
 */
public class FastDfsUploadImageException extends FastDfsException {
    protected FastDfsUploadImageException(String message) {
        super(message);
    }

    public FastDfsUploadImageException(String message, Throwable cause) {
        super(message, cause);
    }
}
