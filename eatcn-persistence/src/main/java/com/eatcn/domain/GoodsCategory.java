package com.eatcn.domain;

import java.io.Serializable;

/**
 * 货物分类
 * 
 * @author jssj
 *
 */
public class GoodsCategory implements Serializable {

	private Integer id;
	private String category;
	private int parentId;
	private int tag;

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public GoodsCategory() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

}
