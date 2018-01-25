package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoBuyItemFromUserInfoAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	public String execute(){
		session.remove("newLoginId");
		session.remove("newLoginPassword");
		session.remove("newUserEmail");
		session.remove("newUserName");
		session.remove("newUserZipcode");
		session.remove("newUserPrefecture");
		session.remove("newUserCity");
		session.remove("newUserAddress");
		session.remove("newUserBuilding");
		session.remove("newUserCreditNum");
		session.remove("newUserCreditDate");
		session.remove("loginId");
		session.remove("loginPassword");
		session.remove("RandNum");
		session.remove("userName");
		session.remove("userEmail");
		session.remove("userZipcode");
		session.remove("userZipcode1");
		session.remove("userZipcode2");
		session.remove("userPrefecture");
		session.remove("userCity");
		session.remove("userAddress");
		session.remove("userBuilding");
		session.remove("userCreditNum");
		session.remove("userCreditDate");
		return SUCCESS;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
