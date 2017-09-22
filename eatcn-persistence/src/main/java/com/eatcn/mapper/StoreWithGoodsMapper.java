package com.eatcn.mapper;

import java.util.List;
import java.util.Map;

import com.eatcn.domain.StoreWithGoods;

/**
 * StoreWithGoodsMapper tb_store_goods
 * 
 * @author jssj
 *
 */
public interface StoreWithGoodsMapper {


	public List<StoreWithGoods> listStoreWithGoods();


	public List<StoreWithGoods> getStoreWithGoodsByStoreAndPage(Map<String, Object> map);


	public List<StoreWithGoods> getStoreWithGoodsByGoods(Integer id);


	public StoreWithGoods getStoreWithGoodsByGoodsAndStore(Map<String, Object> map);;


	public Integer saveStoreWithGoods(StoreWithGoods storeWithGoods);


	/**
	 * HashMap<String, Object> map鎻愪緵涓変釜鍙傛暟 <"storeId",?> <"goodId",?> <"storeStock",?>
	 * 
	 * @param map
	 * @return
	 */
	public int updateStoreWithGoodsStoreStock(Map<String, Object> map);

	// 鏇存柊璐х墿鐨勫湪鍞姸鎬�
	public int updateStoreWithGoodsIsOnsale(Map<String, Integer> map);
}
