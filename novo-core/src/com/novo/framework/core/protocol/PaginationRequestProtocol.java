package com.novo.framework.core.protocol;

/****
 * @ClassName: PaginationRequestProtocol
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author chen chuang
 * @date 2020年11月15日 上午9:16:22
 *
 */
public class PaginationRequestProtocol extends SortRequestProtocol implements Pagination {

    private static final long serialVersionUID = 1L;

    private Long total = 0L;
    private Integer pages = 0;
    private Integer pageNo = 1;
    private Integer pageSize = 10;

    private Boolean paginationStatus = true;

    private String[] fieldBean;


    public String[] getFieldBean() {
        return fieldBean;
    }

    public void setFieldBean(String[] fieldBean) {
        this.fieldBean = fieldBean;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public boolean getPaginationStatus() {
        return paginationStatus;
    }

    @Override
    public void setPaginationStatus(Boolean paginationStatus) {
        this.paginationStatus = paginationStatus;
    }


}
