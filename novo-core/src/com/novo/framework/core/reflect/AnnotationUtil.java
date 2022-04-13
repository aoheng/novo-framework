package com.novo.framework.core.reflect;

import com.novo.framework.core.bean.FieldBean;
import com.novo.framework.core.exception.CustomException;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AnnotationUtil {

    public static <T extends Annotation> List<FieldBean> targetFieldAnnotation(Object source, Class<T> clazz) {
        Class<?> sourceClass = source.getClass();
        Map<String, Field> fields = FieldUtil.getAllFieldMap(sourceClass);
        List<FieldBean> result = new ArrayList<FieldBean>();
        for (String fieldName : fields.keySet()) {
            Annotation[] annotations = fields.get(fieldName).getAnnotationsByType(clazz);
            FieldBean bean = new FieldBean();
            bean.setFieldName(fieldName);
            if (annotations != null && annotations.length > 0) {
                bean.setAnnotation(annotations[0]);
            }
            bean.setFieldType(fields.get(fieldName).getType());
            try {
                bean.setFieldValue(InvokeMethod.invokeGetter(source, fieldName));
            } catch (Exception e) {
                e.printStackTrace();
                throw new CustomException("invoke getter error", "反射调用getter错误");
            }
            result.add(bean);
        }
        return result;
    }

    public static <T extends Annotation> Annotation targetClassAnnotation(Object source, Class<T> clazz) {
        Annotation[] annotations = source.getClass().getAnnotationsByType(clazz);
        if (annotations != null && annotations.length > 0) {
            return annotations[0];
        }
        return null;
    }
}
