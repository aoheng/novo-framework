package com.novo.commons.support.deviceCenter.protocol.protocolModel;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author BinksRao on 2020/7/4
 */
public class CopyProtcolResultInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean isSuccess;

    private Map<Long, Long> idMap;

    private Map<Long, List<Long>> idMapList;

    public CopyProtcolResultInfo() {
        this.isSuccess = false;
    }

    public boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean success) {
        isSuccess = success;
    }

    public Map<Long, Long> getIdMap() {
        return idMap;
    }

    public void setIdMap(Map<Long, Long> idMap) {
        this.idMap = idMap;
    }

    public Map<Long, List<Long>> getIdMapList() {
        return idMapList;
    }

    public void setIdMapList(Map<Long, List<Long>> idMapList) {
        this.idMapList = idMapList;
    }
}
