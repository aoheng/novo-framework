package com.novo.data.mybatis.interceptor;

import com.github.pagehelper.PageHelper;
import com.novo.framework.core.interceptor.QueryInterceptor;
import com.novo.framework.core.protocol.Pagination;
import com.novo.framework.core.protocol.RequestProtocol;
import tk.mybatis.mapper.entity.Example.Criteria;

import java.lang.reflect.Field;
import java.util.Map;

public class PaginationInterceptor implements QueryInterceptor<Criteria>{

	@Override
	public <T extends RequestProtocol> void intercept(final Criteria criteria,final T requestProtocol,final Map<String, Field> entFields)
			throws Exception {
		if(Pagination.class.isAssignableFrom(requestProtocol.getClass())) {
			Pagination pagination = (Pagination)requestProtocol;
			if(pagination.getPaginationStatus()) {
				PageHelper.startPage(pagination.getPageNo(), pagination.getPageSize());
			}
		}
	}

}
