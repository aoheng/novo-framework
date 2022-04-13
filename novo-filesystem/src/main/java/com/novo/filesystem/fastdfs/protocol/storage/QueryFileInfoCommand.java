package com.novo.filesystem.fastdfs.protocol.storage;

import com.novo.filesystem.fastdfs.model.FileInfo;
import com.novo.filesystem.fastdfs.protocol.BaseResponse;
import com.novo.filesystem.fastdfs.protocol.storage.request.QueryFileInfoRequest;

/**
 * 作者：aoheng
 * 创建时间：2021/02/01 18:34 <br/>
 */
public class QueryFileInfoCommand extends StorageCommand<FileInfo> {

    /**
     * 文件上传命令
     *
     * @param groupName 组名称
     * @param path      文件路径
     */
    public QueryFileInfoCommand(String groupName, String path) {
        super();
        this.request = new QueryFileInfoRequest(groupName, path);
        // 输出响应
        this.response = new BaseResponse<FileInfo>() {
        };
    }
}