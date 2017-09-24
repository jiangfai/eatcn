/**
 * 
 */
package com.eatcn.service;

import java.util.List;

import com.eatcn.domain.Receiver;

/**
 * 
* @desc: eatcn-user
* @descripe:收货人类接口
* @author: Pingpo_Wang
* @createTime: 2017年9月12日 上午9:28:43
* @history:
* @version: v1.0
 */
public interface ReceiverService {
	 //添加收货人
	boolean save(Receiver receiver);
	 //删除收货人
	int deleteReceiver(Integer receiverId);
	 //跟新收货人信息
	int update(Receiver receiver);
	//根据用户查询收货人
	List<Receiver> listReceiverByUserId(Integer userId);
	//查询全部收货人
	List<Receiver> listAllReceiver();
	
	
	
	
}
