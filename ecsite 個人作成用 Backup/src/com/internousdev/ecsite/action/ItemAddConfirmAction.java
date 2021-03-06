package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemAddConfirmAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private String sellItemName;
	private String sellItemPrice;
	private String sellItemStock;
	private String errorItemName;
	private String errorItemPrice;
	private String errorItemStock;
	public String execute(){
		String result =ERROR;
		if(sellItemName.length()>0){
			errorItemName=null;
		}else{
			errorItemName="商品名を入力してください";
			return result;
		}
		if(sellItemPrice.matches("^[0-9]{1,10}")){
			errorItemPrice=null;
		}else{
			errorItemPrice="値段は半角英数10桁以内で入力してください";
			return result;

		}
		if(sellItemStock.matches("^[0-9]{1,10}")){
			errorItemStock=null;
		}else{
			errorItemPrice="初期入庫数は半角英数10桁以内で入力してください";
			return result;
		}
		if((sellItemStock.matches("^[0-9]{1,10}"))&&(sellItemPrice.matches("^[0-9]{1,10}"))&&(sellItemName.length()>0)){
			session.put("sellItemName",sellItemName);
			session.put("sellItemPrice",sellItemPrice);
			session.put("sellItemStock",sellItemStock);
			result =SUCCESS;
		}
		return result;

	}
	public String getSellItemName() {
		return sellItemName;
	}
	public void setSellItemName(String sellItemName) {
		this.sellItemName = sellItemName;
	}
	public String getSellItemPrice() {
		return sellItemPrice;
	}
	public void setSellItemPrice(String sellItemPrice) {
		this.sellItemPrice = sellItemPrice;
	}
	public String getSellItemStock() {
		return sellItemStock;
	}
	public void setSellItemStock(String sellItemStock) {
		this.sellItemStock = sellItemStock;
	}
	public String getErrorItemName(){
		return errorItemName;
	}
	public void setErrorItemName(String errorItemName){
		this.errorItemName=errorItemName;
	}
	public String getErrorItemPrice() {
		return errorItemPrice;
	}
	public void setErrorItemPrice(String errorItemPrice) {
		this.errorItemPrice = errorItemPrice;
	}
	public String getErrorItemStock() {
		return errorItemStock;
	}
	public void setErrorItemStock(String errorItemStock) {
		this.errorItemStock = errorItemStock;
	}
	public void setSession(Map<String,Object> session){
		this.session=session;
	}


}
