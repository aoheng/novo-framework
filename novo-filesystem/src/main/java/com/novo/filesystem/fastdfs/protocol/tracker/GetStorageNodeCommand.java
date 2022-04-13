package com.novo.filesystem.fastdfs.protocol.tracker;

import com.novo.filesystem.fastdfs.model.StorageNode;
import com.novo.filesystem.fastdfs.protocol.BaseResponse;
import com.novo.filesystem.fastdfs.protocol.tracker.request.GetStorageNodeByGroupNameRequest;
import com.novo.filesystem.fastdfs.protocol.tracker.request.GetStorageNodeRequest;

/**
 * 获取存储节点命令
 * 作者：aoheng
 * 创建时间：2021/02/01 15:16 <br/>
 */
public class GetStorageNodeCommand extends TrackerCommand<StorageNode> {

    public GetStorageNodeCommand(String groupName) {
        super.request = new GetStorageNodeByGroupNameRequest(groupName);
        super.response = new BaseResponse<StorageNode>() {
        };
    }

    public GetStorageNodeCommand() {
        super.request = new GetStorageNodeRequest();
        super.response = new BaseResponse<StorageNode>() {
        };
    }
}
