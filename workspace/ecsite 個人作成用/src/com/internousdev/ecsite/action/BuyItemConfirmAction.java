package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemCompleteDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;

	private String pay;

	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
	private String orderNum=previewOrderNum();

	/**
	 * 商品購入情報登録メソッド
	 *
	 * @author internous
	 */
	@SuppressWarnings("unchecked")
	public String execute() throws SQLException {
		session.put("orderNum", orderNum);
		if(pay.equals("1")){
			String payment="現金払い";
			session.put("pay",payment);
		}else if(pay.equals("2")){
			String payment="クレジット払い";
			session.put("pay", payment);
		}

		List<BuyItemDTO> buyItemConfirmList=(List<BuyItemDTO>)session.get("buyItemConfirmList");
		while(buyItemCompleteDAO.getOrderNumByDB(orderNum) != 0)
		{
			orderNum=previewOrderNum();
			session.put("orderNum",orderNum);
		}
		for(int i=0;buyItemConfirmList.size()>i;i++){

		buyItemConfirmList.get(i).setPay(pay);
		buyItemCompleteDAO.buyItemeInfo(
				buyItemConfirmList.get(i).getId(),
				session.get("login_user_id").toString(),
				buyItemConfirmList.get(i).getItemTotalPrice(),
				buyItemConfirmList.get(i).getCount(),
				buyItemConfirmList.get(i).getTotalPrice(),
				session.get("pay").toString(),
				orderNum,
				buyItemConfirmList.get(i).getShopName());
		buyItemCompleteDAO.updateItemInfo((buyItemConfirmList.get(i).getItemStock() - buyItemConfirmList.get(i).getCount()),buyItemConfirmList.get(i).getId());
		}
		session.put("buyItemConfirmList", buyItemConfirmList);
		buyItemCompleteDAO.buyItemeInfoClose();
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


	public String previewOrderNum(){
		Random rand=new Random();
		int[] orderIntArray= new int[8];
		String[] orderStringArray = new String[8];
		String orderNumPreview="";
		for(int i=0 ; orderStringArray.length>i;i++){
			orderIntArray[i]=rand.nextInt(10);
			orderStringArray[i]=String.valueOf(orderIntArray[i]);
			orderNumPreview=orderNumPreview+orderStringArray[i];
		}
		return orderNumPreview;
	}



}
