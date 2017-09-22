package com.eatcn.mapper;

import java.util.List;
import java.util.Map;

import com.eatcn.domain.District;
import com.eatcn.domain.Store;

/**
 * 商店查询接口
 * 
 * @desc: eatcn-persistence
 * @author: 徐可
 * @createTime: 2017年9月12日 上午9:11:38
 * @history:
 * @version: v1.0
 */
public interface StoreMapper {

	// 按地区查询所有商店
	List<Store> listStoresByDistrict(Map<String, Object> map);

	// 查询一个地区内所有商店数量
	int getStoreNumByDistrict(District district);

	// 按照商店id查看商店详情
	Store getStore(int id);

}
