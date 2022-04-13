package com.novo.framework.core.protocol;

import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.reflect.FieldUtil;
import com.novo.framework.core.reflect.InvokeMethod;

import java.lang.reflect.Field;
import java.util.Map;

/***
 * 实现了Pagination接口的响应协议
 * @ClassName: PaginationResponseProtocol
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author chen chuang
 * @date 2020年10月11日 下午2:00:51
 *
 */
public class PaginationResponseProtocol<T> extends BaseResponseProtocol<T> implements Pagination {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    // 总记录数
    private Long total = 0L;
    // 总页数
    private Integer pages = 0;
    // 当前页
    private Integer pageNo = 1;
    // 每页的数量
    private Integer pageSize = 10;
    private Boolean paginationStatus = true;

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

    @SuppressWarnings("unchecked")
    public void setPaginationData(Object page) {
        Map<String, Field> map = FieldUtil.getAllFieldMap(page.getClass());

        try {
            Field totalField = map.get("total");
            if (totalField != null) {
                Object value = InvokeMethod.invokeGetter(page, "total");
                this.setTotal(value != null ? (long) value : 0l);
            }

            Field pagesField = map.get("pages");
            if (pagesField != null) {
                Object value = InvokeMethod.invokeGetter(page, "pages");
                this.setPages(value != null ? (int) value : 0);
            }

            Field pageNoField = map.get("pageNo");
            if (pageNoField != null) {
                Object value = InvokeMethod.invokeGetter(page, "pageNo");
                this.setPages(value != null ? (int) value : 0);
            }

            Field pageSizeField = map.get("pageSize");
            if (pageSizeField != null) {
                Object value = InvokeMethod.invokeGetter(page, "pageSize");
                this.setPages(value != null ? (int) value : 0);
            }

            Field rowsField = map.get("rows");
            if (rowsField != null) {
                this.setData((T) (InvokeMethod.invokeGetter(page, "rows")));
            }
            writeMessage(ResponseMessage.CODE_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SystemException();
        }


    }
}
