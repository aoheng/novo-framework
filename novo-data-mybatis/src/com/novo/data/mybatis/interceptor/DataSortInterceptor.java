package com.novo.data.mybatis.interceptor;

import com.novo.framework.core.interceptor.QueryInterceptor;
import com.novo.framework.core.protocol.RequestProtocol;
import tk.mybatis.mapper.entity.Example.Criteria;

import java.lang.reflect.Field;
import java.util.Map;

public class DataSortInterceptor implements QueryInterceptor<Criteria>{

	@Override
	public <T extends RequestProtocol> void intercept(Criteria criteria, T requestProtocol, Map<String, Field> entFields)
			throws Exception {
	}

}
