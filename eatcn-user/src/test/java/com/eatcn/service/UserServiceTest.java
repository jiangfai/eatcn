/**
 * 
 */
package com.eatcn.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eatcn.domain.User;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-app.xml")
public class UserServiceTest {
     
	 
	  
	 /* boolean register(User user);

		boolean login(String username,String password);

		int updateUser(User user);
		
		int deleteUser(Integer userId);

		List<User> listAllUser(Integer toleTag);
	*/
	 @Autowired
	  private UserService service;
	  //测试用户注册
	  /*@Test
	  public void register(){
		  
		  User user=new  User();
		  user.setUsername("夜华89");
		   user.setPassword("123");
          user.setImgUrl("123.jpg");
          user.setCreateTime(new Date());
          user.setPhone("15322365412");
          user.setRoleTag(1);
          user.setSex(1);
         assertTrue(service.register(user));
         assertNotNull(user.getPhone());
		  
	  }*/
	/*  
	  //用户登录
	  @Test
	  public void login(){
		  User user =new  User();
		  user.setUsername("夜华6");
		  user.setPassword("123");
		 
		assertTrue(service.login(user.getUsername(),user.getPassword()));
		user.setPassword("111");
		assertFalse(service.login(user.getUsername(),user.getPassword()));
		
	  }*/
	  /*//修改用户
	  @Test
	  public void update(){
		  User user=new  User();
		  user.setUsername("夜华19");
		   user.setPassword("456");
          user.setImgUrl("123.jpg");
          user.setCreateTime(new Date());
          user.setPhone("15322365412");
          user.setRoleTag(1);
          user.setSex(1);
          user.setUserid(19);
          assertTrue(service.updateUser(user)>0);
	  }*/
	 /* //删除用户
	  @Test
	  public void delete(){
		  User user=new  User();
		 
          user.setUserid(11);
          assertTrue(service.deleteUser(user.getUserid())>0);
	  }*/
	  
	  //查询全部
	  @Test
	  public  void selectAll(){
		  List<User> list = service.listAllUser(2);
		  assertNotNull(list);
	  }
	   
	 /* //修改用户权限
	  @Test
	  public void updateRole(){
		 
		   User user=new  User();
		   user.setRoleTag(2);
		   user.setUserid(20);
		  int i = service.updataUserRole(user.getUserid(), user.getRoleTag());
		  assertTrue(i>0);
	  }
	  */
	  
	  
	  
	  
	  
	  
	  
	  
}


