package com.novo.framework.core.entity;

import com.novo.framework.core.util.IdUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity implements Serializable, Entity {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    /***
     * @Fields id
     */
    @Id
    @Column(name = "id", length = 19)
    protected Long id;
    /***
     * @Fields isDelete:false为数据可用，true数据不可用
     */
    @Column(name = "delete_status")
    protected Boolean isDelete;
    /***
     * @Fields createTime:数据创建时间
     */
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createTime;
    /***
     * @Fields updateTime:数据更新时间
     */
    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date updateTime;

    @Column(name = "creator_id", length = 19)
    protected Long creatorId;//创建者ID

    @Column(name = "org_code")
    protected String orgCode;
    /***
     * @Fields version:用于数据乐观锁
     */
    @Version
    protected Integer version;

    /***
     * @Fields dataStatus:数据状态，该状态所代表的意义由具体的业务逻辑而定；
     */
    @Column(name = "data_status")
    protected Boolean dataStatus;

    @Column(name = "data_sort")
    protected Long dataSort;

    protected BaseEntity() {
    }


    protected BaseEntity(boolean isNullEntity) {
        isDelete = false;
        if (!isNullEntity)
            this.init();
    }


    protected BaseEntity(Long id) {
        super();
        this.id = id;
    }

    public void init() {
        if (id == null||id==0) {
            this.id = IdUtil.getId();
        }
        if (isDelete == null) {
            isDelete = false;
        }
        if (createTime == null) {
            createTime = new Date();
        }
        if (updateTime == null) {
            updateTime = new Date();
        }
        if (dataSort == null) {
            dataSort = 0L;
        }
        if (dataStatus == null) {
            dataStatus = true;
        }
    }


    public Boolean getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Boolean dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getDataSort() {
        return dataSort;
    }

    public void setDataSort(Long dataSort) {
        this.dataSort = dataSort;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }


}
