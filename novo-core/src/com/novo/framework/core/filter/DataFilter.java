package com.novo.framework.core.filter;


import com.novo.framework.core.bean.DataBean;
import com.novo.framework.core.type.DataType;

public interface DataFilter {

    public void doFilter(DataBean targetData, DataType targetType);
}
