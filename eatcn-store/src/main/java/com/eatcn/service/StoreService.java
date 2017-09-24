package com.eatcn.service;


import com.eatcn.domain.Store;
import com.eatcn.utils.PageBean;

/**
 * 商店服务层接口
 * 
* @desc: eatcn-store
* @author: 徐可
* @createTime: 2017年9月14日 下午6:46:34
* @history:
* @version: v1.0
 */
public interface StoreService {

	//按地区分页查找商店
	PageBean<Store> listStoresByDistrict(int distId, int currentPage, int pageSize);
	
	//按商店id查找商店
	Store getStore(int storeId);
	
	// 按照用户id查看商店详情
	Store getStoreByUser(int userId);
}

	