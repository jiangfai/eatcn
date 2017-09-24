/**
 * 
 */
package com.eatcn.service;

import java.util.List;
import java.util.Map;

import com.eatcn.domain.ModifyHistory;
import com.eatcn.utils.PageBean;

/**
 * 
* @desc: eatcn-user
* @descripe:历史记录修改类接口
* @author: Pingpo_Wang
* @createTime: 2017年9月12日 上午9:26:36
* @history:
* @version: v1.0
 */

public interface ModifyHistoryService {
       

	  //添加历史记录
	  int save(ModifyHistory history);
	  //根据用户查询历史记录
	  PageBean<ModifyHistory> listAllByUserId(Integer start, Integer size,Integer userId);
	  //根据商品查询历史记录
	  PageBean<ModifyHistory> listAllByGoodsId(Integer start,Integer size,Integer goodsId);
	  //查询全部历史记录
	  List<ModifyHistory> listAll();
	  //动态查询历史记录
	  List<ModifyHistory> listAllHistory(Map<String,Object> map);
	 
	 
} 
