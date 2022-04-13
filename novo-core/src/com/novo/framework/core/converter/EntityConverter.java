 package com.novo.framework.core.converter;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import com.novo.framework.core.bean.util.BeanUtils;
import com.novo.framework.core.entity.BaseEntity;
import com.novo.framework.core.exception.SystemException;

 public class EntityConverter<S extends BaseEntity,V extends Serializable> implements Converter<S,V>{

     @Override
     public V convert(S entity) {
         V vo = this.getVo();
         try {
             BeanUtils.copyProperties(entity, vo);
             return vo;
         } catch (Exception e) {
             e.printStackTrace();
             throw new SystemException();
         }
     }

     protected V getVo() {
         @SuppressWarnings("unchecked")
         Class <V> entityClass = (Class<V>) ((ParameterizedType) getClass()
                 .getGenericSuperclass()).getActualTypeArguments()[ 1 ];
         try {
             return entityClass.newInstance();
         } catch (InstantiationException | IllegalAccessException e) {
             e.printStackTrace();
             throw new SystemException();
         }
     }
 }
