package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ShopItemUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ShopItemUpdateCompleteAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private ShopItemUpdateDAO shopItemUpdateDAO=new ShopItemUpdateDAO();
	private String errorMassage;
	private String insertShopCode;

	public String execute() throws SQLException{
		String result=ERROR;

		if(session.get("shopCode").toString().equals(insertShopCode)){
		errorMassage="商品情報の更新に失敗しました";
		int resultInt=shopItemUpdateDAO.updateItem(
				session.get("newItemName").toString(),
				session.get("newItemPrice").toString(),
				session.get("newStock").toString(),
				session.get("oldItemName").toString(),
				session.get("oldItemPrice").toString(),
				session.get("oldItemStock").toString());
		if(resultInt > 0){
			result=SUCCESS;
			errorMassage=null;

		}
		}else{
			result = "back";
			errorMassage="店舗コードが間違っています";
		}
		return result;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMassage() {
		return errorMassage;
	}

	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}

	public String getInsertShopCode() {
		return insertShopCode;
	}

	public void setInsertShopCode(String insertShopCode) {
		this.insertShopCode = insertShopCode;
	}

}
