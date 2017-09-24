package com.eatcn.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eatcn.domain.District;

/**
 * 地区查询服务层测试
 * 
* @desc: eatcn-store
* @author: 徐可
* @createTime: 2017年9月12日 下午2:20:41
* @history:
* @version: v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring-config/spring-app.xml" })
public class DistrictServiceTest {

	@Autowired
	private DistrictService districtService;
	
	/**
	 * 查询所有地区测试
	 * 
	* @author: 徐可
	* @createTime: 2017年9月12日 下午2:21:17
	* @history: void
	 */
	@Test
	public void testListDistricts(){
		List<District> listDistricts = districtService.listDistricts();
		Assert.assertNotNull(listDistricts.size());
		for (District district : listDistricts) {
			System.out.println(district.getName());
		}
		
	}
	
}

	