package com.novo.commons.support.resources.vo;

import java.io.Serializable;

import com.novo.commons.enums.ElementFieldPosition;
import com.novo.commons.enums.ElementFieldType;
import com.novo.commons.enums.ValueType;

public class ElementFieldVo implements Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private Boolean dataStatus;
	
	private String fieldName;
	
	private String showName;
	
	private String defaultShowName;
	
	private Boolean queryCriteria;
	
	private Boolean tableColumnShow;
	
	private Boolean criteriaField;
	
	private ElementFieldPosition fieldPosition;
	
	private ElementFieldType valueType;
	
	private Long dataSort;
	
	private String[] EnumValueScope;
	
	private Long elementFieldSetId;
	
	private Boolean isOpen;
	
	
	public Boolean getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	public String getDefaultShowName() {
		return defaultShowName;
	}

	public void setDefaultShowName(String defaultShowName) {
		this.defaultShowName = defaultShowName;
	}


	public Long getElementFieldSetId() {
		return elementFieldSetId;
	}

	public void setElementFieldSetId(Long elementFieldSetId) {
		this.elementFieldSetId = elementFieldSetId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getDataStatus() {
		return dataStatus;
	}

	public void setDataStatus(Boolean dataStatus) {
		this.dataStatus = dataStatus;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public Boolean getQueryCriteria() {
		return queryCriteria;
	}

	public void setQueryCriteria(Boolean queryCriteria) {
		this.queryCriteria = queryCriteria;
	}

	public Boolean getTableColumnShow() {
		return tableColumnShow;
	}

	public void setTableColumnShow(Boolean tableColumnShow) {
		this.tableColumnShow = tableColumnShow;
	}

	public Boolean getCriteriaField() {
		return criteriaField;
	}

	public void setCriteriaField(Boolean criteriaField) {
		this.criteriaField = criteriaField;
	}

	public ElementFieldPosition getFieldPosition() {
		return fieldPosition;
	}

	public void setFieldPosition(ElementFieldPosition fieldPosition) {
		this.fieldPosition = fieldPosition;
	}

	public ElementFieldType getValueType() {
		return valueType;
	}

	public void setValueType(ElementFieldType valueType) {
		this.valueType = valueType;
	}

	public Long getDataSort() {
		return dataSort;
	}

	public void setDataSort(Long dataSort) {
		this.dataSort = dataSort;
	}

	public String[] getEnumValueScope() {
		return EnumValueScope;
	}

	public void setEnumValueScope(String[] enumValueScope) {
		EnumValueScope = enumValueScope;
	}

	
}
