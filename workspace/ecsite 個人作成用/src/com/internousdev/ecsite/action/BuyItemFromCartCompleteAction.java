package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemFromCartCompleteAction extends ActionSupport{


	private String zipcode;
	private String prefecture;
	private String city;
	private String address;
	private String building;
	public String execute(){
		System.out.println(zipcode);
		System.out.println(prefecture);
		System.out.println(city);
		System.out.println(address);
		System.out.println(building);
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

}
