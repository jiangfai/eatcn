/**
 * 
 */
package com.eatcn.mapper;

import java.util.List;
import java.util.Map;

import com.eatcn.domain.User;

/*
 * 用户接口
 */

public interface UserMapper {

	// 添加用户
	int insert(User user);

	// 根据用户名查询用户
	User getUserByUsername(String username);

	// 根据主键查询用户
	User getUserById(Integer userId);

	// 修改普通用户信息
	int update(User user);

	// 动态修改用户信息
	int updateUser(User user);

	// 修改用户角色
	int updateUserRole(Map<String, Object> map);

	// 删除用户
	int deleteByUserId(Integer userId);

	// 根据权限查询用户
	List<User> listAllUser(Integer roleTag);

}
