package com.novo.filesystem.fastdfs.protocol.storage;

import com.novo.filesystem.fastdfs.model.StorePath;
import com.novo.filesystem.fastdfs.protocol.BaseResponse;
import com.novo.filesystem.fastdfs.protocol.storage.request.UploadFileRequest;

import java.io.InputStream;

/**
 * 文件上传命令
 * 作者：aoheng
 * 创建时间：2021/02/01 18:59 <br/>
 */
public class UploadFileCommand extends StorageCommand<StorePath> {

    /**
     * 文件上传命令
     *
     * @param storeIndex     存储节点
     * @param inputStream    输入流
     * @param fileExtName    文件扩展名
     * @param fileSize       文件大小
     * @param isAppenderFile 是否支持断点续传
     */
    public UploadFileCommand(byte storeIndex, InputStream inputStream, String fileExtName, long fileSize, boolean isAppenderFile) {
        super();
        this.request = new UploadFileRequest(storeIndex, inputStream, fileExtName, fileSize, isAppenderFile);
        // 输出响应
        this.response = new BaseResponse<StorePath>() {
        };
    }
}