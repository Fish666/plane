package com.chinasoft.planeticket.pojo;

import java.util.List;

public class Page<T> {
    private T query;
    private int pageSize=10;
    private int curPage=1;
    private int start;
    private int total;
    private List<T> rows;
    
	public T getQuery() {
		return query;
	}
	public void setQuery(T query) {
		this.query = query;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "Page [query=" + query + ", pageSize=" + pageSize + ", curPage=" + curPage + ", start=" + start
				+ ", total=" + total + ", rows=" + rows + "]";
	} 
    
}
