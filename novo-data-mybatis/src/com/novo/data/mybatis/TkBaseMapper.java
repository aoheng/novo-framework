package com.novo.data.mybatis;

import com.novo.framework.core.entity.BaseEntity;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface TkBaseMapper<T extends BaseEntity> extends tk.mybatis.mapper.common.BaseMapper<T>
	,ExampleMapper<T>,MySqlMapper<T> {

}
