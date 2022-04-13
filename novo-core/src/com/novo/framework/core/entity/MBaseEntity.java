package com.novo.framework.core.entity;

import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.reflect.ClassUtil;
import com.novo.framework.core.reflect.FieldUtil;
import com.novo.framework.core.reflect.InvokeMethod;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Map;

/***
 * mongodb entity
 * @ClassName: MBaseEntity
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author chen chuang
 * @date 2020年1月25日 下午2:39:07
 *
 */
public abstract class MBaseEntity implements Serializable {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;
    protected String orgCode;

    @Override
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

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
}
