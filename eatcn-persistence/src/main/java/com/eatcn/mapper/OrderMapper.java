package com.eatcn.mapper;

import java.util.List;
import java.util.Map;

import com.eatcn.domain.Order;
import com.eatcn.domain.Store;
import com.eatcn.domain.User;

/**
 * 订单操作接口
 * 
 * @desc: eatcn-persistence
 * @author: 徐可
 * @createTime: 2017年9月12日 上午10:41:45
 * @history:
 * @version: v1.0
 */
public interface OrderMapper {

	// 按照用户查询所有订单
	List<Order> listOrdersByUser(Map<String, Object> map);

	// 按照商店查询所有订单
	List<Order> listOrdersByStore(Map<String, Object> map);

	// 按照订单id查询单个订单详情
	Order getOrder(int id);

	// 添加一个订单
	int saveOrder(Order order);

	// 按照用户查询所有订单数量
	int getOrderNumByUser(User user);

	// 按照订单查询所有订单数量
	int getOrderNumByStore(Store store);

	// 更改订单状态
	boolean updateOrderStatus(Map<String, Object> map);

}
