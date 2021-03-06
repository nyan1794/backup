package com.internousdev.ecsite.dto;

public class BuyItemDTO {

	public int id;

	public String itemName;

	public int itemPrice;

	private int itemStock;

	private int count;

	private String pay;

	private int itemTotalPrice;

	private int totalPrice;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public int getItemTotalPrice(){
		return itemTotalPrice;
	}
	public void setItemTotalPrice(int itemTotalPrice){
		this.itemTotalPrice=itemTotalPrice;
	}
	public int getTotalPrice(){
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice){
		this.totalPrice=totalPrice;
	}

	public int getItemStock() {
		return itemStock;
	}

	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}
}
