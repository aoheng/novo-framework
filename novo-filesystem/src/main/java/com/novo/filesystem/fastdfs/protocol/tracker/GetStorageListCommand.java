package com.novo.filesystem.fastdfs.protocol.tracker;

import com.novo.filesystem.fastdfs.model.StorageState;
import com.novo.filesystem.fastdfs.protocol.tracker.request.GetListStorageRequest;
import com.novo.filesystem.fastdfs.protocol.tracker.response.GetListStorageResponse;

import java.util.List;

/**
 * 获取Storage服务器状态命令
 * 作者：aoheng
 * 创建时间：2021/02/01 12:41 <br/>
 */
public class GetStorageListCommand extends TrackerCommand<List<StorageState>> {

    public GetStorageListCommand(String groupName, String storageIpAddr) {
        super.request = new GetListStorageRequest(groupName, storageIpAddr);
        super.response = new GetListStorageResponse();
    }

    public GetStorageListCommand(String groupName) {
        super.request = new GetListStorageRequest(groupName);
        super.response = new GetListStorageResponse();
    }
}
