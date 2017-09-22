package com.eatcn.mapper;

import java.util.List;
import java.util.Map;

import com.eatcn.domain.GoodsRecords;

/**
 * 货物记录情况
 * 
 * @author jssj
 *
 */
public interface GoodsRecordsMapper {

	// 获取所有的货物
	public List<GoodsRecords> listRecords();

	// 查看某一条记录的详情
	public GoodsRecords getRecord(Integer id);

	// 保存一条记录
	public Integer saveRecords(GoodsRecords goodsRecords);

	// 获得某一个店面的所有记录
	public List<GoodsRecords> getRecordByStore(Integer id);

	// 更新records的信息
	public int updateReords(Map<String, Object> map);

	// 单独更新records的状态信息
	public int updateReordsStatus(Map<String, Integer> map);

}
