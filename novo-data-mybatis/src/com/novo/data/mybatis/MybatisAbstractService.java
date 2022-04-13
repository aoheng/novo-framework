package com.novo.data.mybatis;

import com.github.pagehelper.Page;
import com.novo.data.mybatis.util.ExampleHelper;
import com.novo.data.mybatis.util.PaginationUtil;
import com.novo.data.mybatis.util.SqlUtil;
import com.novo.framework.core.bean.util.BeanUtils;
import com.novo.framework.core.entity.BaseEntity;
import com.novo.framework.core.entity.EntityUtil;
import com.novo.framework.core.exception.CustomException;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.protocol.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class MybatisAbstractService<T extends BaseEntity, V extends Serializable> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected <R extends BaseRequestProtocol> ResponseProtocol<V> saveEntity(TkBaseMapper<T> baseMapper, R requestProtocol) {
        return this.saveEntity(baseMapper, requestProtocol, null);
    }

    protected <R extends BaseRequestProtocol> ResponseProtocol<V> saveEntity(TkBaseMapper<T> baseMapper, R requestProtocol, Message errorMessage) {
        BaseResponseProtocol<V> response = new BaseResponseProtocol<V>();
        try {
            T entity = this.getEntity();
            BeanUtils.copyProperties(requestProtocol, entity);
            entity.init();
            int result = baseMapper.insertSelective(entity);
            response.setData(EntityUtil.convert(entity, getVoClass()));
            response.writeMessage(result == 1 ? ResponseMessage.CODE_SUCCESS : ResponseMessage.CODE_FAIL);
            return response;
        } catch (Exception e) {
            logger.error("", e);
            if (errorMessage != null) {
                throw new CustomException(errorMessage.getCode(), errorMessage.getMessage());
            }
            throw new SystemException();
        }
    }

    protected <R extends BaseRequestProtocol> ResponseProtocol<V> updateEntity(TkBaseMapper<T> baseMapper, R requestProtocol, Message errorMessage) {
        BaseResponseProtocol<V> response = new BaseResponseProtocol<V>();
        try {
            T entity = this.getEntity();
            BeanUtils.copyProperties(requestProtocol, entity);
            int result = baseMapper.updateByPrimaryKeySelective(entity);
            response.setData(EntityUtil.convert(entity, getVoClass()));
            response.writeMessage(result == 1 ? ResponseMessage.CODE_SUCCESS : ResponseMessage.CODE_FAIL);
            return response;
        } catch (Exception e) {
            logger.error("", e);
            if (errorMessage != null) {
                throw new CustomException(errorMessage.getCode(), errorMessage.getMessage());
            }
            throw new SystemException();
        }
    }

    protected <R extends BaseRequestProtocol> ResponseProtocol<V> updateEntity(TkBaseMapper<T> baseMapper, R requestProtocol) {
        return this.updateEntity(baseMapper, requestProtocol, null);
    }

    protected <R extends BaseRequestProtocol> ResponseProtocol<V> deleteEntity(TkBaseMapper<T> baseMapper, R requestProtocol, Message errorMessage) {
        BaseResponseProtocol<V> response = new BaseResponseProtocol<V>();
        try {
            T entity = this.getEntity();
            BeanUtils.copyProperties(requestProtocol, entity);
            int result = baseMapper.delete(entity);
            response.writeMessage(result == 1 ? ResponseMessage.CODE_SUCCESS : ResponseMessage.CODE_FAIL);
            return response;
        } catch (Exception e) {
            logger.error("", e);
            if (errorMessage != null) {
                throw new CustomException(errorMessage.getCode(), errorMessage.getMessage());
            }
            throw new SystemException();
        }
    }

    protected <R extends BaseRequestProtocol> ResponseProtocol<V> deleteEntity(TkBaseMapper<T> baseMapper, R requestProtocol) {
        return this.deleteEntity(baseMapper, requestProtocol, null);
    }

    protected <R extends BaseRequestProtocol> ResponseProtocol<V> logicDeleteEntity(TkBaseMapper<T> baseMapper, R requestProtocol, Message errorMessage) {
        BaseResponseProtocol<V> response = new BaseResponseProtocol<V>();
        try {
            T entity = baseMapper.selectByPrimaryKey(requestProtocol.getId());
            BeanUtils.copyProperties(requestProtocol, entity, new String[]{BaseEntity.base_field_createTime,
                    BaseEntity.base_field_creatorId, BaseEntity.base_field_id,
                    BaseEntity.base_field_orgCode});
            entity.setIsDelete(true);
            int result = baseMapper.updateByPrimaryKeySelective(entity);
            response.writeMessage(result == 1 ? ResponseMessage.CODE_SUCCESS : ResponseMessage.CODE_FAIL);
            return response;
        } catch (Exception e) {
            logger.error("", e);
            if (errorMessage != null) {
                throw new CustomException(errorMessage.getCode(), errorMessage.getMessage());
            }
            throw new SystemException();
        }
    }

    protected <R extends BaseRequestProtocol> ResponseProtocol<V> logicDeleteEntity(TkBaseMapper<T> baseMapper, R requestProtocol) {
        return this.logicDeleteEntity(baseMapper, requestProtocol, null);
    }

    protected ResponseProtocol<V> findById(TkBaseMapper<T> baseMapper, RequestProtocol requestProtocol, Message errorMessage) {
        BaseResponseProtocol<V> response = new BaseResponseProtocol<V>();
        try {
            T entity = this.getEntity();
            BeanUtils.copyProperties(requestProtocol, entity);
            T result = baseMapper.selectByPrimaryKey(entity.getId());
            response.setData(EntityUtil.convert(result, getVoClass()));
            response.writeMessage(ResponseMessage.CODE_SUCCESS);
            return response;
        } catch (Exception e) {
            logger.error("", e);
            if (errorMessage != null) {
                throw new CustomException(errorMessage.getCode(), errorMessage.getMessage());
            }
            throw new SystemException();
        }
    }

    protected <R extends BaseRequestProtocol> ResponseProtocol<V> findById(TkBaseMapper<T> baseMapper, R requestProtocol) {
        return this.findById(baseMapper, requestProtocol, null);
    }

    private Boolean isPagination(RequestProtocol requestProtocol) {
        if (Pagination.class.isAssignableFrom(requestProtocol.getClass())) {
            Pagination pagination = (Pagination) requestProtocol;
            if (pagination.getPaginationStatus()) {
                return true;
            }
        }
        return false;
    }

    private Boolean isSort(RequestProtocol requestProtocol) {
        if (DataSort.class.isAssignableFrom(requestProtocol.getClass())) {
            DataSort dataSort = (DataSort) requestProtocol;
            if (dataSort.getSortType() != null && dataSort.getSortFields() != null && dataSort.getSortFields().length > 0) {
                return true;
            }
        }
        return false;
    }

    protected ResponseProtocol<List<V>> findEntity(TkBaseMapper<T> baseMapper, RequestProtocol requestProtocol, Message errorMessage) {
        try {

            Example example = ExampleHelper.getExample(requestProtocol, this.getEntity().getClass());
            if (isSort(requestProtocol)) {
                example.setOrderByClause(SqlUtil.getOrderByClause(requestProtocol));
            }
            if (this.isPagination(requestProtocol)) {
                PaginationResponseProtocol<List<V>> response = new PaginationResponseProtocol<List<V>>();
                Page<T> page = (Page<T>) baseMapper.selectByExample(example);
                if (page.getResult() != null && !page.getResult().isEmpty()) {
                    response.setData(EntityUtil.convert(page.getResult(), getVoClass()));
                }
                PaginationUtil.copayValue(page, response);
                response.writeMessage(ResponseMessage.CODE_SUCCESS);
                return response;
            } else {
                BaseResponseProtocol<List<V>> response = new BaseResponseProtocol<List<V>>();
                List<T> dataList = baseMapper.selectByExample(example);
                if (dataList != null && !dataList.isEmpty()) {
                    response.setData(EntityUtil.convert(dataList, getVoClass()));
                }
                response.writeMessage(ResponseMessage.CODE_SUCCESS);
                return response;
            }

        } catch (Exception e) {
            logger.error("", e);
            if (errorMessage != null) {
                throw new CustomException(errorMessage.getCode(), errorMessage.getMessage());
            }
            throw new SystemException();
        }
    }

    protected ResponseProtocol<List<V>> findEntity(TkBaseMapper<T> baseMapper, RequestProtocol requestProtocol) {
        return this.findEntity(baseMapper, requestProtocol, null);
    }

    protected <R extends BaseRequestProtocol> ResponseProtocol<List<V>> findAll(TkBaseMapper<T> baseMapper, R requestProtocol, Message errorMessage) {
        BaseResponseProtocol<List<V>> response = new BaseResponseProtocol<List<V>>();
        try {
            T entity = this.getEntity();
            BeanUtils.copyProperties(requestProtocol, entity);
            List<T> result = baseMapper.select(entity);
            if (result != null && !result.isEmpty()) {
                response.setData(EntityUtil.convert(result, getVoClass()));
            }
            response.writeMessage(ResponseMessage.CODE_SUCCESS);
            return response;
        } catch (Exception e) {
            logger.error("", e);
            if (errorMessage != null) {
                throw new CustomException(errorMessage.getCode(), errorMessage.getMessage());
            }
            throw new SystemException();
        }
    }

    protected <R extends BaseRequestProtocol> ResponseProtocol<List<V>> findAll(TkBaseMapper<T> baseMapper, R requestProtocol) {
        return this.findAll(baseMapper, requestProtocol, null);
    }

    private T getEntity() {
        try {
            return this.getEntityClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new SystemException();
        }
    }

    private Class<T> getEntityClass() {
        @SuppressWarnings("unchecked")
        Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
        return entityClass;
    }

    @SuppressWarnings("unchecked")
    protected Class<V> getVoClass() {
        return (Class<V>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[1];
    }
}

