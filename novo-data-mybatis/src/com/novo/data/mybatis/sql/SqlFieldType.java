package com.novo.data.mybatis.sql;

import com.novo.framework.core.type.DataType;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SqlFieldType implements DataType{
	
	enum Type{
		_String("String",String.class),
		_Integer("Integer",Integer.class),
		_Long("Long",Long.class),
		_Double("Double",Double.class),
		_Character("Character",Character.class),
		_Boolean("Boolean",Boolean.class),
		_Byte("Byte",Byte.class),
		_Date("Date",Date.class);
		
		private String name;
		
		private Class<?> type;
		
		private Type(String name,Class<?> type) {
			this.name = name;
			this.type = type;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Class<?> getType() {
			return type;
		}
		public void setType(Class<?> type) {
			this.type = type;
		}
	}
	
	
	private static Map<String,Class<?>> store = new ConcurrentHashMap<String,Class<?>>();
	static {
		for(Type type : Type.values()) {
			store.put(type.getName(), type.getType());
		}
	}
	
	@Override
	public Map<String, Class<?>> getDataType() {
		return store;
	}
}
