package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ShopLoginDAO;
import com.internousdev.ecsite.dto.ShopLoginDTO;
import com.internousdev.ecsite.dto.ShopSellItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ShopLoginAction extends ActionSupport implements SessionAware{
	private String shopLoginId;
	private String shopLoginPassword;
	private String massage="ログインに失敗しました。";
	public Map<String,Object> session;
	public List<ShopSellItemDTO> shopSellItemList=new ArrayList<ShopSellItemDTO>();

	private ShopLoginDAO shopLoginDAO=new ShopLoginDAO();

	public String execute() throws SQLException{
	String result=ERROR;

	ShopLoginDTO shopLoginDTO=shopLoginDAO.shopLoginSQL(shopLoginId,shopLoginPassword);
	if(shopLoginDTO.getShopLoginFlg()){
		session.put("shopLoginId",shopLoginDTO.getShopLoginId());
		session.put("shopLoginPass",shopLoginDTO.getShopLoginPassword());
		session.put("shopName",shopLoginDTO.getShopName());
		shopSellItemList=shopLoginDAO.getShopItemInfo(shopLoginDTO.getShopName());
		session.put("shopSellItemList",shopSellItemList);

		result=SUCCESS;
		massage=null;
	}
	return result;
	}

	public String getShopLoginId() {
		return shopLoginId;
	}
	public void setShopLoginId(String shopLoginId) {
		this.shopLoginId = shopLoginId;
	}

	public String getShopLoginPassword() {
		return shopLoginPassword;
	}
	public void setShopLoginPassword(String shopLoginPassword) {
		this.shopLoginPassword = shopLoginPassword;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}

}
