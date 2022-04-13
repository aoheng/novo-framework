package com.novo.framework.core.protocol;

/****
 * @ClassName: Pagination
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author chen chuang
 * @date 2020年11月15日 上午9:16:56
 *
 */
public interface Pagination {

    public static final String pagination_field_total = "total";
    public static final String pagination_field_pages = "pages";
    public static final String pagination_field_pageNo = "pageNo";
    public static final String pagination_field_pageSize = "pageSize";


    public Long getTotal();

    public void setTotal(Long total);

    public Integer getPages();

    public void setPages(Integer pages);

    public Integer getPageNo();

    public void setPageNo(Integer pageNo);

    public Integer getPageSize();

    public void setPageSize(Integer pageSize);

    public boolean getPaginationStatus();

    public void setPaginationStatus(Boolean paginationStatus);
}
