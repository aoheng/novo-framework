package com.novo.data.jpa.interceptor;

import com.novo.data.jpa.query.QuerySet;
import com.novo.framework.core.interceptor.QueryInterceptor;
import com.novo.framework.core.protocol.DataSort;
import com.novo.framework.core.protocol.RequestProtocol;
import org.springframework.data.domain.Sort;

import java.lang.reflect.Field;
import java.util.Map;

public class DataSortInterceptor implements QueryInterceptor<QuerySet>{

	@Override
	public <T extends RequestProtocol> void intercept(QuerySet query, T requestProtocol, Map<String, Field> entFields)
			throws Exception {
		if(DataSort.class.isAssignableFrom(requestProtocol.getClass())) {
			DataSort dataSort = (DataSort)requestProtocol;
			Sort.Direction sortType = null;
			if(dataSort.getSortType() == null) {
				sortType = Sort.Direction.DESC;
			}else {
				switch (dataSort.getSortType()) {
					case asc: sortType = Sort.Direction.ASC;break;
					case desc: sortType = Sort.Direction.DESC;break;
					default: sortType = Sort.Direction.DESC;break;
				}
			}
			query.setSortField(sortType,dataSort.getSortFields());
		}
		
	}

}
