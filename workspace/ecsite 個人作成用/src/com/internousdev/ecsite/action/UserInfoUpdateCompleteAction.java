package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserInfoUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoUpdateCompleteAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private UserInfoUpdateDAO userInfoUpdateDAO=new UserInfoUpdateDAO();
	private String insertRandNum;
	private String emailMassage;
	private String errorMassage;

	public String execute() throws SQLException{
		String result;
		if(session.get("RandNum").toString().equals(insertRandNum)){

			int SQLResult=userInfoUpdateDAO.userInfoUpdateSQL(
					session.get("newLoginId").toString(),
					session.get("newLoginPassword").toString(),
					session.get("newUserEmail").toString(),
					session.get("newUserName").toString(),
					session.get("newUserZipcode").toString(),
					session.get("newUserPrefecture").toString(),
					session.get("newUserCity").toString(),
					session.get("newUserAddress").toString(),
					session.get("newUserBuilding").toString(),
					session.get("newUserCreditNum").toString(),
					session.get("newUserCreditDate").toString(),
					session.get("loginId").toString(),
					session.get("loginPassword").toString());
			if(SQLResult > 0){
				session.put("userInfoUpdateComplete","yes");
				session.put("login_user_id",session.get("newLoginId"));
				session.put("login_user_password",session.get("newLoginPassword"));
				result = SUCCESS;
			}else{
				errorMassage="このユーザーIDは使用されています";
				result = ERROR;
			}
		}else{
			result = LOGIN;
			setEmailMassage("認証コードが間違っています。");
		}
		return result;

	}




	public void setSession(Map<String, Object> session) {
		this.session = session;
	}




	public String getInsertRandNum() {
		return insertRandNum;
	}




	public void setInsertRandNum(String insertRandNum) {
		this.insertRandNum = insertRandNum;
	}




	public String getEmailMassage() {
		return emailMassage;
	}




	public void setEmailMassage(String emailMassage) {
		this.emailMassage = emailMassage;
	}




	public String getErrorMassage() {
		return errorMassage;
	}




	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}
}
