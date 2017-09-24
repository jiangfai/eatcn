/**
 * 
 */
package com.eatcn.service;

import java.util.List;
import java.util.Map;

import com.eatcn.domain.User;
/**
 * 
* @desc: eatcn-user
* @descripe:用户类接口
* @author: Pingpo_Wang
* @createTime: 2017年9月12日 上午9:24:21
* @history:
* @version: v1.0
 */
public interface UserService {
    //用户注册
	boolean register(User user);
    //用户登录
	boolean login(String username,String password);
   //用户动态修改
	int updateUser(User user);
	//用户修改
	int update(User user);
	//修改用户角色
	int updataUserRole(Integer useId,Integer roleTag);
	//删除用户
	int deleteUser(Integer userId);
    //根据角色查询用户
	List<User> listAllUser(Integer toleTag);
    //根据用户名查询用户
	
	User getUserByUsername(String username);
	//根据主键查询用户
	User getuserByUserId(Integer userid);
	
}
