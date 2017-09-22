/**
 * 
 */
package com.eatcn.domain;

import java.util.Date;

/*
 * 历史记录表
 * 数据库表:tb_modify_history
 */
public class ModifyHistory {

	private Integer historyId;
	private Goods goods;// 一对多
	private User user;// 一对多
	private String info;
	private Date modifyTime;

	public ModifyHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getHistoryId() {
		return historyId;
	}

	public void setHistoryId(Integer historyId) {
		this.historyId = historyId;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

}
