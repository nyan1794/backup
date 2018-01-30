package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemFromCartAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private List<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
	private int orderTotalPrice;
	@SuppressWarnings("unchecked")
	public String execute(){
		myPageList = (List<MyPageDTO>)session.get("myPageList");
		for(int i=0;myPageList.size() > i;i++){
			orderTotalPrice+=Integer.parseInt(myPageList.get(i).getTotalItemPrice());
		}
		session.put("orderTotalPrice", orderTotalPrice);
		return SUCCESS;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public int getOrderTotalPrice() {
		return orderTotalPrice;
	}

	public void setOrderTotalPrice(int orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}
}
