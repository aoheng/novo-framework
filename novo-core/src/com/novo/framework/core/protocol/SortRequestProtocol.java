package com.novo.framework.core.protocol;

import com.novo.framework.core.dataSource.SortType;

public class SortRequestProtocol extends BaseRequestProtocol implements DataSort {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    private String[] sortFields;

    private SortType sortType;

    public String[] getSortFields() {
        return sortFields;
    }

    public void setSortFields(String[] sortFields) {
        this.sortFields = sortFields;
    }

    @Override
    public SortType getSortType() {
        return sortType;
    }

    @Override
    public void setSortType(SortType type) {
        this.sortType = type;
    }

}
