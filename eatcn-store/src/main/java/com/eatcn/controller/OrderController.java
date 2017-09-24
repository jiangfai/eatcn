package com.eatcn.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.eatcn.domain.Cart;
import com.eatcn.domain.CartItem;
import com.eatcn.domain.Order;
import com.eatcn.domain.Orderitem;
import com.eatcn.service.OrderService;
import com.eatcn.utils.PageBean;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping(value="/saveOrder")
	@ResponseBody
	public boolean saveOrder(Order order,HttpServletRequest request){
		//添加订单信息
		order.setOrderTime(new Date());
		order.setStatus(0);
		HttpSession session = request.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		order.setTotal(cart.getTotal());
		
		//添加订单项信息
		Map<String,CartItem> cartItems = cart.getCartItems();
		Set<Entry<String, CartItem>> entrySet = cartItems.entrySet();
		for (Entry<String, CartItem> entry : entrySet) {
			CartItem cartItem = entry.getValue();
			Orderitem orderitem = new Orderitem();
			orderitem.setCount(cartItem.getCount());
			orderitem.setSubtotal(cartItem.getSubTotal());
			orderitem.setGoods(cartItem.getGoods());
			order.getOrderitems().add(orderitem);
		}
		
		boolean flag = orderService.saveOrder(order);
		return flag;
	}
	
	@RequestMapping(value="/listOrdersByUser/{userId}/{currentPage}")
	public ModelAndView listOrdersByUser(@PathVariable Integer userId, @PathVariable Integer currentPage){
		ModelAndView mv = new ModelAndView();
		int pageSize=10;
		if(currentPage != null){
			currentPage=currentPage.intValue();
		} else {
			currentPage = 1;
		}
		PageBean<Order> pageBean = orderService.listOrdersByUser(userId, currentPage, pageSize);
		mv.addObject("userId", userId);
		mv.addObject("pageBean", pageBean);
		mv.setViewName("");
		return mv;
	}
	
	@RequestMapping(value="/listOrdersByStore/{storeId}/{currentPage}")
	public ModelAndView listOrdersByStore(@PathVariable Integer storeId, @PathVariable Integer currentPage){
		ModelAndView mv = new ModelAndView();
		int pageSize=10;
		if(currentPage != null){
			currentPage=currentPage.intValue();
		} else {
			currentPage = 1;
		}
		PageBean<Order> pageBean = orderService.listOrdersByStore(storeId, currentPage, pageSize);
		mv.addObject("storeId", storeId);
		mv.addObject("pageBean", pageBean);
		mv.setViewName("");
		return mv;
	}
	
	@PutMapping(value="/order/{orderId}/{status}")
	@ResponseBody
	public boolean updateOrder(@PathVariable Integer orderId, @PathVariable Integer status){
		boolean flag = orderService.updateOrderStatus(orderId, status);
		return flag;
	}
	
	@RequestMapping(value="/listOrderitems/{orderId}")
	public ModelAndView listOrderitems(@PathVariable Integer orderId){
		ModelAndView mv = new ModelAndView();
		List<Orderitem> listOrderitems = orderService.listOrderitemsByOrder(orderId);
		mv.addObject("listOrderitems",listOrderitems);
		mv.setViewName("");
		return mv;
	}
	
	
}

	