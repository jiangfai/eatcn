/**
 * 
 */
package com.eatcn.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eatcn.domain.Receiver;
import com.eatcn.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-app.xml")
public class ReceiverServiceTest {
   
	  @Autowired
	    private ReceiverService  service;
	  
	  //测试添加收货人
	  @Test
	  public void saveReceiver(){
		    
		  Receiver receiver =new  Receiver();
	        receiver.setAddress("河北省石家庄市");
	        receiver.setIsReceived(false);
	        receiver.setPhone("123456");
	        receiver.setName("小菲");
	   
		 assertTrue(service.save(receiver));
		  
	  }
	 
	  /*//添加收货人信息
		int insert(Receiver receiver);
		 //删除收货人信息
		 int delete(Integer receiverId);
		 //修改收货人信息
		 int update(Receiver receiver);
		 
		 //根据用户主键查询收货人信息
		 List<Receiver> listAllByUserId(Integer userId);
		 //查询全部收获人信息
		 List<Receiver> listAll();*/
	  
	 /* //删除收货人
	 @Test
	 public void deleteReceiver(){
		  assertTrue(service.deleteReceiver(5)>0);
		  
		  
	 }*/
	 //修改收货人
	 @Test
	 public void update(){
		 Receiver receiver =new Receiver();
		 User user=new  User();
		 user.setUserid(1);
		 receiver.setAddress("河北省新乐市相家庄");
	        receiver.setIsReceived(true);
	        receiver.setPhone("123456");
	        receiver.setName("相亦菲");
	        receiver.setReceiverId(6);
	        receiver.setUser(user);
	        service.update(receiver);
	 }
	  //根据主键查询收货人
	 @Test
	 public void findById(){
		 User user=new  User();
		 user.setUserid(1);
		assertTrue(service.listReceiverByUserId(user.getUserid()).size()>0);
	 }
	 
	 //查询全部
	 @Test
	 public void findAll(){
		 
		 
		assertTrue(service.listAllReceiver().size()>0);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
}
