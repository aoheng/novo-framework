package com.novo.commons.support.deviceCenter.mqtt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.reflect.ClassUtil;
import com.novo.framework.core.reflect.FieldUtil;
import com.novo.framework.core.reflect.InvokeMethod;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Map;

/**
 * @author Aoheng on 2020/02/05.
 */
public class DynamicDataVO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Object data;
    private Integer serverSeed;
    /** 环境代码 */
    private String envCode;
    /** 产品代码 （999999:服务器） */
    private Integer productCode;
    private String imeiCode;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date createTime;

    public DynamicDataVO() {}

    public DynamicDataVO(Object data) {
        this.data = data;
    }

    public String toString() {
        String className = ClassUtil.getClassSimpleName(this.getClass());
        StringBuffer toString = new StringBuffer(className);
        toString.append("[");
        Map<String, Field> fields = FieldUtil.getAllFieldMap(this.getClass());
        int count = 0;
        for (String fieldName : fields.keySet()) {
            try {
                Object value = InvokeMethod.invokeGetter(this, fieldName);
                toString.append(fieldName).append("=").append(value);
                if (count < fields.size()) {
                    toString.append(",");
                }
                count++;
            } catch (Exception e) {
                e.printStackTrace();
                throw new SystemException();
            }
        }
        toString.append("]");
        return toString.toString();
    }

    public Object getData() { return data; }

    public void setData(Object data) { this.data = data; }

    public Date getCreateTime() { return createTime; }

    /** 开关位 */

    public void setCreateTime(Date createTime) { this.createTime = createTime; }

    public Integer getServerSeed() { return serverSeed; }

    public void setServerSeed(Integer serverSeed) { this.serverSeed = serverSeed; }

    public String getEnvCode() { return envCode; }

    /** 错误代码 */

    public void setEnvCode(String envCode) { this.envCode = envCode; }

    public Integer getProductCode() { return productCode; }

    public void setProductCode(Integer productCode) { this.productCode = productCode; }

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }
}
