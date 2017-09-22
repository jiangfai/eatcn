package com.eatcn.mapper;

import java.util.List;
import java.util.Map;

import com.eatcn.domain.ReturnedGoods;
import com.eatcn.dto.ReturnedDTO;

/**
 * 退货管理
 * 
 * @author jssj
 *
 */
public interface ReturnedGoodsMapper {

	// 查看所有的退货情况
	public List<ReturnedDTO> listReturnedGoods();

	// 查看某一退货详情
	public ReturnedGoods getReturnedGoods(Integer id);

	// 保存一条退货记录
	public Integer saveReturnedGoods(ReturnedGoods returnedGoods);

	// 更新状态
	public int updateReturnedGoodsStatus(Map<String, Integer> map);

	// 更新用户反馈
	public int updateReturnedGoodsUserFeedback(Map<String, Object> map);
}
