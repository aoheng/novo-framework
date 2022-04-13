package com.novo.filesystem.fastdfs.protocol.storage;

import com.novo.filesystem.fastdfs.model.MateData;
import com.novo.filesystem.fastdfs.protocol.storage.request.GetMetadataRequest;
import com.novo.filesystem.fastdfs.protocol.storage.response.GetMetadataResponse;

import java.util.Set;

/**
 * 作者：aoheng
 * 创建时间：2021/02/01 17:07 <br/>
 */
public class GetMetadataCommand extends StorageCommand<Set<MateData>> {

    /**
     * 设置文件标签(元数据)
     *
     * @param groupName 组名
     * @param path      文件路径
     */
    public GetMetadataCommand(String groupName, String path) {
        this.request = new GetMetadataRequest(groupName, path);
        // 输出响应
        this.response = new GetMetadataResponse();
    }
}
