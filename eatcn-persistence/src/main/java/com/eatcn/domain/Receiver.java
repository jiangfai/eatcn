/**
 * 
 */
package com.eatcn.domain;

/**
 * @desc: eatcn-persistence
 * @descripe:XXXX
 * @author: Pingpo_Wang
 * @createTime: 2017年9月6日 下午5:38:53
 * @history:
 * @version: v1.0
 * 
 */
/*
 * 收货人 数据库表:tb_receiver
 */
public class Receiver {

	private Integer receiverId;
	private String name;
	private String address;
	private String phone;
	private Boolean isReceived;
	private User user;//

	public Receiver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(Integer receiverId) {
		this.receiverId = receiverId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getIsReceived() {
		return isReceived;
	}

	public void setIsReceived(Boolean isReceived) {
		this.isReceived = isReceived;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
