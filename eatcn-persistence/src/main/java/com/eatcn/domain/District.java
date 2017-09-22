package com.eatcn.domain;

import java.io.Serializable;

/**
 * 地区实体类 数据库表:tb_district
 * 
 * @desc: eatcn-persistence
 * @author: 徐可
 * @createTime: 2017年9月12日 上午10:37:02
 * @history:
 * @version: v1.0
 */
public class District implements Serializable {

	private Integer id;
	private String name;

	public Integer getId() {

		return id;
	}

	public void setId(Integer id) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

}
