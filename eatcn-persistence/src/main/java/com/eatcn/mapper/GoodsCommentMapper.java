package com.eatcn.mapper;

import java.util.List;
import java.util.Map;

import com.eatcn.domain.GoodsComment;

/**
 * 
 * 锟斤拷前锟斤拷锟斤拷 : 锟斤拷锟斤拷锟斤拷锟斤拷
 * 
 * @author 1703锟斤拷锟斤拷锟�
 * @Date 2017锟斤拷9锟斤拷12锟斤拷锟斤拷锟斤拷9:35:12
 * @version 1.0
 */
public interface GoodsCommentMapper {
	// 锟斤拷询锟斤拷锟斤拷锟斤拷锟斤拷
	List<GoodsComment> listGoodsComment();
	
	int countGoodsComment();
	
	List<GoodsComment> listGoodsCommentByPage(Map<String, Object> map);

	// 锟斤拷询锟斤拷锟斤拷
	GoodsComment getGoodsComment(int id);

	// 锟斤拷锟斤拷锟斤拷锟�
	void saveGoodsComment(GoodsComment s);

	// 删锟斤拷锟斤拷锟斤拷
	void removeGoodsComment(int id);

	// 锟斤拷锟斤拷锟斤拷锟斤拷
	void updateGoodsComment(GoodsComment s);

	// 通锟斤拷锟斤拷锟斤拷id锟斤拷锟斤拷页锟斤拷询锟斤拷锟斤拷
	List<GoodsComment> listGoodsCommentByPageBeanAndGooodsId(Map<String, Object> map);

	// 通锟斤拷锟矫伙拷id,锟斤拷锟斤拷页锟斤拷询锟斤拷锟叫碉拷锟矫伙拷锟斤拷锟斤拷
	List<GoodsComment> listGoodsCommentByPageBeanAndUserId(Map<String, Object> map);
}
