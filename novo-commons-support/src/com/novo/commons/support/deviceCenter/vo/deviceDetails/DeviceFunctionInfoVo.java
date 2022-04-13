package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import java.io.Serializable;
import java.util.List;

/**
 * @author BinksRao on 2020/8/3
 */
public class DeviceFunctionInfoVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 功能 */
    //private ProtocolFunctionVo functionVo;
    /** 功能名称 */
    private String funcName;
    /** 功能类型 */
    private Integer funcType;
    /** 字段列 */
    private List<DeviceFunctionDetailVo> field;
    /** 字段值历史列表 */
    private List<List<DeviceFunctionDetailVo>> datailList;


    public Integer getFuncType() {
        return funcType;
    }

    public void setFuncType(Integer funcType) {
        this.funcType = funcType;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public List<List<DeviceFunctionDetailVo>> getDatailList() {
        return datailList;
    }

    public void setDatailList(List<List<DeviceFunctionDetailVo>> datailList) {
        this.datailList = datailList;
    }

    public List<DeviceFunctionDetailVo> getField() {
        return field;
    }

    public void setField(List<DeviceFunctionDetailVo> field) {
        this.field = field;
    }
}
