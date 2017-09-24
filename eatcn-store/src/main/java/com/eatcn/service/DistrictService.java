package com.eatcn.service;

import java.util.List;

import com.eatcn.domain.District;

/**
 * 地区服务层接口
 * 
* @desc: eatcn-store
* @author: 徐可
* @createTime: 2017年9月14日 下午6:42:45
* @history:
* @version: v1.0
 */
public interface DistrictService {

	//查询所有地区
	List<District> listDistricts();
}

	