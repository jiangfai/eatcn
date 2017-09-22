package com.eatcn.domain;

import java.io.Serializable;
import java.sql.Time;

/**
 * 商店实体类 数据库表:tb_store
 * 
 * @desc: eatcn-persistence
 * @author: 徐可
 * @createTime: 2017年9月12日 上午10:38:43
 * @history:
 * @version: v1.0
 */
public class Store implements Serializable {

	private Integer id;
	private District district;
	private User user;
	private String name;
	private Time opentime;
	private Time closetime;
	private Double locationX;
	private Double locationY;
	private Integer status;
	private String closeReason;
	private String address;
	private Integer roleTag;

	public Integer getId() {

		return id;
	}

	public void setId(Integer id) {

		this.id = id;
	}

	public District getDistrict() {

		return district;
	}

	public void setDistrict(District district) {

		this.district = district;
	}

	public User getUser() {

		return user;
	}

	public void setUser(User user) {

		this.user = user;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public Time getOpentime() {

		return opentime;
	}

	public void setOpentime(Time opentime) {

		this.opentime = opentime;
	}

	public Time getClosetime() {

		return closetime;
	}

	public void setClosetime(Time closetime) {

		this.closetime = closetime;
	}

	public Double getLocationX() {

		return locationX;
	}

	public void setLocationX(Double locationX) {

		this.locationX = locationX;
	}

	public Double getLocationY() {

		return locationY;
	}

	public void setLocationY(Double locationY) {

		this.locationY = locationY;
	}

	public Integer getStatus() {

		return status;
	}

	public void setStatus(Integer status) {

		this.status = status;
	}

	public String getCloseReason() {

		return closeReason;
	}

	public void setCloseReason(String closeReason) {

		this.closeReason = closeReason;
	}

	public String getAddress() {

		return address;
	}

	public void setAddress(String address) {

		this.address = address;
	}

	public Integer getRoleTag() {

		return roleTag;
	}

	public void setRoleTag(Integer roleTag) {

		this.roleTag = roleTag;
	}

}
