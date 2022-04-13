package com.novo.framework.core.bean;

import java.util.List;

public class ClassBean {
	
	private String classType;
	
	private List<ClassBean> genericTypes;

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public List<ClassBean> getGenericTypes() {
		return genericTypes;
	}

	public void setGenericTypes(List<ClassBean> genericTypes) {
		this.genericTypes = genericTypes;
	}

}
