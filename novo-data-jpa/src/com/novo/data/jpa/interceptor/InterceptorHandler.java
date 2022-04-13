package com.novo.data.jpa.interceptor;

import com.novo.data.jpa.query.QueryParam;
import com.novo.data.jpa.query.QuerySet;
import com.novo.framework.core.protocol.RequestProtocol;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class InterceptorHandler {
	
	private static final PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
	
	private static final DataSortInterceptor dataSortInterceptor = new DataSortInterceptor();
	
	private static final DataScopeInterceptor dataScopeInterceptor = new DataScopeInterceptor();
	
	private static final TimeStampInterceptor timeStampInterceptor = new TimeStampInterceptor();
	
	private static final DefaultFieldInterceptor defaultFieldInterceptor = new DefaultFieldInterceptor();
	
	public <T extends RequestProtocol> void handle(final QuerySet querySet,final T requestProtocol,
			final Map<String, Field> entFields,final List<QueryParam> queryList) throws Exception{
		
		paginationInterceptor.intercept(querySet, requestProtocol, entFields);
		dataSortInterceptor.intercept(querySet, requestProtocol, entFields);
		dataScopeInterceptor.intercept(queryList, requestProtocol, entFields);
		
		timeStampInterceptor.intercept(queryList, requestProtocol, entFields);
		defaultFieldInterceptor.intercept(queryList, requestProtocol, entFields);
	}
}
