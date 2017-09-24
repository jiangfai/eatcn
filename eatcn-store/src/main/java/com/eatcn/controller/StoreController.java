package com.eatcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.eatcn.domain.Store;
import com.eatcn.service.StoreService;
import com.eatcn.utils.PageBean;

@Controller
public class StoreController {

	@Autowired
	private StoreService storeService;
	
	@RequestMapping(value="/listStores/{distId}/{currentPage}")
	public ModelAndView listStores(@PathVariable Integer distId,@PathVariable Integer currentPage){
		ModelAndView mv = new ModelAndView();
		int pageSize=10;
		if(currentPage != null){
			currentPage=currentPage.intValue();
		} else {
			currentPage = 1;
		}
		PageBean<Store> pageBean = storeService.listStoresByDistrict(distId, currentPage, pageSize);
		mv.addObject("distId", distId);
		mv.addObject("pageBean", pageBean);
		mv.setViewName("");
		return mv;
	}
	
	@GetMapping(value="/getStore/{storeId}")
	@ResponseBody
	public Store getStore(@PathVariable Integer storeId){
		return storeService.getStore(storeId);
	}
	
	@GetMapping(value="/getStoreByUser/{userId}")
	@ResponseBody
	public Store getStoreByUser(@PathVariable Integer userId){
		return storeService.getStoreByUser(userId);
	}
}

	