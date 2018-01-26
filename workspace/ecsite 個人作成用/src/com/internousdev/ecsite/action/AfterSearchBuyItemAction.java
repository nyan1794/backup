package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AfterSearchBuyItemAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private List<Integer> count;
	private List<BuyItemDTO> buyItemConfirmList = new ArrayList<BuyItemDTO>();

	@SuppressWarnings("unchecked")
	public String execute(){
		List<BuyItemDTO> buyItemList = ((List<BuyItemDTO>)session.get("searchBuyItemList"));
		int totalPrice = 0;
		for(int i = 0;buyItemList.size()>i;i++){
			buyItemList.get(i).setCount(count.get(i));
			int itemPrice = buyItemList.get(i).getItemPrice();
			int itemCount = buyItemList.get(i).getCount();

			int itemTotalPrice = itemPrice * itemCount;
			buyItemList.get(i).setItemTotalPrice(itemTotalPrice);
			totalPrice = totalPrice+itemTotalPrice;
			buyItemList.get(i).setTotalPrice(totalPrice);
			if(buyItemList.get(i).getCount() > 0){
				buyItemConfirmList.add(buyItemList.get(i));
			}

		}
		session.put("totalPrice",totalPrice);
		session.put("buyItemConfirmList",buyItemConfirmList);
		return SUCCESS;
	}


	public void setSession(Map<String,Object> session){
		this.session=session;
	}


	public List<Integer> getCount() {
		return count;
	}


	public void setCount(List<Integer> count) {
		this.count = count;
	}

}
