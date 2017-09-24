/**
 * 
 */
package com.eatcn.dto;

import java.io.Serializable;

/**
* @desc: eatcn-user
* @descripe:XXXX
* @author: Pingpo_Wang
* @createTime: 2017年9月18日 下午2:28:47
* @history:
* @version: v1.0

*/

public class UserDTO implements Serializable{
	private Integer id;
	private String username;
	private String password;
	private Integer sex;
	private String phoneNumber;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", username=" + username + ", password=" + password + ", sex=" + sex
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDTO(Integer id, String username, String password, Integer sex, String phoneNumber) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
	}
	
}
