package com.novo.data.mybatis.sql;

import com.novo.data.mybatis.TestEntity;
import com.novo.framework.core.bean.DataBean;
import com.novo.framework.core.bean.FieldBean;
import com.novo.framework.core.entity.BaseEntity;
import com.novo.framework.core.exception.CustomException;
import com.novo.framework.core.filter.ClassTypeFilter;
import com.novo.framework.core.reflect.AnnotationUtil;
import org.apache.ibatis.jdbc.SQL;

import javax.persistence.Column;
import javax.persistence.Table;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class SqlFactory {
	
	private static final ClassTypeFilter filter = new ClassTypeFilter();
	
	private static final SqlFieldType sqlFieldType = new SqlFieldType();
	
	public <T extends BaseEntity> String insertSql(T entity) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into ").append(this.tableName(entity)).append("(");
		
		List<FieldBean> columns = AnnotationUtil.targetFieldAnnotation(entity, Column.class);
		
		if(columns != null && columns.isEmpty() == false) {
			filter.doFilter(new DataBean() {
				@SuppressWarnings("unchecked")
				@Override
				public  Collection<FieldBean> getData() {
					return columns;
				}
			}, sqlFieldType);
			int size = 1;
			for(FieldBean column : columns) {
				System.out.println(column.getFieldType());
				String fieldName = null;
				if(column.getAnnotation() != null) {
					fieldName = ((Column)column.getAnnotation()).name();
				}else {
					fieldName = column.getFieldName();
				}
				if(size < columns.size()) {
					sql.append(fieldName).append(",");
				}
				if(size == columns.size()) {
					sql.append(fieldName).append(")");
				}
				size ++;
			}
			size = 1;
			sql.append(" values(");
			for(FieldBean column : columns) {
				Object value = column.getFieldValue();
				if(column.getAnnotation() != null) {
					if(((Column)column.getAnnotation()).nullable() == false && value == null) {
						throw new CustomException("create sql error",column.getFieldName()+" value is not null");
					}
					if(value != null && ((Column)column.getAnnotation()).length() < value.toString().length()) {
						throw new CustomException("create sql error",column.getFieldName()
								+" value length="+value.toString().length()+",but this value max length="+((Column)column.getAnnotation()).length());
					}
				}
				if(size < columns.size()) {
					sql.append(value == null ? "" : value).append(",");
				}
				if(size == columns.size()) {
					sql.append(value == null ? "" : value).append(")");
				}
				size ++;
			}
			return sql.toString();
		}
		throw new CustomException("create sql error","创建sql错误");
	}
	
	public <T extends BaseEntity> String tableName(T entity) {
		System.out.println(entity.getClass().getAnnotations());
		Annotation tableAn = AnnotationUtil.targetClassAnnotation(entity, Table.class);
		String tableName = null;
		if(tableAn != null) {
			tableName = ((Table)tableAn).name();
		}else {
			tableName = entity.getClass().getSimpleName();
		}
		return tableName;
	}
	public <T extends BaseEntity> String fields(T entity) {
		throw new CustomException("create sql error","创建sql错误");
		
	}
	
	public <T extends BaseEntity> String updateSql(T entity) {
		return "";
	}
	
	public <T extends BaseEntity> String deleteSql(T entity) {
		return "";
	}
	
	public <T extends BaseEntity> String selectSql(T entity) {
		return "";
	}
	
	public <T extends BaseEntity> String selectOneSql(Long id) {
		return new SQL() {{
			
		}}.toString();
	}
	
	public static void main(String[] args) {
		TestEntity t = new TestEntity();
		t.setCreateTime(new Date());
		SqlFactory s = new SqlFactory();
		System.out.println(s.insertSql(t));
	}
}
