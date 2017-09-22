package com.eatcn.dto;

public class ReturnedDTO {

	private Integer returnedId;
	private String username;
	private Integer orderId;
	private Integer itemId;
	private String reason;
	private Integer orderStatus;
	private Integer returnedStatus;
	private String userFeedback;

	public ReturnedDTO() {
		super();
	}

	public Integer getReturnedId() {
		return returnedId;
	}

	public void setReturnedId(Integer returnedId) {
		this.returnedId = returnedId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getReturnedStatus() {
		return returnedStatus;
	}

	public void setReturnedStatus(Integer returnedStatus) {
		this.returnedStatus = returnedStatus;
	}

	public String getUserFeedback() {
		return userFeedback;
	}

	public void setUserFeedback(String userFeedback) {
		this.userFeedback = userFeedback;
	}

}
