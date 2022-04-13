package com.novo.data.jpa.interceptor;

import com.novo.data.jpa.query.QuerySet;
import com.novo.framework.core.interceptor.QueryInterceptor;
import com.novo.framework.core.protocol.Pagination;
import com.novo.framework.core.protocol.RequestProtocol;

import java.lang.reflect.Field;
import java.util.Map;

public class PaginationInterceptor implements QueryInterceptor<QuerySet>{

	@Override
	public <T extends RequestProtocol> void intercept(final QuerySet query,final T requestProtocol,final Map<String, Field> entFields)
			throws Exception {
		if(Pagination.class.isAssignableFrom(requestProtocol.getClass())) {
			Pagination pagination = (Pagination)requestProtocol;
			if(pagination.getPaginationStatus()) {
				query.setPagination(pagination);
				entFields.remove(Pagination.pagination_field_pageNo);
				entFields.remove(Pagination.pagination_field_pages);
				entFields.remove(Pagination.pagination_field_pageSize);
				entFields.remove(Pagination.pagination_field_total);
			}
		}
	}

}
