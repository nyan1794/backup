package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ShopLoginDAO;
import com.internousdev.ecsite.dto.ShopSellItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoShopMainFromUpdateAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private List<ShopSellItemDTO> shopSellItemList=new ArrayList<ShopSellItemDTO>();

	public String execute() throws SQLException{
		session.remove("oldItemName");
		session.remove("oldItemPrice");
		session.remove("oldItemStock");
		session.remove("newItemName");
		session.remove("newStock");
		session.remove("newItemStock");
		session.remove("addItemStock");
		ShopLoginDAO shopLoginDAO=new ShopLoginDAO();
		shopSellItemList=shopLoginDAO.getShopItemInfo(session.get("shopName").toString());
		session.put("shopSellItemList",shopSellItemList);
		return SUCCESS;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
