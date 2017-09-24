package com.eatcn.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eatcn.domain.Goods;
import com.eatcn.domain.Order;
import com.eatcn.domain.Orderitem;
import com.eatcn.domain.Store;
import com.eatcn.domain.StoreWithGoods;
import com.eatcn.domain.User;
import com.eatcn.mapper.GoodsMapper;
import com.eatcn.mapper.OrderMapper;
import com.eatcn.mapper.OrderitemMapper;
import com.eatcn.mapper.StoreWithGoodsMapper;
import com.eatcn.service.OrderService;
import com.eatcn.utils.PageBean;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private OrderitemMapper orderitemMapper;
	@Autowired
	private StoreWithGoodsMapper storeWithGoodsMapper;
	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public PageBean<Order> listOrdersByUser(int userId, int currentPage, int pageSize) {
		PageBean<Order> pb=new PageBean<>();
		pb.setCurrentPage(currentPage);
		pb.setPageSize(pageSize);
		User user = new User();
		user.setUserid(userId);
		int totalCount = orderMapper.getOrderNumByUser(user);
		pb.setTotalCount(totalCount);
		int totalPageSize=totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
		pb.setTotalPageSize(totalPageSize);
		int start = (currentPage-1)*pageSize;
		Map<String,Object> map = new HashMap<>();
		map.put("user",user);
		map.put("start", start);
		map.put("size", pageSize);
		List<Order> listOrders = orderMapper.listOrdersByUser(map);
		pb.setList(listOrders);
		return pb;
			
	}

	@Override
	public PageBean<Order> listOrdersByStore(int storeId, int currentPage, int pageSize) {
		PageBean<Order> pb=new PageBean<>();
		pb.setCurrentPage(currentPage);
		pb.setPageSize(pageSize);
		Store store = new Store();
		store.setId(storeId);
		int totalCount = orderMapper.getOrderNumByStore(store);
		pb.setTotalCount(totalCount);
		int totalPageSize=totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
		pb.setTotalPageSize(totalPageSize);
		int start = (currentPage-1)*pageSize;
		Map<String,Object> map = new HashMap<>();
		map.put("store",store);
		map.put("start", start);
		map.put("size", pageSize);
		List<Order> listOrders = orderMapper.listOrdersByStore(map);
		pb.setList(listOrders);
		return pb;
			
	}

	@Override
	public Order getOrder(int orderId) {
		return orderMapper.getOrder(orderId);
			
	}

	@Override
	public boolean saveOrder(Order order) {
		Map<String,Object> map = new HashMap<>();
		map.put("storeId", order.getStore().getId());
		Goods goods = new Goods();
		int result = orderMapper.saveOrder(order);
		int orderId = order.getOrderId();
		if(result != 0){
			List<Orderitem> orderitems = order.getOrderitems();
			order = orderMapper.getOrder(orderId);
			for (Orderitem orderitem : orderitems) {
				orderitem.setOrder(order);
				orderitemMapper.saveOrderitem(orderitem);
				int goodId = orderitem.getGoods().getGoodId();
				map.put("goodId",goodId);
				StoreWithGoods storeWithGoods = storeWithGoodsMapper.getStoreWithGoodsByGoodsAndStore(map);
				double count = orderitem.getCount();
				double storeStock = storeWithGoods.getStoreStock();
				storeStock = storeStock - count;
				map.put("storeStock", storeStock);
				storeWithGoodsMapper.updateStoreWithGoodsStoreStock(map);
				
				goods = goodsMapper.getGoods(goodId);
				goods.setSaleNumber(goods.getSaleNumber()+count);
				goods.setTotalStock(goods.getTotalStock()-count);
				goodsMapper.updateGoods(goods);
			}
			
			return true;
		}
		return false;
			
	}

	@Override
	public boolean updateOrderStatus(int orderId, int status) {
		Map<String,Object> map = new HashMap<>();
		map.put("id", orderId);
		map.put("status", status);
		return orderMapper.updateOrderStatus(map);
			
	}

	@Override
	public List<Orderitem> listOrderitemsByOrder(int orderId) {
		Order order = new Order();
		order.setOrderId(orderId);
		return orderitemMapper.listOrderitemsByOrder(order);
			
	}

	
}

	