package com.eatcn.mapper;

import java.util.List;
import java.util.Map;

import com.eatcn.domain.Goods;

/**
 * 
 * ��ǰ���� : �����ӳ��
 * 
 * @author 1703�����
 * @Date 2017��9��12������9:37:42
 * @version 1.0
 */
public interface GoodsMapper {
	// ��ѯ���л���
	List<Goods> listGoods();

	// ��ѯ��������
	Goods getGoods(int id);

	// ��ӻ���
	void saveGoods(Goods s);

	// ɾ������
	void removeGoods(int id);

	// ���»���
	void updateGoods(Goods s);

	// ���»��ﶩ�������Ϳ��
	void updateGoodsByNumberAndStock(Goods s);

	// ͨ������ķ�������ҳ��ѯ����
	List<Goods> listGoodsByPage(Map<String, Object> map);
}
