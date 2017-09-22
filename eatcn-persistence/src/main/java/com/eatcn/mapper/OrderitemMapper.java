package com.eatcn.mapper;

import java.util.List;

import com.eatcn.domain.Order;
import com.eatcn.domain.Orderitem;

/**
 * 订单项查询、添加接口
 * 
 * @desc: eatcn-persistence
 * @author: 徐可
 * @createTime: 2017年9月12日 上午10:44:56
 * @history:
 * @version: v1.0
 */
public interface OrderitemMapper {

	// 按照订单查询包含的购买项目
	List<Orderitem> listOrderitemsByOrder(Order order);

	// 按照订单项id查询订单项详情
	Orderitem getOrderitem(int id);

	// 添加一条订单项记录
	int saveOrderitem(Orderitem orderitem);
}
