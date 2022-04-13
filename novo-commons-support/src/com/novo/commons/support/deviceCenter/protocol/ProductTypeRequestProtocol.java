package com.novo.commons.support.deviceCenter.protocol;


import com.novo.framework.core.protocol.PaginationRequestProtocol;

public class ProductTypeRequestProtocol extends PaginationRequestProtocol {
    private static final long serialVersionUID = 1L;

    private String typeName;

    private Integer typeCode;

    private String typeDesc;
    
    public String getTypeDesc() {
		return typeDesc;
	}

	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

	public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(Integer typeCode) {
		this.typeCode = typeCode;
	}

}
