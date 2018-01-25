package com.internousdev.ecsite.action;

import java.util.Map;
import java.util.Random;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.util.MailSend;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoUpdateEmailAction extends ActionSupport implements SessionAware{
	public Map<String ,Object> session;

	public String execute(){
	MailSend mailSend = new MailSend();
	String userName=session.get("newUserName").toString();
	String mailAddress=session.get("newUserEmail").toString();
	String RandMessage=RandNum();
	String title="ユーザー情報変更認証メール";
	mailSend.send(RandMessage, mailAddress, userName,title);
	session.put("RandNum", RandMessage);


	return SUCCESS;
	}
	public String RandNum(){
		Random rand=new Random();
		int[] orderIntArray= new int[6];
		String[] orderStringArray = new String[6];
		String RandNum="";
		for(int i=0 ; orderStringArray.length>i;i++){
			orderIntArray[i]=rand.nextInt(10);
			orderStringArray[i]=String.valueOf(orderIntArray[i]);
			RandNum=RandNum+orderStringArray[i];
		}
		return RandNum;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
