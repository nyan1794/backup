package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemCompleteDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;

	private String pay;

	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();


	/**
	 * 商品購入情報登録メソッド
	 *
	 * @author internous
	 */
	@SuppressWarnings("unchecked")
	public String execute() throws SQLException {
		if(pay.equals("1")){
			String payment="現金払い";
			session.put("pay",payment);
		}else if(pay.equals("2")){
			String payment="クレジット払い";
			session.put("pay", payment);
		}
		List<BuyItemDTO> buyItemConfirmList=(List<BuyItemDTO>)session.get("buyItemConfirmList");
		for(int i=0;buyItemConfirmList.size()>i;i++){

		buyItemConfirmList.get(i).setPay(pay);
		buyItemCompleteDAO.buyItemeInfo(
				buyItemConfirmList.get(i).getId(),
				session.get("login_user_id").toString(),
				buyItemConfirmList.get(i).getItemTotalPrice(),
				buyItemConfirmList.get(i).getCount(),
				buyItemConfirmList.get(i).getTotalPrice(),
				session.get("pay").toString());
		}
		session.put("buyItemConfirmList", buyItemConfirmList);
		String result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public String getPay(){
		return pay;
	}
	public void setPay(String pay){
		this.pay=pay;
	}



}
