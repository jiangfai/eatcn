package com.eatcn.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eatcn.domain.District;
import com.eatcn.domain.Store;
import com.eatcn.mapper.StoreMapper;
import com.eatcn.service.StoreService;
import com.eatcn.utils.PageBean;

@Service
@Transactional
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreMapper storeMapper;
	
	@Override
	public PageBean<Store> listStoresByDistrict(int distId, int currentPage, int pageSize) {
		PageBean<Store> pb=new PageBean<>();
		pb.setCurrentPage(currentPage);
		pb.setPageSize(pageSize);
		District district = new District();
		district.setId(distId);
		int totalCount = storeMapper.getStoreNumByDistrict(district);
		pb.setTotalCount(totalCount);
		int totalPageSize=totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
		pb.setTotalPageSize(totalPageSize);
		int start = (currentPage-1)*pageSize;
		Map<String,Object> map = new HashMap<>();
		map.put("district",district);
		map.put("start", start);
		map.put("size", pageSize);
		List<Store> listStores = storeMapper.listStoresByDistrict(map);
		pb.setList(listStores);
		return pb;
			
	}

	@Override
	public Store getStore(int storeId) {
		return storeMapper.getStore(storeId);
			
	}

	@Override
	public Store getStoreByUser(int userId) {
		return storeMapper.getStoreByUser(userId);
			
	}

	
}

	