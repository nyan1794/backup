package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserInfoUpdateConfirmAction extends ActionSupport implements SessionAware{
	private String newUserName;
	private String newLoginId;
	private String newLoginPassword;
	private String newUserEmail;
	private String newUserZipcode1;
	private String newUserZipcode2;
	private String newUserPrefecture;
	private String newUserCity;
	private String newUserAddress;
	private String newUserBuilding;
	private String newUserCreditNum;
	private String newUserCreditMon;
	private String newUserCreditYear;
	private String newUserCreditDate;

	public Map<String,Object> session;
	public String execute(){
		if()

	}


	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public String getNewUserName() {
		return newUserName;
	}
	public void setNewUserName(String newUserName) {
		this.newUserName = newUserName;
	}
	public String getNewLoginId() {
		return newLoginId;
	}
	public void setNewLoginId(String newLoginId) {
		this.newLoginId = newLoginId;
	}
	public String getNewLoginPassword() {
		return newLoginPassword;
	}
	public void setNewLoginPassword(String newLoginPassword) {
		this.newLoginPassword = newLoginPassword;
	}
	public String getNewUserEmail() {
		return newUserEmail;
	}
	public void setNewUserEmail(String newUserEmail) {
		this.newUserEmail = newUserEmail;
	}

	public String getNewUserZipcode1() {
		return newUserZipcode1;
	}

	public void setNewUserZipcode1(String newUserZipcode1) {
		this.newUserZipcode1 = newUserZipcode1;
	}

	public String getNewUserZipcode2() {
		return newUserZipcode2;
	}

	public void setNewUserZipcode2(String newUserZipcode2) {
		this.newUserZipcode2 = newUserZipcode2;
	}

	public String getNewUserPrefecture() {
		return newUserPrefecture;
	}
	public void setNewUserPrefecture(String newUserPrefecture) {
		this.newUserPrefecture = newUserPrefecture;
	}
	public String getNewUserCity() {
		return newUserCity;
	}
	public void setNewUserCity(String newUserCity) {
		this.newUserCity = newUserCity;
	}
	public String getNewUserAddress() {
		return newUserAddress;
	}
	public void setNewUserAddress(String newUserAddress) {
		this.newUserAddress = newUserAddress;
	}
	public String getNewUserBuilding() {
		return newUserBuilding;
	}
	public void setNewUserBuilding(String newUserBuilding) {
		this.newUserBuilding = newUserBuilding;
	}
	public String getNewUserCreditNum() {
		return newUserCreditNum;
	}
	public void setNewUserCreditNum(String newUserCreditNum) {
		this.newUserCreditNum = newUserCreditNum;
	}
	public String getNewUserCreditMon() {
		return newUserCreditMon;
	}
	public void setNewUserCreditMon(String newUserCreditMon) {
		this.newUserCreditMon = newUserCreditMon;
	}
	public String getNewUserCreditYear() {
		return newUserCreditYear;
	}
	public void setNewUserCreditYear(String newUserCreditYear) {
		this.newUserCreditYear = newUserCreditYear;
	}
	public String getNewUserCreditDate() {
		return newUserCreditDate;
	}
	public void setNewUserCreditDate(String newUserCreditDate) {
		this.newUserCreditDate = newUserCreditDate;
	}
}
