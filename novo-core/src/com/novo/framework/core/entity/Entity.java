package com.novo.framework.core.entity;


public interface Entity {
	
	public static final String base_field_id = "id";
	public static final String base_field_level_id = "levelId";
	
	public static final String base_field_updateTime = "updateTime";
	
	public static final String base_field_dataSort = "dataSort";
	
	public static final String base_field_isDelete = "isDelete";
	
	public static final String base_field_createTime = "createTime";
	
	public static final String base_field_isOpen = "isOpen";
	
	public static final String base_field_creatorId = "creatorId";
	
	public static final String base_field_creator = "creator";
	
	public static final String base_field_orgCode = "orgCode";
	
	public static final Long system_id = -1l;
	
	public static final Integer system_top_orgCode_length = 4;
	
	public static final Integer system_top_resourceCode_length = 4;
	
	public static final String system_top_orgCode = "0000";
}
