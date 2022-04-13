package com.novo.data.mybatis;

import com.novo.framework.core.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Time;

@Table(name="test_table")
@Entity
public class TestEntity extends BaseEntity{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;

	private Time time;

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
}
