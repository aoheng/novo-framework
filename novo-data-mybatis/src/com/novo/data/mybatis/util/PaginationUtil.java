package com.novo.data.mybatis.util;

import com.github.pagehelper.Page;
import com.novo.framework.core.protocol.Pagination;

public class PaginationUtil {
	
	public static void copayValue(Page<?> fromePage,Pagination toPagination) {
		toPagination.setPageNo(fromePage.getPageNum());
		toPagination.setPages(fromePage.getPages());
		toPagination.setPageSize(fromePage.getPageSize());
		toPagination.setTotal(fromePage.getTotal());
	}
}
