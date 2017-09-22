package com.eatcn.domain;

public class CartItem {

	// 购买商品
	private Goods goods;
	// 购买数量
	private double count;
	// 购买小计
	private double subTotal;

	public Goods getGoods() {

		return goods;
	}

	public void setGoods(Goods goods) {

		this.goods = goods;
	}

	public double getCount() {

		return count;
	}

	public void setCount(double count) {

		this.count = count;
	}

	public double getSubTotal() {

		return subTotal;
	}

	public void setSubTotal(double subTotal) {

		this.subTotal = subTotal;
	}

}
