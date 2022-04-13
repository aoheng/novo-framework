package com.novo.data.mybatis.interceptor;

import com.novo.framework.core.protocol.RequestProtocol;
import tk.mybatis.mapper.entity.Example.Criteria;

import java.lang.reflect.Field;
import java.util.Map;

public class InterceptorHandler {
	
	private static final PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
	
	private static final DataSortInterceptor dataSortInterceptor = new DataSortInterceptor();
	
	private static final DataScopeInterceptor dataScopeInterceptor = new DataScopeInterceptor();
	
	private static final TimeStampInterceptor timeStampInterceptor = new TimeStampInterceptor();
	
	private static final DefaultFieldInterceptor defaultFieldInterceptor = new DefaultFieldInterceptor();
	
	public <T extends RequestProtocol> void handle(Criteria criteria,final T requestProtocol,
			final Map<String, Field> entFields) throws Exception{
		
		paginationInterceptor.intercept(criteria, requestProtocol, entFields);
		dataSortInterceptor.intercept(criteria, requestProtocol, entFields);
		dataScopeInterceptor.intercept(criteria, requestProtocol, entFields);
		
		timeStampInterceptor.intercept(criteria, requestProtocol, entFields);
		defaultFieldInterceptor.intercept(criteria, requestProtocol, entFields);
	}
}
