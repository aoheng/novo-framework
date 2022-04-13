package com.novo.filesystem.fastdfs.protocol.tracker;

import com.novo.filesystem.fastdfs.model.GroupState;
import com.novo.filesystem.fastdfs.protocol.tracker.request.GetGroupListRequest;
import com.novo.filesystem.fastdfs.protocol.tracker.response.GetGroupListResponse;

import java.util.List;

/**
 * 获取Group信息命令
 * 作者：aoheng
 * 创建时间：2021/02/01 15:05 <br/>
 */
public class GetGroupListCommand extends TrackerCommand<List<GroupState>> {

    public GetGroupListCommand() {
        super.request = new GetGroupListRequest();
        super.response = new GetGroupListResponse();
    }
}
