package com.internousdev.ecsite.dto;

public class BuyItemConfirmDTO {
	private String itemId;
	private String itemTotalPrice;
	private String totalCount;
	private String userId;
	private String payment;

	public String getItemId(){
		return itemId;
	}
	public void setItemId(String itemId){
		this.itemId=itemId;
	}
	public String getItemTotalPrice(){
		return itemTotalPrice;
	}
	public void setItemTotalPrice(String itemTotalPrice){
		this.itemTotalPrice=itemTotalPrice;
	}
	public String getTotalCount(){
		return totalCount;
	}
	public void setTotalCount(String totalCount){
		this.totalCount=totalCount;
	}
	public String getUserId(){
		return userId;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getPayment(){
		return payment;
	}
	public void setPayment(String payment){
		this.payment=payment;
	}
}
