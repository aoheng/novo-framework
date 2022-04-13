package com.novo.framework.core.page;

import java.util.List;

public class Page<T> extends PageParams {

    //总记录数
    private long total;
    //总页数
    private int pages;
    //结果集
    private List<T> rows;

    public Page() {}

    public Page(PageParams pageParams, long total, List<T> data) {
        setPageNo(pageParams.getPageNo());
        setPageSize(pageParams.getPageSize());
        this.total = total;
        this.rows = data;
        this.pages = (int) ((this.total / this.getPageSize()) + (this.total % this.getPageSize() == 0 ? 0 : 1));
    }


    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> data) {
        this.rows = data;
    }


}
