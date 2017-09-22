package com.eatcn.mapper;

import java.util.List;

import com.eatcn.domain.GoodsCategory;

/**
 * 
 * ��ǰ���� : �������ӳ��
 * 
 * @author 1703�����
 * @Date 2017��9��12������9:34:14
 * @version 1.0
 */
public interface GoodsCategoryMapper {
	// ��ѯ���з���
	List<GoodsCategory> listGoodsCategory();

	// ��ѯ��������
	GoodsCategory getGoodsCategory(int id);

	// ��ӷ���
	void saveGoodsCategory(GoodsCategory s);

	// ɾ������
	void removeGoodsCategory(int id);

	// ���·���
	void updateGoodsCategory(GoodsCategory s);
}
