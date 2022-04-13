package com.novo.framework.core.reflect;

import com.novo.framework.core.exception.NullFieldException;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.protocol.ResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class FieldValidator {

    private final static Logger logger = LoggerFactory.getLogger(FieldValidator.class);

    public static void validate(Object target, String[] fieldNames) {
        if (fieldNames == null) {
            logger.error("fieldNames not is null");
            throw new SystemException();
        }
        for (String fieldName : fieldNames) {
            Object value = null;
            try {
                value = InvokeMethod.invokeGetter(target, fieldName);
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(fieldName + " 字段:" + e.getMessage());
                throw new SystemException();
            }

            if (value == null) {
                throw new NullFieldException(fieldName, ResponseMessage.CODE_FIELD_NOT_BE_NULL);
            }
        }
    }

    /**
     * 如果所需要验证的字段值全部为空，则抛异常
     */
    public static void validateAnyOne(Object target, String[] fieldNames) {
        if (fieldNames == null) {
            logger.error("fieldNames not is null");
            throw new SystemException();
        }
        boolean anyOne = false;
        StringBuilder buillder = new StringBuilder();
        for (String fieldName : fieldNames) {
            buillder.append(fieldName + " ");
            Object value = null;
            try {
                value = InvokeMethod.invokeGetter(target, fieldName);
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(fieldName + " 字段:" + e.getMessage());
                throw new SystemException();
            }

            if (value != null) {
                //throw new NullFieldException(fieldName,ResponseMessage.CODE_FIELD_NOT_BE_NULL);
                anyOne = true;
            }
        }
        if (!anyOne) {
            throw new NullFieldException(buillder.toString() + " 必需某个字段", ResponseMessage.CODE_FIELD_NOT_BE_NULL);
        }

    }

    public static void validateNotNull(Object target, String[] fieldNames) {
        if (fieldNames == null) {
            logger.error("fieldNames not is null");
            throw new SystemException();
        }
        for (String fieldName : fieldNames) {
            Object value = null;
            try {
                value = InvokeMethod.invokeGetter(target, fieldName);
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(fieldName + " 字段:" + e.getMessage());
                throw new SystemException();
            }

            if (value == null || "".equals(value)) {
                throw new NullFieldException(fieldName, ResponseMessage.CODE_FIELD_NOT_BE_NULL);
            }
        }

    }
}
