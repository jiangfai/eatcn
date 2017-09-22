/**
 * 
 */
package com.eatcn.mapper;

import java.util.List;
import java.util.Map;

import com.eatcn.domain.ModifyHistory;

/*
 * 修改历史记录接口
 */
public interface ModifyHistoryMapper {

	// 添加历史记录
	int insert(ModifyHistory history);

	// 根据用户id查询
	List<ModifyHistory> listAllByUserId(Integer userId);

	// 根据商品查询
	List<ModifyHistory> listAllByGoodsId(Integer goodsId);

	// 查询历史记录
	List<ModifyHistory> listAll();

	// 动态查询历史记录
	List<ModifyHistory> listAllHistory(Map<String, Object> map);

	// 分页查询历史记录

	List<ModifyHistory> listByPage(Map<String, Object> map);

	int listCount(Map<String, Object> map);
}
