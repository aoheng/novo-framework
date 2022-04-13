package com.novo.commons.enums;

public enum OrgType {
	DEPARTMENT("部门"), COMPANY("公司");
	
	private String text;
	
	private OrgType(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
}
