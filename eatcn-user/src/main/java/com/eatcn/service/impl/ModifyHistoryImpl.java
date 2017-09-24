package com.eatcn.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eatcn.domain.ModifyHistory;
import com.eatcn.mapper.ModifyHistoryMapper;
import com.eatcn.service.ModifyHistoryService;
import com.eatcn.utils.PageBean;

@Service
@Transactional
public class ModifyHistoryImpl implements ModifyHistoryService {

	@Autowired
	private ModifyHistoryMapper mapper;

	@Override
	public int save(ModifyHistory history) {

		return mapper.insert(history);
	}

	/*@Override
	public PageBean<ModifyHistory> listAllByGoodsId(Integer start,
			Integer size,Integer goodsId){
			PageBean<ModifyHistory> page=new PageBean<ModifyHistory>();
	  page.setCurrentPage(start);
	  page.setPageSize(size);
	  int totalCount=mapper.listCount(goodsId);
	  int totalPage=(totalCount+size-1)/size;
	  page.setTotalPageSize(totalPage);
	  page.setTotalCount(totalCount);
	  Map<String,Object> map=new HashMap<String,Object>();
	  int begin=(start-1)*size;
	  map.put("goodsId", goodsId);
	  map.put("start", begin);
	  map.put("size", size);
	 List<ModifyHistory> list = mapper.listByPage(map);
	  page.setList(list);
	return page;
                
		
	}*/

	@Override
	public List<ModifyHistory> listAll() {
		List<ModifyHistory> listAll = mapper.listAll();
		return listAll.size() > 0 ? listAll : null;
	}

	@Override
	public List<ModifyHistory> listAllHistory(Map<String, Object> map) {
		List<ModifyHistory> history = mapper.listAllHistory(map);
		return history.size() > 0 ? history : null;
	}

	/*@Override
	public PageBean<ModifyHistory> listAllByUserId(Integer start, Integer size, Integer userId) {
		PageBean<ModifyHistory> page = new PageBean<ModifyHistory>();
		page.setCurrentPage(start);
		page.setPageSize(size);
		int totalCount = mapper.listCount(userId);
		int totalPage = (totalCount + size - 1) / size;
		page.setTotalPageSize(totalPage);
		page.setTotalCount(totalCount);
		Map<String, Object> map = new HashMap<String, Object>();
		int begin = (start - 1) * size;
		map.put("userId", userId);
		map.put("start", begin);
		map.put("size", size);
		List<ModifyHistory> list = mapper.listByPage(map);
		page.setList(list);
		return page;
	}*/

	@Override
	public PageBean<ModifyHistory> listAllByGoodsId(Integer start, Integer size, Integer goodsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageBean<ModifyHistory> listAllByUserId(Integer start, Integer size, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
