package com.eatcn.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eatcn.domain.Goods;
import com.eatcn.domain.Order;
import com.eatcn.domain.Orderitem;
import com.eatcn.domain.Receiver;
import com.eatcn.domain.Store;
import com.eatcn.domain.User;
import com.eatcn.utils.PageBean;

/**
 * 订单服务层测试
 * 
* @desc: eatcn-store
* @author: 徐可
* @createTime: 2017年9月13日 下午4:54:32
* @history:
* @version: v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring-config/spring-app.xml" })
public class OrderServiceTest {

	@Autowired
	private OrderService orderService;
	
	/**
	 * 按用户查询订单测试
	 * 
	* @author: 徐可
	* @createTime: 2017年9月13日 下午5:17:38
	* @history: void
	 */
	@Test
	public void testListOrdersByUser(){
		int userId = 1;
		int currentPage = 1;
		int pageSize = 2;
		PageBean<Order> pb = orderService.listOrdersByUser(userId, currentPage, pageSize);
		Assert.assertEquals(6,pb.getTotalCount());
		Assert.assertEquals(3,pb.getTotalPageSize());
		List<Order> listOrders = pb.getList();
		for (Order order : listOrders) {
			System.out.println(order.getTotal());
		}
	}
	
	/**
	 * 按商店查询订单测试
	 * 
	* @author: 徐可
	* @createTime: 2017年9月13日 下午5:18:03
	* @history: void
	 */
	@Test
	public void testListOrdersByStore(){
		int storeId = 1;
		int currentPage = 2;
		int pageSize = 2;
		PageBean<Order> pb = orderService.listOrdersByStore(storeId, currentPage, pageSize);
		Assert.assertEquals(4,pb.getTotalCount());
		Assert.assertEquals(2,pb.getTotalPageSize());
		List<Order> listOrders = pb.getList();
		for (Order order : listOrders) {
			System.out.println(order.getOrderTime());
		}
	}
	
	/**
	 * 添加一个订单测试
	 * 
	* @author: 徐可
	* @createTime: 2017年9月13日 下午5:18:14
	* @history: void
	 */
	@Test
	public void testSaveOrder(){
		Order order = new Order();
		order.setOrderTime(new Date());
		Receiver receiver = new Receiver();
		receiver.setReceiverId(1);
		order.setReceiver(receiver);
		order.setStatus(0);
		order.setTotal(1111.0);
		User user = new User();
		user.setUserid(1);
		order.setUser(user);
		Store store = new Store();
		store.setId(1);
		order.setStore(store);
		
		Orderitem orderitem = new Orderitem();
		Goods goods = new Goods();
		goods.setGoodId(1);
		orderitem.setGoods(goods);
		orderitem.setCount(10d);
		orderitem.setSubtotal(100d);
		
		Orderitem orderitem2 = new Orderitem();
		Goods goods2 = new Goods();
		goods2.setGoodId(2);
		orderitem2.setGoods(goods2);
		orderitem2.setCount(10d);
		orderitem2.setSubtotal(200d);
		
		Orderitem orderitem3 = new Orderitem();
		Goods goods3 = new Goods();
		goods3.setGoodId(3);
		orderitem3.setGoods(goods3);
		orderitem3.setCount(10d);
		orderitem3.setSubtotal(300d);
		
		List<Orderitem> orderitems = new ArrayList<>();
		orderitems.add(orderitem);
		orderitems.add(orderitem2);
		orderitems.add(orderitem3);
		
		order.setOrderitems(orderitems);
		
		boolean flag = orderService.saveOrder(order);
		Assert.assertTrue(flag);
	}
	
	/**
	 * 更新订单状态测试
	 * 
	* @author: 徐可
	* @createTime: 2017年9月13日 下午5:18:39
	* @history: void
	 */
	@Test
	public void testUpdateOrderStatus(){
		boolean flag = orderService.updateOrderStatus(1, 3);
		Assert.assertTrue(flag);
	}
	
	/**
	 * 按订单查询订单项测试
	 * 
	* @author: 徐可
	* @createTime: 2017年9月13日 下午5:18:55
	* @history: void
	 */
	@Test
	public void testListOrderitemsByOrder(){
		List<Orderitem> listOrderitems = orderService.listOrderitemsByOrder(1);
		Assert.assertNotNull(listOrderitems.size());
		for (Orderitem orderitem : listOrderitems) {
			System.out.println(orderitem.getSubtotal());
		}
		
	}
	
}

	