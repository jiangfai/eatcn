package com.eatcn.domain;

import java.sql.Date;

/**
 * 货物
 * 
 * @author jssj
 *
 */
public class Goods {

	private Integer goodId;
	private GoodsCategory goodsCategory;
	private String goodsName;
	private double price;
	private String imgUrl;
	private String info;
	private Date modifyTime;
	private double saleNumber;
	private Integer goodFlag;
	private Integer tag;// 0�Ǽ�,1�ǽ�
	private double totalStock;

	public Integer getGoodId() {
		return goodId;
	}

	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
	}

	public Goods() {

	}

	public GoodsCategory getGoodsCategory() {
		return goodsCategory;
	}

	public void setGoodsCategory(GoodsCategory goodsCategory) {
		this.goodsCategory = goodsCategory;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public double getSaleNumber() {
		return saleNumber;
	}

	public void setSaleNumber(double saleNumber) {
		this.saleNumber = saleNumber;
	}

	public Integer getGoodFlag() {
		return goodFlag;
	}

	public void setGoodFlag(Integer goodFlag) {
		this.goodFlag = goodFlag;
	}

	public Integer getTag() {
		return tag;
	}

	public void setTag(Integer tag) {
		this.tag = tag;
	}

	public double getTotalStock() {
		return totalStock;
	}

	public void setTotalStock(double totalStock) {
		this.totalStock = totalStock;
	}

}
