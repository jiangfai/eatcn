/**
 * 
 */
package com.eatcn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eatcn.domain.Receiver;
import com.eatcn.mapper.ReceiverMapper;
import com.eatcn.service.ReceiverService;


@Service
@Transactional
public class ReceiverServiceImpl implements ReceiverService{
	
	 @Autowired
	 private ReceiverMapper  mapper;
	
 	public boolean save(Receiver receiver) {
		   
		return mapper.insert(receiver)>0?true:false;
	}

	public int deleteReceiver(Integer receiverId) {
		
		return mapper.delete(receiverId);
	}

	public int update(Receiver receiver) {
		
		return mapper.update(receiver);
	}

	public List<Receiver> listReceiverByUserId(Integer userId) {
		  List<Receiver> allByUserId = mapper.listAllByUserId(userId);
		return allByUserId.size()>0?allByUserId:null;
				
				
	}

	public List<Receiver> listAllReceiver() {
		 List<Receiver> list = mapper.listAll();
		return list.size()>0?list:null;
	}

}
