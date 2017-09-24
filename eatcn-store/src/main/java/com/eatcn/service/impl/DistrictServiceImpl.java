package com.eatcn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eatcn.domain.District;
import com.eatcn.mapper.DistrictMapper;
import com.eatcn.service.DistrictService;

@Service
@Transactional
public class DistrictServiceImpl implements DistrictService {

	@Autowired
	private DistrictMapper districtMapper;
	
	@Override
	public List<District> listDistricts() {
		return districtMapper.listDistricts();
			
	}

	
}

	