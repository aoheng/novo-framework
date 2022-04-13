package com.novo.filesystem.fastdfs.protocol.tracker;

import com.novo.filesystem.fastdfs.protocol.BaseResponse;
import com.novo.filesystem.fastdfs.protocol.tracker.request.DeleteStorageRequest;

/**
 * 删除存储服务器
 * 作者：aoheng
 * 创建时间：2021/02/01 15:43 <br/>
 */
public class DeleteStorageCommand extends TrackerCommand<Void> {

    public DeleteStorageCommand(String groupName, String storageIpAddr) {
        super.request = new DeleteStorageRequest(groupName, storageIpAddr);
        super.response = new BaseResponse<Void>() {
        };
    }
}
