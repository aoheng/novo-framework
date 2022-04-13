package com.novo.filesystem.fastdfs.protocol.tracker;

import com.novo.filesystem.fastdfs.model.StorageNodeInfo;
import com.novo.filesystem.fastdfs.protocol.BaseResponse;
import com.novo.filesystem.fastdfs.protocol.tracker.request.GetFetchStorageRequest;

/**
 * 获取文件源存储服务器
 * 作者：aoheng
 * 创建时间：2021/02/01 15:30 <br/>
 */
public class GetFetchStorageCommand extends TrackerCommand<StorageNodeInfo> {

    /**
     * 获取文件源服务器
     *
     * @param groupName 组名称
     * @param path      路径
     * @param toUpdate  toUpdate
     */
    public GetFetchStorageCommand(String groupName, String path, boolean toUpdate) {
        super.request = new GetFetchStorageRequest(groupName, path, toUpdate);
        super.response = new BaseResponse<StorageNodeInfo>() {
        };
    }
}
