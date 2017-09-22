package com.eatcn.domain;

/**
 * 和店面与货物中间表对应的实体类
 * 
 * @author jssj
 *
 */

public class StoreWithGoods {

	private Integer id;
	private Goods goods;
	private Store store;
	private double storeStock;
	private boolean isOnsale;

	public StoreWithGoods() {
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

	public double getStoreStock() {
		return storeStock;
	}

	public void setStoreStock(double storeStock) {
		this.storeStock = storeStock;
	}

	public boolean isOnsale() {
		return isOnsale;
	}

	public void setOnsale(boolean isOnsale) {
		this.isOnsale = isOnsale;
	}

}
