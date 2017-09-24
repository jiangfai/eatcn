package com.eatcn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eatcn.domain.District;
import com.eatcn.service.DistrictService;

@Controller
public class DistrictController {

	@Autowired
	private DistrictService districtService;
	
	@GetMapping(value="/district")
	@ResponseBody
	public List<District> getDistricts(){
		return districtService.listDistricts();
	}  
}

	