package com.novo.framework.core.dataSource;
/*
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.MySqlMapper;*/

/*public interface BaseMapper<T> extends tk.mybatis.mapper.common.BaseMapper<T>,ExampleMapper<T>,MySqlMapper<T> {

}*/
public interface BaseMapper<T> {

    public int insertSelective(T entity);
}