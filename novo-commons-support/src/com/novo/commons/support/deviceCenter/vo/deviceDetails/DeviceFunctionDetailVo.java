package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import java.io.Serializable;

/**
 * @author BinksRao on 2020/8/3
 */
public class DeviceFunctionDetailVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 字段名称 */
    private String name;
    /** 字段中文描述 */
    private String desc;
    /** 字段值 */
    private Object value;
    /**字段于表单中的显示方式（ 1:input,2:select,3:Date,4:button）*/
    private Integer formType;
    /**字段值类型的枚举参数*/
    private String formParam;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFormType() {
        return formType;
    }

    public void setFormType(Integer formType) {
        this.formType = formType;
    }

    public String getFormParam() {
        return formParam;
    }

    public void setFormParam(String formParam) {
        this.formParam = formParam;
    }
}
