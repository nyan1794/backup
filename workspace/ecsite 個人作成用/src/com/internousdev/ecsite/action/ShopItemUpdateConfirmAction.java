package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ShopItemUpdateConfirmAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	private String newItemName;
	private String newItemPrice;
	private String addItemStock;

	private String oldItemName;
	private String oldItemPrice;
	private String oldItemStock;

	private String errorMassage=null;
	public String execute(){
		String result =ERROR;

		if((newItemPrice.matches("^[0-9]{1,10}")) && (addItemStock.matches("^[0-9]{1,10}"))){

			int oldStock=Integer.parseInt(oldItemStock);
			int addStock=Integer.parseInt(addItemStock);
			int AfterAddStock=oldStock + addStock;
			String newStock=String.valueOf(AfterAddStock);
			session.put("newItemName",newItemName);
			session.put("newItemPrice",newItemPrice);
			session.put("addItemStock",addItemStock);
			session.put("newStock", newStock);

			session.put("oldItemName", oldItemName);
			session.put("oldItemPrice",oldItemPrice);
			session.put("oldItemStock",oldItemStock);
			result= SUCCESS;

		}else{
			errorMassage="商品価格と追加在庫数は半角英数字で入力してください";
		}
		return result;
	}

	public String getNewItemName() {
		return newItemName;
	}
	public void setNewItemName(String newItemName) {
		this.newItemName = newItemName;
	}
	public String getNewItemPrice() {
		return newItemPrice;
	}
	public void setNewItemPrice(String newItemPrice) {
		this.newItemPrice = newItemPrice;
	}
	public String getAddItemStock() {
		return addItemStock;
	}
	public void setAddItemStock(String addItemStock) {
		this.addItemStock = addItemStock;
	}
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public String getOldItemName() {
		return oldItemName;
	}

	public void setOldItemName(String oldItemName) {
		this.oldItemName = oldItemName;
	}

	public String getOldItemPrice() {
		return oldItemPrice;
	}

	public void setOldItemPrice(String oldItemPrice) {
		this.oldItemPrice = oldItemPrice;
	}

	public String getOldItemStock() {
		return oldItemStock;
	}

	public void setOldItemStock(String oldItemStock) {
		this.oldItemStock = oldItemStock;
	}

	public String getErrorMassage() {
		return errorMassage;
	}

	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}
}
