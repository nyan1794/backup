package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String loginUserId;

	private String loginPassword;

	private String userName;

	public Map<String,Object> session;

	private String errorMassage;

	private String insertRandNum;

	private String emailMassage;



	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	public String execute() throws SQLException {
		String result= LOGIN;
		emailMassage="認証コードが間違っています";
		if(session.get("RandNum").toString().equals(insertRandNum)){
			result=ERROR;
			emailMassage="";
		if(userCreateCompleteDAO.cerateUser(
				session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("email").toString(),
				session.get("userName").toString(),
				session.get("zipcode").toString(),
				session.get("prefecture").toString(),
				session.get("city").toString(),
				session.get("address").toString(),
				session.get("building").toString(),
				session.get("creditNum").toString(),
				session.get("creditDate").toString()
				)!=0){
					session.clear();
					result = SUCCESS;
		}else{
		setErrorMassage("このユーザーIDは既に使われています。");
		}
		}
		return result ;
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


	public String getErrorMassage() {
		return errorMassage;
	}

	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}

	public String getInsertRandNum() {
		return insertRandNum;
	}

	public void setInsertRandNum(String insertRandNum) {
		this.insertRandNum = insertRandNum;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getEmailMassage() {
		return emailMassage;
	}

	public void setEmailMassage(String emailMassage) {
		this.emailMassage = emailMassage;
	}
}
