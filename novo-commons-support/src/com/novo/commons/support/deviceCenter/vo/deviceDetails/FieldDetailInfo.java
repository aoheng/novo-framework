package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import java.io.Serializable;

/**
 * @author RaoYongBin on 2020/5/24
 */
public class FieldDetailInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**在显示列表中的标题栏中的中文列名*/
    private String name;

    /**传给前台的字段名=实体类中字段名*/
    private String fieldName;

    /**字段值的数据类型*/
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
