/**
 * 订单项
 */
package com.eatcn.domain;

/**
 * @desc: eatcn-persistence
 * @descripe:XXXX
 * @author: Pingpo_Wang
 * @createTime: 2017年9月6日 下午5:21:51
 * @history:
 * @version: v1.0
 * 
 */
/*
 * 购物项类 数据库表:tb_orderitem
 */
public class Orderitem {
	private Integer itemId;
	private Goods goods;// 一对多
	private Order order;// 一对多
	private Double count;
	private Double subtotal;

	public Orderitem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Double getCount() {
		return count;
	}

	public void setCount(Double count) {
		this.count = count;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

}
