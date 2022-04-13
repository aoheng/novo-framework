package com.novo.framework.core.page;

public class PageInfo {

    public static final String SORT_TYPE_ASC = "asc";
    public static final String SORT_TYPE_DES = "desc";
    private long totals;
    private int startIndex;
    private int pageSize = 20;
    private Boolean paginationStatus = true;
    private String sortItem;
    private String sortType = SORT_TYPE_DES;//默认降序

    /**
     * @param pageNo
     * @param pageSize
     */
    public PageInfo(final int pageNo, final int pageSize) {
        this(pageNo, pageSize, "", SORT_TYPE_DES,true);
    }

    /**
     * @param pageNo
     * @param pageSize
     * @param paginationStatus
     */
    public PageInfo(final int pageNo, final int pageSize,Boolean paginationStatus) {
        this(pageNo, pageSize, "", SORT_TYPE_DES,paginationStatus);
    }

    public PageInfo(final int pageNo, final int pageSize, final String sortItem,Boolean paginationStatus) {
        this(pageNo, pageSize, sortItem, SORT_TYPE_DES,paginationStatus);
    }

    /**
     * @param pageNo
     * @param pageSize
     * @param sortItem
     */
    public PageInfo(final int pageNo, final int pageSize, final String sortItem, final String sortType) {
        this(pageNo, pageSize, sortItem, sortType,true);
    }

    /**
     * @param sortType (asc|desc)
     */
    public PageInfo(final int pageNo, final int pageSize, final String sortItem, final String sortType,Boolean paginationStatus) {
        this.startIndex = (pageNo - 1) * pageSize;
        this.pageSize = pageSize;
        this.sortItem = sortItem;
        this.sortType = sortType;
        this.paginationStatus=paginationStatus;
    }

    public long getTotals() {
        return totals;
    }

    public void setTotals(long totals) {
        this.totals = totals;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortItem() {
        return sortItem;
    }

    public void setSortItem(String sortItem) {
        this.sortItem = sortItem;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public Boolean getPaginationStatus() {
        return paginationStatus;
    }

    public PageInfo setPaginationStatus(Boolean paginationStatus) {
        this.paginationStatus = paginationStatus;
        return this;
    }
}