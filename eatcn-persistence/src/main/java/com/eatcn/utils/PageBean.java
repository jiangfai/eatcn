package com.eatcn.utils;

import java.util.List;

public class PageBean<T> {

	private int currentPage;// 当前页
	private int pageSize;// 每页显示的数据条数
	private int totalCount;// 总的搜索到的数据条数
	private int totalPageSize;// 总的页数
	private List<T> list;// 对象集合,根据自己的需要放对象

	public int getTotalPageSize() {
		return totalPageSize;
	}

	public void setTotalPageSize(int totalPageSize) {
		this.totalPageSize = totalPageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public PageBean(int currentPage, int pageSize, int totalCount, int totalPageSize, List<T> list) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.totalPageSize = totalPageSize;
		this.list = list;
	}

	public PageBean() {
		super();
	}

	@Override
	public String toString() {
		return "PageBean [currentPage=" + currentPage + ", pageSize=" + pageSize + ", totalCount=" + totalCount
				+ ", totalPageSize=" + totalPageSize + ", list=" + list + "]";
	}

}
