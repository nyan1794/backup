package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemFromCartDAO;
import com.internousdev.ecsite.dao.ShopOrderDAO;
import com.internousdev.ecsite.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemFromCartCompleteAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;
	private String zipcode;
	private String prefecture;
	private String city;
	private String address;
	private String building;
	private List<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
	private BuyItemFromCartDAO buyItemFromCartDAO = new BuyItemFromCartDAO();

	@SuppressWarnings("unchecked")
	public String execute() throws SQLException{

		int insertResult=0;
		myPageList=(List<MyPageDTO>)session.get("myPageList");
		String user_master_id=session.get("login_user_id").toString();


		for(int i =0;myPageList.size() > 0 ; i++){
			insertResult+=buyItemFromCartDAO.insertOrder(
					user_master_id,
					myPageList.get(i).getItemName(),
					myPageList.get(i).getId(),
					myPageList.get(i).getTotalCount(),
					myPageList.get(i).getTotalItemPrice(),
					session.get("orderTotalPrice").toString(),
					myPageList.get(i).getPayment(),
					myPageList.get(i).getOrderNum(),
					zipcode,
					prefecture,
					city,
					address,
					building
					);
		}
		if(insertResult >0){
			int deleteResult=buyItemFromCartDAO.deleteFromCart(user_master_id);
			if(deleteResult > 0){
				ShopOrderDAO shopOrderDAO = new ShopOrderDAO();
				String shopName="";
				for(int i=0;myPageList.size() > i; i++){
					for(int j = 0; orderList>j;j++){
						if(myPageList.get(i).getShopName().equals(orderList.get(j).getShopName())){
							myPageList.get(i).setOrderTotalPrice(orderList.get(j).getPrice);
						}
					}
				}


				for(int i=0 ; myPageList.size() > i ; i++){
				shopOrderDAO.shopOrderResult(
						myPageList.get(i).getShopName(),
						myPageList.get(i).getId(),
						myPageList.get(i).getItemName(),
						myPageList.get(i).getTotalCount(),
						myPageList.get(i).getTotalItemPrice(),
						shop_order,
						order_num,
						buy_zipcode,
						buy_prefecture,
						buy_city,
						buy_address,
						buy_building,
						buy_user_name,
						buy_user_id
						);
				}
			}

		}
		return SUCCESS;
	}

	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPrefecture() {
		return prefecture;
	}
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
