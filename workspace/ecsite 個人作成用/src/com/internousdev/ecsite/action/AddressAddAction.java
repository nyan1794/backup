package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.AddAddressDAO;
import com.internousdev.ecsite.dto.AddressDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AddressAddAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private String newZipcode1;
	private String newZipcode2;
	private String newPrefecture;
	private String newCity;
	private String newAddress;
	private String newBuilding;
	private String orderTotalPrice;
	private AddAddressDAO addAddressDAO= new AddAddressDAO();
	private List<AddressDTO> addressList=new ArrayList<AddressDTO>();
	private String errorMassage = null;
	public String execute() throws SQLException{
		String result=ERROR;
		String user_master_id=session.get("login_user_id").toString();
		if((!(newZipcode1.matches("^[0-9]{3}"))) && (!(newZipcode2.matches("^[0-9]{4}")))){
			errorMassage="郵便番号は3桁と4桁の半角数字で入力してください。";
			return ERROR;
		}
		if(newBuilding.equals("")){
			newBuilding="noBuilding";
		}

		int resultInt=0;
		String newZipcode=newZipcode1+"-"+newZipcode2;
		resultInt=addAddressDAO.addAddressSQL(user_master_id, newZipcode, newPrefecture, newCity, newAddress, newBuilding);
		if(resultInt>0){
			result=SUCCESS;
			addressList=addAddressDAO.selectAddressTable(user_master_id);
			session.put("addressList", addressList);
		}else{
			return ERROR;
		}
		return result;
	}



	public void setSession(Map<String,Object> session){
		this.session=session;
	}



	public String getNewZipcode1() {
		return newZipcode1;
	}



	public void setNewZipcode1(String newZipcode1) {
		this.newZipcode1 = newZipcode1;
	}



	public String getNewZipcode2() {
		return newZipcode2;
	}



	public void setNewZipcode2(String newZipcode2) {
		this.newZipcode2 = newZipcode2;
	}



	public String getNewPrefecture() {
		return newPrefecture;
	}



	public void setNewPrefecture(String newPrefecture) {
		this.newPrefecture = newPrefecture;
	}



	public String getNewCity() {
		return newCity;
	}



	public void setNewCity(String newCity) {
		this.newCity = newCity;
	}



	public String getNewAddress() {
		return newAddress;
	}



	public void setNewAddress(String newAddress) {
		this.newAddress = newAddress;
	}



	public String getNewBuilding() {
		return newBuilding;
	}



	public void setNewBuilding(String newBuilding) {
		this.newBuilding = newBuilding;
	}



	public Map<String, Object> getSession() {
		return session;
	}



	public String getErrorMassage() {
		return errorMassage;
	}



	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}



	public String getOrderTotalPrice() {
		return orderTotalPrice;
	}



	public void setOrderTotalPrice(String orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}
}
