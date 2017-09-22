package com.eatcn.mapper;

import java.util.List;

import com.eatcn.domain.District;

/**
 * 地区查询接口
 * 
 * @desc: eatcn-persistence
 * @author: 徐可
 * @createTime: 2017年9月12日 上午10:39:49
 * @history:
 * @version: v1.0
 */
public interface DistrictMapper {

	// 查找所有地区
	List<District> listDistricts();
}
