package com.novo.framework.core.protocol;

import java.util.Date;

public class BaseRequestProtocol extends DefaultRequestProtocol {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    /***
     * @Fields id
     */
    protected Long id;
    /***
     * @Fields isDelete:false为数据可用，true数据不可用
     */
    protected Boolean isDelete = false;
    /***
     * @Fields createTime:数据创建时间
     */
    protected Date createTime;
    /***
     * @Fields updateTime:数据更新时间
     */
    protected Date updateTime;

    protected String orgCode;

    protected Long creatorId;//创建者ID

    public static void main(String[] args) {
        System.out.println(new Date());
        BaseRequestProtocol b = new BaseRequestProtocol();
        b.setCreateTime(new Date());
        b.setDataScope(DefinitionDataScope.COMPANY);
        System.out.println(b.toString());
    }

    @Override
    public String toString() {
        return this.toJson();
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
}
