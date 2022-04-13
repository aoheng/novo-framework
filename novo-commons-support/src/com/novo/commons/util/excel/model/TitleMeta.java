/**
 * 
 */
package com.novo.commons.util.excel.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @description <br>
 * @author aoheng
 * @date 2020年12月23日
 */
public class TitleMeta {

	private String title;
	
	private int rowIndex = 1;
	
	private int columnIndex;
	
	private Class<?> valueType;
	
	private TitleMeta parent;
	
	private List<TitleMeta> children;
	

	public TitleMeta(String title, int rowIndex, int columnIndex) {
		this.title = title;
		this.rowIndex = rowIndex;
		this.columnIndex = columnIndex;
	}
	
	public TitleMeta(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	public int getColumnIndex() {
		return columnIndex;
	}

	public void setColumnIndex(int columnIndex) {
		this.columnIndex = columnIndex;
	}

	public TitleMeta getParent() {
		return parent;
	}

	public List<TitleMeta> getChildren() {
		return children == null ? (children = new ArrayList<TitleMeta>()) : children;
	}
	

	public Class<?> getValueType() {
		return valueType;
	}

	public void setValueType(Class<?> valueType) {
		this.valueType = valueType;
	}

	public void addChildren(TitleMeta child) {
		getChildren().add(child);
		child.parent = this;
	}

	@Override
	public String toString() {
		return "TitleCellBean [title=" + title + ", rowIndex=" + rowIndex + ", columnIndex=" + columnIndex + "]";
	}
	
	
}
