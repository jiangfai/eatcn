/**
 * 
 */
package com.eatcn.service.impl;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eatcn.domain.User;
import com.eatcn.mapper.UserMapper;
import com.eatcn.service.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService{
     @Autowired
     private UserMapper mapper;
     
	public boolean register(User user) {
		   String username=user.getUsername();
		   User user2 = mapper.getUserByUsername(username);
		   if(user2==null){			   
			   user.setRoleTag(2);
			   user.setCreateTime(new Date());
			   user.setPassword(DigestUtils.md5Hex(user.getPassword()));
			 return   mapper.insert(user)>0;
			   
		   }
		return false;
	}

	public boolean login(String username,String password) {
		  if(username!=null && password!=null){
			  User user = mapper.getUserByUsername(username);
			  boolean ref=user.getPassword().equals(DigestUtils.md5Hex(password));
			  return ref;
		  } 
		
		
		return false;
	}

	
	public List<User> listAllUser(Integer roleTag) {
		List<User> list = mapper.listAllUser(roleTag);
		return list.size()>0?list:null;
				
	}

	public int updateUser(User user) {
		
		return mapper.update(user);
	}

	public int deleteUser(Integer userId) {
		
		return mapper.deleteByUserId(userId);
	}  

	public int updataUserRole(Integer userId,Integer roleTag) {
		Map<String, Object> map=new HashMap<String,Object>();
        map.put("roleTag",roleTag);
		map.put("userid",userId);
		int i = mapper.updateUserRole(map);
		
		return i;
	}

	@Override
	public int update(User user) {
		
		return mapper.update(user);
	}

	@Override
	public User getUserByUsername(String username) {
		    User user = mapper.getUserByUsername(username);
		    if(user!=null){
		    	return user;
		    }
		return null;
	}

	@Override
	public User getuserByUserId(Integer userid) {
		     User user = mapper.getUserById(userid);
		return user!=null?user:null;
	}

}

