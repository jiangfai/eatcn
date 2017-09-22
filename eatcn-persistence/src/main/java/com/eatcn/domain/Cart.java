package com.eatcn.domain;

import java.util.HashMap;
import java.util.Map;

import com.eatcn.domain.CartItem;

public class Cart {

	private Double total;

	// 多个购物项：map的key是 goodId, map的value是CartItem购物项
	private Map<String, CartItem> cartItems = new HashMap<>();

	public Double getTotal() {

		return total;
	}

	public void setTotal(Double total) {

		this.total = total;
	}

	public Map<String, CartItem> getCartItems() {

		return cartItems;
	}

	public void setCartItems(Map<String, CartItem> cartItems) {

		this.cartItems = cartItems;
	}

}
