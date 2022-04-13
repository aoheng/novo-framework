package com.novo.data.jpa.query;

import com.novo.framework.core.protocol.Pagination;

public class PaginationSet implements Pagination{
	
	private Long total = 0l;
	private Integer pages = 0;
	private Integer pageNo = 0;
	private Integer pageSize = 10;
	private Boolean paginationStatus;
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
