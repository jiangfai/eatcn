package com.eatcn.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eatcn.domain.Store;
import com.eatcn.utils.PageBean;

/**
 * 商店服务层测试
 * 
* @desc: eatcn-store
* @author: 徐可
* @createTime: 2017年9月12日 下午2:18:20
* @history:
* @version: v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring-config/spring-app.xml" })
public class StoreServiceTest {

	@Autowired
	private StoreService storeService;
	
	/**
	 * 按地区分页查询商店测试
	 * 
	* @author: 徐可
	* @createTime: 2017年9月12日 下午2:18:41
	* @history: void
	 */
	@Test
	public void testListStoresByDistrict(){
		int distId = 1;
		int currentPage = 1;
		int pageSize = 2;
		PageBean<Store> pb = storeService.listStoresByDistrict(distId, currentPage, pageSize);
		Assert.assertEquals(3,pb.getTotalCount());
		Assert.assertEquals(2,pb.getTotalPageSize());
		List<Store> listStores = pb.getList();
		for (Store store : listStores) {
			System.out.println(store.getName());
		}
	}
	
	/**
	 * 按照商店id查看商店详情测试
	 * 
	* @author: 徐可
	* @createTime: 2017年9月12日 下午2:19:51
	* @history: void
	 */
	@Test
	public void testGetStore(){
		Store store = storeService.getStore(2);
		Assert.assertEquals("水野分店", store.getName());
		Assert.assertEquals("水野朝阳",store.getUser().getUsername());
	}
	
}

	