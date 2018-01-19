
package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {

	/**
	 * アイテム購入個数
	 */
	private List<Integer> count;

	/**
	 * 支払い方法
	 */


	/**
	 * アイテム情報を格納
	 */
	public Map<String, Object>  session;

	public List<BuyItemDTO> buyItemConfirmList = new ArrayList<BuyItemDTO>();


	/**
	 * 商品情報取得メソッド
	 *
	 * @author internous
	 */
	@SuppressWarnings("unchecked")
	public String execute() {
		String result = SUCCESS;
		int totalPrice=0;
		List<BuyItemDTO> buyItemList = (List<BuyItemDTO>)session.get("buyItemList");
		for(int i=0; buyItemList.size() > i; i++) {

			int intPrice = buyItemList.get(i).getItemPrice();
			int intCount = count.get(i);

			buyItemList.get(i).setCount(count.get(i));
			buyItemList.get(i).setItemTotalPrice(intCount * intPrice);
			int price=buyItemList.get(i).getItemTotalPrice();
			totalPrice+=price;


		}
		int j=0;
		for(int i=0;buyItemList.size()>i;i++){
			buyItemList.get(i).setTotalPrice(totalPrice);
			int itemcount = buyItemList.get(i).getCount();
			if(!(itemcount == 0)){
				buyItemConfirmList.add(j,buyItemList.get(i));
				j++;
			}
		}
		session.put("totalPrice",totalPrice);
		session.put("buyItemConfirmList",buyItemConfirmList);
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public void setCount(List<Integer> count){
		this.count=count;
	}

	public List<BuyItemDTO> getBuyItemConfirmList() {
		return buyItemConfirmList;
	}

	public void setBuyItemConfirmList(List<BuyItemDTO> buyItemConfirmList) {
		this.buyItemConfirmList = buyItemConfirmList;
	}


}
