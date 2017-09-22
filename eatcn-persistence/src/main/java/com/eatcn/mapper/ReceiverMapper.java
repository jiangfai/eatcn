
package com.eatcn.mapper;

import java.util.List;

import com.eatcn.domain.Receiver;

/*
 * 收货人接口
 */
public interface ReceiverMapper {

	// 添加收货人信息
	int insert(Receiver receiver);

	// 删除收货人信息
	int delete(Integer receiverId);

	// 修改收货人信息
	int update(Receiver receiver);

	// 根据用户主键查询收货人信息
	List<Receiver> listAllByUserId(Integer userId);

	// 查询全部收获人信息
	List<Receiver> listAll();

}
