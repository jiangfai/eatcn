package com.eatcn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 涓庡嚭璐ц〃瀵瑰簲鐨勫疄浣撶被,鐢ㄦ潵鏌ヨ鍑鸿揣璁板綍鐨�
 */
public class GoodsRecords implements Serializable {

	private Integer id;
	private Goods goods;
	private Store store;
	private Date appTime;
	private Date deliverTime;
	private Integer status;
	private Double appCount;
	private Double deliverCount;
	private String remarks;

	public GoodsRecords() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Date getAppTime() {
		return appTime;
	}

	public void setAppTime(Date appTime) {
		this.appTime = appTime;
	}

	public Date getDeliverTime() {
		return deliverTime;
	}

	public void setDeliverTime(Date deliverTime) {
		this.deliverTime = deliverTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Double getAppCount() {
		return appCount;
	}

	public void setAppCount(Double appCount) {
		this.appCount = appCount;
	}

	public Double getDeliverCount() {
		return deliverCount;
	}

	public void setDeliverCount(Double deliverCount) {
		this.deliverCount = deliverCount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
