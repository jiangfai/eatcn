/**
 * 
 */
package com.eatcn.domain;

import java.util.Date;
import java.util.List;

/*
 * 订单表
 * 数据库表:tb_order
 */
public class Order {

	private Integer orderId;
	private Date orderTime;
	private Double total;
	private Integer status;
	private Store store;// 一对多
	private User user;// 一对多
	private Receiver receiver;// 一对多
	private List<Orderitem> orderitems;

	public List<Orderitem> getOrderitems() {

		return orderitems;
	}

	public void setOrderitems(List<Orderitem> orderitems) {

		this.orderitems = orderitems;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

}
