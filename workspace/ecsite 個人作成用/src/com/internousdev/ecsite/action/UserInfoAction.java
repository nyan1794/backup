package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;



	public String execute(){
		LoginDAO loginDAO = new LoginDAO();
		if(session.containsKey("userInfoUpdateComplete")){
			LoginDTO loginDTO = loginDAO.getLoginUserInfo(session.get("newLoginId").toString(),session.get("newLoginPassword").toString());
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
			session.remove("userInfoUpdateComplete");
			String creditDate = loginDTO.getUserCreditDate();
			if(!(creditDate.equals("no"))){
				String[] splitCreditDate =creditDate.split("月", 0);
				String[] splitCreditYear =splitCreditDate[1].split("年",0);
				String creditMon =splitCreditDate[0];
				String creditYear =splitCreditYear[0];
				session.put("userCreditMon",creditMon);
				session.put("userCreditYear", creditYear);
			}

			String[] splitZipcode = loginDTO.getUserZipcode().split("-",0);
			String zipcode1 = splitZipcode[0];
			String zipcode2 = splitZipcode[1];
			session.put("loginId",loginDTO.getLoginId());
			session.put("loginPassword",loginDTO.getLoginPassword());
			session.put("userName",loginDTO.getUserName());
			session.put("userEmail",loginDTO.getUserEmail());
			session.put("userZipcode",loginDTO.getUserZipcode());
			session.put("userZipcode1",zipcode1);
			session.put("userZipcode2",zipcode2);
			session.put("userPrefecture",loginDTO.getUserPrefecture());
			session.put("userCity",loginDTO.getUserCity());
			session.put("userAddress",loginDTO.getUserAddress());
			session.put("userBuilding", loginDTO.getUserBuilding());
			session.put("userCreditNum", loginDTO.getUserCreditNum());
			session.put("userCreditDate",loginDTO.getUserCreditDate());

		}else{
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
			LoginDTO loginDTO = loginDAO.getLoginUserInfo(session.get("login_user_id").toString(),session.get("login_user_password").toString());
			String creditDate = loginDTO.getUserCreditDate();
			if(!(creditDate.equals("no"))){
				String[] splitCreditDate =creditDate.split("月", 0);
				String[] splitCreditYear =splitCreditDate[1].split("年",0);
				String creditMon =splitCreditDate[0];
				String creditYear =splitCreditYear[0];
				session.put("userCreditMon",creditMon);
				session.put("userCreditYear", creditYear);
			}

			String[] splitZipcode = loginDTO.getUserZipcode().split("-",0);
			String zipcode1 = splitZipcode[0];
			String zipcode2 = splitZipcode[1];
			session.put("loginId",loginDTO.getLoginId());
			session.put("loginPassword",loginDTO.getLoginPassword());
			session.put("userName",loginDTO.getUserName());
			session.put("userEmail",loginDTO.getUserEmail());
			session.put("userZipcode",loginDTO.getUserZipcode());
			session.put("userZipcode1",zipcode1);
			session.put("userZipcode2",zipcode2);
			session.put("userPrefecture",loginDTO.getUserPrefecture());
			session.put("userCity",loginDTO.getUserCity());
			session.put("userAddress",loginDTO.getUserAddress());
			session.put("userBuilding", loginDTO.getUserBuilding());
			session.put("userCreditNum", loginDTO.getUserCreditNum());
			session.put("userCreditDate",loginDTO.getUserCreditDate());

		}




		return SUCCESS;
	}



	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
