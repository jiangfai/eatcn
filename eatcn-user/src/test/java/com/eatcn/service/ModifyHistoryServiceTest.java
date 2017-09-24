/**
 * 
 */
package com.eatcn.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eatcn.domain.Goods;
import com.eatcn.domain.ModifyHistory;
import com.eatcn.domain.User;
import com.eatcn.utils.PageBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-app.xml")
public class ModifyHistoryServiceTest {
    
	@Autowired
	private ModifyHistoryService service;
	
	//添加记录
	@Test
	public void save(){
		/*ModifyHistory history=new  ModifyHistory();
		Goods goods=new Goods();
		goods.setGoodId(2);
		User user=new User();
		user.setUserid(1);
		    history.setModifyTime(new Date());
		    history.setInfo("我会努力");
		    history.setGoods(goods);
		    history.setUser(user);
		    history.setGoods(goods);
		   int i = service.save(history);
		   Assert.assertTrue(i>0);
		*/
		
		
	}
	/*//根据用户查询历史记录
	@Test
	public void listById(){
		User user=new User();
		user.setUserid(1);
		List<ModifyHistory> list
		= service.listAllByUserId(user.getUserid());
		
		Assert.assertTrue(list.size()>0);
		
		
	}*/
	
	/*//根据商品查询历史记录
	@Test
	public void listByGoodsId(){
		Goods goods=new Goods();
		goods.setGoodId(1);
		List<ModifyHistory> list 
		= service.listAllByGoodsId(goods.getGoodId());
		Assert.assertTrue(list.size()>0);
	}*/
	//查询全部历史记录
	@Test
	public void listAll(){
		List<ModifyHistory> listAll = service.listAll();
		Assert.assertTrue(listAll.size()>0);
	}
	
	
	
}
