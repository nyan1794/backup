package com.internousdev.ganbaru.action;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	public String execute(){
		String result="login";
		if(session.containsKey("id")){
			
		}
	}
}
