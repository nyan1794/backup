package com.internousdev.ecsite.dto;

public class OrderPriceDTO {
	private String shopName;
	private String orderShopTotalPrice;


	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getOrderShopTotalPrice() {
		return orderShopTotalPrice;
	}
	public void setOrderShopTotalPrice(String orderShopTotalPrice) {
		this.orderShopTotalPrice = orderShopTotalPrice;
	}
}
