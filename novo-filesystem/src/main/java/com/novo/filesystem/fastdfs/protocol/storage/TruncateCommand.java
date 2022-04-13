package com.novo.filesystem.fastdfs.protocol.storage;

import com.novo.filesystem.fastdfs.protocol.BaseResponse;
import com.novo.filesystem.fastdfs.protocol.storage.request.TruncateRequest;

/**
 * 文件Truncate命令
 * 作者：aoheng
 * 创建时间：2021/02/01 18:53 <br/>
 */
public class TruncateCommand extends StorageCommand<Void> {

    /**
     * 文件Truncate命令
     *
     * @param path     文件路径
     * @param fileSize 文件大小
     */
    public TruncateCommand(String path, long fileSize) {
        super();
        this.request = new TruncateRequest(path, fileSize);
        // 输出响应
        this.response = new BaseResponse<Void>() {
        };
    }
}
