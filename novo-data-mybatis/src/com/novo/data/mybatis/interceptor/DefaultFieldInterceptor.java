package com.novo.data.mybatis.interceptor;

import com.novo.framework.core.dataSource.DataKeyword;
import com.novo.framework.core.dataSource.QueryType;
import com.novo.framework.core.entity.Entity;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.interceptor.QueryInterceptor;
import com.novo.framework.core.protocol.RequestProtocol;
import com.novo.framework.core.reflect.FieldUtil;
import com.novo.framework.core.reflect.InvokeMethod;
import tk.mybatis.mapper.entity.Example.Criteria;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DefaultFieldInterceptor implements QueryInterceptor<Criteria>{

	@Override
	public <T extends RequestProtocol> void intercept(final Criteria criteria,final T requestProtocol,
			final Map<String, Field> entFields) throws Exception{
		
		Map<String,Field> reqFields = FieldUtil.getAllFieldMap(requestProtocol.getClass());
		for(String reqFieldName : reqFields.keySet()) {
			Field reqField = reqFields.get(reqFieldName);
			Field entField = entFields.get(reqFieldName);
			if(entField != null && entField.getType() == reqField.getType()) {
				Object value;
				try {
					value = InvokeMethod.invokeGetter(requestProtocol, reqFieldName);
					if(value != null && !value.equals("")) {
						createExampleCriteria(criteria, requestProtocol, reqField, value);
					}
				} catch (Exception e) {
					e.printStackTrace();
					throw new SystemException();
				}
				
			}
		}
		
	}
	@SuppressWarnings("unchecked")
	private static <T extends RequestProtocol> void createExampleCriteria(
			Criteria criteria,T requestProtocol,Field field,Object value) {
		QueryType queryType = null;
		if(field.getName().equals(Entity.base_field_orgCode)) {
			queryType = QueryType.left_like;
		}else {
			queryType = QueryType.getQueryType(field.getType());
		}
		switch (queryType) {
			case equal:{
				criteria.andEqualTo(field.getName(),value);
			}
			break;
			
			case in:{
				List<Object> list = null;
				if(field.getType().isArray()) {
					Object[] arr = (Object[])value;
					list = Arrays.asList(arr);
				}else
				if(field.getType() == List.class) {
					list = (List<Object>)value;
				}
				if(list != null) {
					criteria.andIn(field.getName(),list);
				}
			}
			break;
			
			case like:{
				criteria.andLike(field.getName(), DataKeyword.symbol_like+value.toString()+DataKeyword.symbol_like);
			}
			break;
			case left_like:{
				criteria.andLike(field.getName(), value.toString()+DataKeyword.symbol_like);
			}
			break;
			
			default:
			break;
		}
	}
}
