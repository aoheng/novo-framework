package com.novo.filesystem.fastdfs.protocol.storage;

import com.novo.filesystem.fastdfs.protocol.BaseResponse;
import com.novo.filesystem.fastdfs.protocol.storage.request.AppendFileRequest;

import java.io.InputStream;

/**
 * 添加文件命令
 * 作者：aoheng
 * 创建时间：2021/02/01 16:58 <br/>
 */
public class AppendFileCommand extends StorageCommand<Void> {

    public AppendFileCommand(InputStream inputStream, long fileSize, String path) {
        this.request = new AppendFileRequest(inputStream, fileSize, path);
        // 输出响应
        this.response = new BaseResponse<Void>() {
        };
    }
}
