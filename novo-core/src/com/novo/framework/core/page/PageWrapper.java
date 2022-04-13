package com.novo.framework.core.page;

import com.novo.framework.core.protocol.PaginationRequestProtocol;
import com.novo.framework.core.protocol.PaginationResponseProtocol;
import com.novo.framework.core.util.JacksonUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Aoheng on 2020/12/14.
 */
public class PageWrapper<T> {

    /** 记录总条数 */
    private Long total = 0L;
    /** 当前页的数据项 */
    private List<T> pageData;
    /** 页索引（从1开始） */
    private Integer pageNo;
    /** 页大小 */
    private Integer pageSize;
    /** 起始记录数 */
    private Integer startRow = 0;
    /** 搜索关键字 */
    private String searchKey;
    /** 附加参数 */
    private Map<String, Object> exParams = new HashMap<>();

    public PageWrapper() {

    }

    public PageWrapper(PaginationRequestProtocol requestProtocol) {
        setPageNo(requestProtocol.getPageNo());
        setPageSize(requestProtocol.getPageSize());
        setExParams(JacksonUtils.obj2map(requestProtocol));
    }

    public void reset(PaginationResponseProtocol responseProtocol) {
        responseProtocol.setPageNo(getPageNo());
        responseProtocol.setPages(getPages());
        responseProtocol.setPageSize(getPageSize());
        responseProtocol.setTotal(getTotal());
        responseProtocol.setData(getPageData());
    }

    public void addExParam(String key, Object value) {
        this.exParams.put(key, value);
    }

    public Integer getPages() {
        return Math.toIntExact((total + pageSize - 1) / pageSize);
    }

    public String getSearchKey() { return searchKey; }

    public void setSearchKey(String searchKey) { this.searchKey = searchKey; }

    public Integer getPageNo() {
        Integer i = pageNo;
        if ((pageNo == null) && (startRow != null) && (pageSize != null)) {
            i = (startRow / pageSize) + 1;
        }
        return i;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        if ((this.pageNo != null) && (pageSize != null)) {
            startRow = (this.pageNo - 1) * pageSize;
        }
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        if ((this.pageSize != null) && (pageNo != null)) {
            startRow = (this.pageNo - 1) * pageSize;
        }
    }

    public Integer getStartRow() {
        Integer i = startRow;
        if ((startRow == null) && (pageNo != null) && (pageSize != null)) {
            i = (this.pageNo - 1) * pageSize;
        }
        return i;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
        if ((this.startRow != null) && (pageSize != null)) {
            pageNo = (this.startRow / pageSize) + 1;
        }
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getPageData() {
        return pageData;
    }

    public void setPageData(List<T> pageData) {
        this.pageData = pageData;
    }

    public Map<String, Object> getExParams() { return exParams; }

    public void setExParams(Map<String, Object> exParams) { this.exParams = exParams; }
}
