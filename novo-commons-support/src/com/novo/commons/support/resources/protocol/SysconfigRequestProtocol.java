package com.novo.commons.support.resources.protocol;

import com.novo.commons.enums.ValueType;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

public class SysconfigRequestProtocol  extends PaginationRequestProtocol{

	private static final long serialVersionUID = 1L;
	
    public static final String MY_FIELD_KEYNAME = "keyName";

    private Long id;
	
	private String name;//名称
	private String keyName;
	/**
	 * 配置值
	 */
	private String value;
	
	/**
	 * 值类型
	 */
	private ValueType valueType;

	/**
	 * 参数描述
	 */
	private String sysDesc;

	private Long[] ids;

	private String  orgCode;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Long[] getIds() {
		return ids;
	}

	public void setIds(Long[] ids) {
		this.ids = ids;
	}

	@Override
	public String getOrgCode() {
		return orgCode;
	}

	@Override
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getSysDesc() {
		return sysDesc;
	}

	public void setSysDesc(String sysDesc) {
		this.sysDesc = sysDesc;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ValueType getValueType() {
		return valueType;
	}

	public void setValueType(ValueType valueType) {
		this.valueType = valueType;
	}
	
}
