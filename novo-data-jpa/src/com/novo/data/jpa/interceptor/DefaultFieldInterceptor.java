package com.novo.data.jpa.interceptor;

import com.novo.data.jpa.query.QueryParam;
import com.novo.framework.core.dataSource.QueryType;
import com.novo.framework.core.entity.Entity;
import com.novo.framework.core.interceptor.QueryInterceptor;
import com.novo.framework.core.protocol.PaginationRequestProtocol;
import com.novo.framework.core.protocol.RequestProtocol;
import com.novo.framework.core.reflect.FieldUtil;
import com.novo.framework.core.reflect.InvokeMethod;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class DefaultFieldInterceptor implements QueryInterceptor<List<QueryParam>>{

	@Override
	public <T extends RequestProtocol> void intercept(final List<QueryParam> query,final T requestProtocol,
			final Map<String, Field> entFields) throws Exception{
		
		List<Field> fields = FieldUtil.getAllFieldList(requestProtocol.getClass());
		for(Field field : fields) {
			Field enetityField = entFields.get(field.getName());
			if(enetityField != null) {
				Object value = InvokeMethod.invokeGetter(requestProtocol, field.getName());
				if(value == null || value.toString().equals("")) {
					continue;
				}
				if(enetityField.getType().isEnum()) {
					value = FieldUtil.enumValue(enetityField, value);
				}
				if(field.getName().equals(Entity.base_field_orgCode)) {
					query.add(new QueryParam(field.getName(),value,QueryType.left_like,enetityField.getType()));
				}else {
					QueryType queryType = QueryType.getQueryType(enetityField.getType());
					if(queryType != null) {
						query.add(new QueryParam(field.getName(),value,queryType,enetityField.getType()));
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		List<Field> fields = FieldUtil.getAllFieldList(PaginationRequestProtocol.class);
		for(Field f : fields) {
			System.out.println(f.getName());
		}
		
	}
}
