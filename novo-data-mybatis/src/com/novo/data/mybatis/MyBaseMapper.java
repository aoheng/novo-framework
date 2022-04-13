package com.novo.data.mybatis;

import com.novo.data.mybatis.sql.SqlFactory;
import com.novo.framework.core.entity.BaseEntity;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/***
* @ClassName: BaseMapper 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author chen chuang
* @date 2020年11月16日 下午3:18:00 
* 
* @param <T>
 */
public interface MyBaseMapper<T extends BaseEntity> {
	
	@InsertProvider(type = SqlFactory.class,method = "insertSql")
	public int insert(T entity);
	
	@UpdateProvider(type = SqlFactory.class,method = "updateSql")
	public int update(T entity);
	
	@DeleteProvider(type = SqlFactory.class,method = "deleteSql")
	public int delete(T entity);
	
	@SelectProvider(type = SqlFactory.class,method = "selectSql")
	public List<T> select(T entity);
	
	@SelectProvider(type = SqlFactory.class,method = "selectOneSql")
	public T findById(Long id);
}
