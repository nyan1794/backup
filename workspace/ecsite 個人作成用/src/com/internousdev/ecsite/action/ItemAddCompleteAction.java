package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemAddDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemAddCompleteAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private String insertShopCode;
	private String errorMassage;
	public String execute() throws SQLException{

		String result=ERROR;
		if(session.get("shopCode").toString().equals(insertShopCode)){
		ItemAddDAO itemAddDAO=new ItemAddDAO();
		String sellItemName=session.get("sellItemName").toString();
		String sellItemPrice=session.get("sellItemPrice").toString();
		String sellItemStock=session.get("sellItemStock").toString();
		String shopName=session.get("shopName").toString();
		int addRes=itemAddDAO.addItem(sellItemName,sellItemPrice,sellItemStock,shopName);
		if(addRes>0){
			result=SUCCESS;
		}
		}else{
			result = "back";
			errorMassage="店舗コードが間違っています。";

		}
		return result;


	}




public void setSession(Map<String,Object> session){
	this.session=session;
}




public String getInsertShopCode() {
	return insertShopCode;
}




public void setInsertShopCode(String insertShopCode) {
	this.insertShopCode = insertShopCode;
}




public String getErrorMassage() {
	return errorMassage;
}




public void setErrorMassage(String errorMassage) {
	this.errorMassage = errorMassage;
}
}
