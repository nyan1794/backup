package com.internousdev.ecsite.dto;

public class LoginDTO {

	private String loginId;

	private String loginPassword;

	private String userName;

	private String userEmail;

	private String userZipcode;

	private String userPrefecture;

	private String userCity;

	private String userAddress;

	private String userBuilding;

	private String userCreditNum;

	private String userCreditDate;

	private boolean loginFlg = false;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean getLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}



	public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	public String getUserZipcode() {
		return userZipcode;
	}



	public void setUserZipcode(String userZipcode) {
		this.userZipcode = userZipcode;
	}



	public String getUserPrefecture() {
		return userPrefecture;
	}



	public void setUserPrefecture(String userPrefecture) {
		this.userPrefecture = userPrefecture;
	}



	public String getUserCity() {
		return userCity;
	}



	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}



	public String getUserAddress() {
		return userAddress;
	}



	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}



	public String getUserBuilding() {
		return userBuilding;
	}



	public void setUserBuilding(String userBuilding) {
		this.userBuilding = userBuilding;
	}



	public String getUserCreditNum() {
		return userCreditNum;
	}



	public void setUserCreditNum(String userCreditNum) {
		this.userCreditNum = userCreditNum;
	}



	public String getUserCreditDate() {
		return userCreditDate;
	}



	public void setUserCreditDate(String userCreditDate) {
		this.userCreditDate = userCreditDate;
	}
}
