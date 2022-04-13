package com.novo.framework.core.filter;

import com.novo.framework.core.bean.DataBean;
import com.novo.framework.core.bean.DataClass;
import com.novo.framework.core.type.DataType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ClassTypeFilter implements DataFilter {


    public ClassTypeFilter() {
    }


    @Override
    public void doFilter(DataBean targetData, DataType targetType) {
        List<Object> filter = new ArrayList<Object>();
        Collection<DataClass> dataList = targetData.getData();

        for (DataClass data : dataList) {
            Class<?> dataClass = data.getType();
            if (targetType.getDataType().get(dataClass.getSimpleName()) == null) {
                filter.add(data);
            }
        }

        if (filter.isEmpty() == false) {
            dataList.removeAll(filter);
        }
    }


}
