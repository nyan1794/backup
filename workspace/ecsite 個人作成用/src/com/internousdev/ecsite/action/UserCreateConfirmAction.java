package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author internous
 *
 */
public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String loginUserId;

	private String loginPassword;

	private String userName;

	private String email;

	private String zipcode1;
	private String zipcode2;
	private String prefecture;
	private String city;
	private String address;
	private String building;

	private String creditNum;
	private String creditMon;
	private String creditYear;

	public Map<String,Object> session;

	private String errorMassage;
	private String creditError;
	private String regexError;

	public String execute() {

		String result = SUCCESS;
		if(!(loginUserId.matches("^[0-9a-zA-Z]{1,20}"))){
			setRegexError("ログインIDは半角英数字で２０文字以内で入力してください");
			return ERROR;
		}
		if(!(loginPassword.matches("^[0-9a-zA-Z]{1,20}"))){
			setRegexError("ログインパスワードは半角英数字で２０文字以内で入力してください");
			return ERROR;
		}
		if(!(zipcode1.matches("^[0-9]{3}"))){
			setRegexError("郵便番号は半角英数字で１つ目に３文字、２つ目に４文字で入力してください");
			return ERROR;
		}
		if(!(zipcode2.matches("^[0-9]{4}"))){
			setRegexError("郵便番号は半角英数字で１つ目に３文字、２つ目に４文字で入力してください");
			return ERROR;
		}

		if(!(email.matches("^.*@.*"))){
			setRegexError("メールアドレスの形式が間違っています");
			return ERROR;
		}
		if(!(creditNum.equals(""))){
			if(!(creditNum.matches("^[0-9]{16}"))){
				setRegexError("カード番号は半角英数字16文字で入力してください");
				return ERROR;
			}
			if(!(creditMon.matches("^[0-9]{2}"))){
				setRegexError("カード有効期限の月は2桁で入力してください 例:02");
				return ERROR;
			}
			if(!(creditYear.matches("^[0-9]{4}"))){
				setRegexError("カード有効期限の年は西暦で4桁で入力してください 例:2020");
				return ERROR;
			}
		}
		if(!(loginUserId.equals("")) && !(loginPassword.equals("")) && !(userName.equals("")) && !(email.equals(""))
				&& !(zipcode1.equals("")) && !(zipcode2.equals("")) && !(city.equals("")) && !(address.equals(""))) {
			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("userName", userName);
			session.put("email",email);
			session.put("zipcode",zipcode1+"-"+zipcode2);
			session.put("prefecture", prefecture);
			session.put("city", city);
			session.put("address",address);
			session.put("building","noBuilding");
			session.put("creditNum","no");
			session.put("creditDate","no");
			if(!(creditNum.equals(""))){
				result=ERROR;
				creditError="カード情報を確認してください";
				if(!(creditMon.equals(""))){
					result=ERROR;
					if(!(creditYear.equals(""))){
						result=SUCCESS;
						session.put("creditNum", creditNum);
						session.put("creditDate",creditMon+"月"+creditYear+"年");
						creditError=null;
					}
				}
			if(!(building.equals(""))){
				session.put("building",building);
			}
			}
		} else {

			setErrorMassage("未入力の項目があります。");
			result = ERROR;
		}

		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
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

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMassage() {
		return errorMassage;
	}

	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZipcode1() {
		return zipcode1;
	}

	public void setZipcode1(String zipcode1) {
		this.zipcode1 = zipcode1;
	}

	public String getZipcode2() {
		return zipcode2;
	}

	public void setZipcode2(String zipcode2) {
		this.zipcode2 = zipcode2;
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

	public String getCreditNum() {
		return creditNum;
	}

	public void setCreditNum(String creditNum) {
		this.creditNum = creditNum;
	}

	public String getCreditMon() {
		return creditMon;
	}

	public void setCreditMon(String creditMon) {
		this.creditMon = creditMon;
	}

	public String getCreditYear() {
		return creditYear;
	}

	public void setCreditYear(String creditYear) {
		this.creditYear = creditYear;
	}
	public String getCreditError(){
		return creditError;
	}
	public void setCreditError(String creditError){
		this.creditError=creditError;
	}

	public String getRegexError() {
		return regexError;
	}

	public void setRegexError(String regexError) {
		this.regexError = regexError;
	}
}
