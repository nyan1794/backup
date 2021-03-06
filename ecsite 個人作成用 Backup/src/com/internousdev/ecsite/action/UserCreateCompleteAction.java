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

	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	public String execute() throws SQLException {
		String result = ERROR;
		if(userCreateCompleteDAO.cerateUser(session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("userName").toString())!=0){

		result = SUCCESS;
		}else{
		setErrorMassage("このユーザーIDは既に使われています。");
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

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
