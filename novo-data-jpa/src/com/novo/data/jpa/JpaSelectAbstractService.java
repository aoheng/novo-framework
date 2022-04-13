package com.novo.data.jpa;

import com.novo.data.jpa.interceptor.InterceptorHandler;
import com.novo.data.jpa.query.QueryParam;
import com.novo.data.jpa.query.QuerySet;
import com.novo.framework.core.entity.BaseEntity;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.filter.DefaultQueryCriteriaFilter;
import com.novo.framework.core.filter.QueryCriteriaFilter;
import com.novo.framework.core.protocol.PaginationRequestProtocol;
import com.novo.framework.core.protocol.RequestProtocol;
import com.novo.framework.core.protocol.ResponseProtocol;
import com.novo.framework.core.reflect.FieldUtil;
import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class JpaSelectAbstractService<T extends BaseEntity,V extends Serializable> extends JpaAbstractService<T,V>{
	
	private static final List<QueryCriteriaFilter> filterStore = new ArrayList<QueryCriteriaFilter>();
	private static final InterceptorHandler interceptorHandler = new InterceptorHandler();
	static {
		filterStore.add(new DefaultQueryCriteriaFilter());
	}
	protected <P extends PaginationRequestProtocol> Page<T> getEntityPage(BaseRepository<T> repository,P requestProtocol){
		QuerySet querySet;
		try {
			querySet = this.createSelectQuerySet(requestProtocol);
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException();
		}
		return this.query(repository, querySet);
	}
	protected ResponseProtocol<List<V>> findEntity(BaseRepository<T> repository,RequestProtocol requestProtocol){
		QuerySet querySet;
		try {
			querySet = this.createSelectQuerySet(requestProtocol);
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException();
		}
		return this.findEntity(repository, querySet);
	}
	
	private QuerySet createSelectQuerySet(RequestProtocol requestProtocol) throws Exception {
		
		Map<String,Field> entityFields = FieldUtil.getAllFieldMap(this.getEntity().getClass());
		
		for(QueryCriteriaFilter filter : filterStore) {
			filter.doFilter(entityFields);
		}
		QuerySet querySet = new QuerySet();
		List<QueryParam> queryList = new ArrayList<QueryParam>();
		interceptorHandler.handle(querySet, requestProtocol, entityFields, queryList);
		querySet.addQueryParams(queryList);
		return querySet;
		
	}
	
}
