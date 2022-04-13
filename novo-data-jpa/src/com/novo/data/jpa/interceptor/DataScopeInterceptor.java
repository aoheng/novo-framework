package com.novo.data.jpa.interceptor;

import com.novo.data.jpa.query.QueryParam;
import com.novo.framework.core.dataSource.QueryType;
import com.novo.framework.core.entity.Entity;
import com.novo.framework.core.interceptor.QueryInterceptor;
import com.novo.framework.core.protocol.DataScope;
import com.novo.framework.core.protocol.DefinitionDataScope;
import com.novo.framework.core.protocol.RequestProtocol;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class DataScopeInterceptor implements QueryInterceptor<List<QueryParam>>{

	@Override
	public <T extends RequestProtocol> void intercept(List<QueryParam> query, T requestProtocol,
			Map<String, Field> entFields) throws Exception {
		if(DataScope.class.isAssignableFrom(requestProtocol.getClass())) {
			DataScope dataScope = (DataScope)requestProtocol;
			DefinitionDataScope scope = dataScope.getDataScope();
			List<Long> creatorts = dataScope.getCreators();
			if(scope != null && creatorts != null && !creatorts.isEmpty()) {
				query.add(new QueryParam(Entity.base_field_creatorId,creatorts,QueryType.in,List.class));
				entFields.remove(DataScope.base_field_creators);
				entFields.remove(Entity.base_field_creatorId);
			}
			entFields.remove(DataScope.base_field_dataScope);
		}
		
	}

}
