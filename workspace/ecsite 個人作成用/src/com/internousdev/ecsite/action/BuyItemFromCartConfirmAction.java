package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.AddAddressDAO;
import com.internousdev.ecsite.dto.AddressDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemFromCartConfirmAction extends ActionSupport implements SessionAware{
	private LoginDTO loginDTO = new LoginDTO();
	public Map<String,Object> session;
	private String zipcode;
	private String prefecture;
	private String city;
	private String address;
	private String building;
	private String user_master_id;
	private String orderTotalPrice;
	private List<AddressDTO> addressList =new ArrayList<AddressDTO>();
	private AddAddressDAO addAddressDAO=new AddAddressDAO();


	public String execute() throws SQLException{
	loginDTO = (LoginDTO)session.get("loginUser");
	session.put("zipcode",loginDTO.getUserZipcode());
	session.put("prefecture",loginDTO.getUserPrefecture());
	session.put("city",loginDTO.getUserCity());
	session.put("address",loginDTO.getUserAddress());
	session.put("building",loginDTO.getUserBuilding());

	user_master_id=session.get("login_user_id").toString();


	addressList =addAddressDAO.selectAddressTable(user_master_id);
	session.put("addressList", addressList);
	return SUCCESS;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public LoginDTO getLoginDTO() {
		return loginDTO;
	}

	public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
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

	public Map<String, Object> getSession() {
		return session;
	}

	public String getOrderTotalPrice() {
		return orderTotalPrice;
	}

	public void setOrderTotalPrice(String orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}
}
