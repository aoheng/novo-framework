package com.novo.data.mybatis.util;

import com.novo.data.mybatis.interceptor.InterceptorHandler;
import com.novo.framework.core.entity.BaseEntity;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.filter.DefaultQueryCriteriaFilter;
import com.novo.framework.core.filter.QueryCriteriaFilter;
import com.novo.framework.core.protocol.RequestProtocol;
import com.novo.framework.core.reflect.FieldUtil;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExampleHelper {
	private static final List<QueryCriteriaFilter> filterStore = new ArrayList<QueryCriteriaFilter>();
	private static final InterceptorHandler interceptorHandler = new InterceptorHandler();
	static {
		filterStore.add(new DefaultQueryCriteriaFilter());
	}
	public static <T extends RequestProtocol,E extends BaseEntity> Example getExample(T requestProtocol,Class<E> entityClass) {
		Example example = new Example(entityClass);
		Criteria criteria = example.createCriteria();
		Map<String,Field> entFields = FieldUtil.getAllFieldMap(entityClass);
		for(QueryCriteriaFilter filter : filterStore) {
			filter.doFilter(entFields);
		}
		
		try {
			interceptorHandler.handle(criteria, requestProtocol, entFields);
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new SystemException();
		}
		
		return example;
	}
}
