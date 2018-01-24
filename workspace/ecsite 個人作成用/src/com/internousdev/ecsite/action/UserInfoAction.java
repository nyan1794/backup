package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;



	public String execute(){

		LoginDTO loginDTO =((LoginDTO)session.get( "loginUser"));
		String creditDate = loginDTO.getUserCreditDate();
		String[] splitCreditDate =creditDate.split("月", 0);
		String[] splitCreditYear =splitCreditDate[1].split("年",0);
		String creditMon =splitCreditDate[0];
		String creditYear =splitCreditYear[0];
		String[] splitZipcode = loginDTO.getUserZipcode().split("-",0);
		String zipcode1 = splitZipcode[0];
		String zipcode2 = splitZipcode[1];
		System.out.println(zipcode1+"-"+zipcode2);
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
		session.put("userCreditMon",creditMon);
		session.put("userCreditYear", creditYear);

		return SUCCESS;
	}



	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
