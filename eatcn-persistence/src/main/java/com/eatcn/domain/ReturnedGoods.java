package com.eatcn.domain;

public class ReturnedGoods {

	private Integer id;
	private Orderitem orderitem;
	private Integer returnedStatus;
	private String reason;
	private String userFeedback;

	public ReturnedGoods() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Orderitem getOrderitem() {
		return orderitem;
	}

	public void setOrderitem(Orderitem orderitem) {
		this.orderitem = orderitem;
	}

	public Integer getStatus() {
		return getStatus();
	}

	public void setStatus(Integer returnedStatus) {
		this.returnedStatus = returnedStatus;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getUserFeedback() {
		return userFeedback;
	}

	public void setUserFeedback(String userFeedback) {
		this.userFeedback = userFeedback;
	}

}
