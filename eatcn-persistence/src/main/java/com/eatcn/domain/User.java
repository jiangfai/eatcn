
package com.eatcn.domain;

import java.util.Date;

/*
 * 鐢ㄦ埛绫�
 * 鏁版嵁搴撹〃:tb_user
 */
public class User {
	private Integer userid;
	private String username;
	private String password;
	private Date createTime;
	private String imgUrl;
	private String phone;
	private Integer sex;
	private Integer roleTag; // 0 - SA, 1 - A, 2 - U

	public User() {

		// TODO Auto-generated constructor stub
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getRoleTag() {
		return roleTag;
	}

	public void setRoleTag(Integer roleTag) {
		this.roleTag = roleTag;
	}

}
