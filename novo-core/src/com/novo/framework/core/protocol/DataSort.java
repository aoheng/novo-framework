package com.novo.framework.core.protocol;

import com.novo.framework.core.dataSource.SortType;

public interface DataSort {

    public String[] getSortFields();

    public void setSortFields(String[] fields);

    public SortType getSortType();

    public void setSortType(SortType type);
}
