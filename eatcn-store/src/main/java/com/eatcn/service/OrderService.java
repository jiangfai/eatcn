package com.eatcn.service;


import java.util.List;

import com.eatcn.domain.Order;
import com.eatcn.domain.Orderitem;
import com.eatcn.utils.PageBean;

/**
 * 订单服务层接口
 * 
* @desc: eatcn-store
* @author: 徐可
* @createTime: 2017年9月14日 下午6:43:42
* @history:
* @version: v1.0
 */
public interface OrderService {

	//按用户分页查找订单
	PageBean<Order> listOrdersByUser(int userId, int currentPage, int pageSize);

	//按商店分页查找订单
	PageBean<Order> listOrdersByStore(int storeId, int currentPage, int pageSize);
	
	//按订单id查询订单
	Order getOrder(int orderId);

	//添加一个订单
	boolean saveOrder(Order order);

	//更新订单状态
	boolean updateOrderStatus(int orderId, int status);
	
	//按订单查询所包含的订单项
	List<Orderitem> listOrderitemsByOrder(int orderId);
	
}
