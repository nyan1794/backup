package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemSearchDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemSearchAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private String itemSearch;
	private String searchResult;
	private BuyItemSearchDAO buyItemSearchDAO = new BuyItemSearchDAO();
	private List<BuyItemDTO> searchBuyItemList = new ArrayList<BuyItemDTO>();
	public String execute() throws SQLException{
		searchBuyItemList = buyItemSearchDAO.searchBuyItem(itemSearch);
		session.put("searchBuyItemList", searchBuyItemList);
		if(searchBuyItemList.size() == 0){
			setSearchResult("検索結果がありませんでした。");
		}else{
			setSearchResult("検索結果が"+searchBuyItemList.size()+"件見つかりました");
		}
		return SUCCESS;

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public String getItemSearch() {
		return itemSearch;
	}
	public void setItemSearch(String itemSearch) {
		this.itemSearch = itemSearch;
	}

	public String getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(String searchResult) {
		this.searchResult = searchResult;
	}


}
