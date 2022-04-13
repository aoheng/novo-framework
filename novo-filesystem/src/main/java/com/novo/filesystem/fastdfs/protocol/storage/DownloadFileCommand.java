package com.novo.filesystem.fastdfs.protocol.storage;

import com.novo.filesystem.fastdfs.protocol.storage.callback.DownloadCallback;
import com.novo.filesystem.fastdfs.protocol.storage.request.DownloadFileRequest;
import com.novo.filesystem.fastdfs.protocol.storage.response.DownloadFileResponse;

/**
 * 下载文件
 * 作者：aoheng
 * 创建时间：2021/02/01 16:02 <br/>
 */
public class DownloadFileCommand<T> extends StorageCommand<T> {

    /**
     * 下载文件
     *
     * @param groupName  组名称
     * @param path       文件路径
     * @param fileOffset 开始位置
     * @param fileSize   读取文件长度
     * @param callback   文件下载回调
     */
    public DownloadFileCommand(String groupName, String path, long fileOffset, long fileSize, DownloadCallback<T> callback) {
        super();
        this.request = new DownloadFileRequest(groupName, path, fileOffset, fileSize);
        // 输出响应
        this.response = new DownloadFileResponse<T>(callback);
    }

    /**
     * 下载文件
     *
     * @param groupName 组名称
     * @param path      文件路径
     * @param callback  文件下载回调
     */
    public DownloadFileCommand(String groupName, String path, DownloadCallback<T> callback) {
        super();
        this.request = new DownloadFileRequest(groupName, path, 0, 0);
        // 输出响应
        this.response = new DownloadFileResponse<T>(callback);
    }
}