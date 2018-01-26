package com.internousdev.ecsite.action;

import java.util.Random;

import com.internousdev.ecsite.util.MailSend;
import com.opensymphony.xwork2.ActionSupport;

public class ShopCreateEmailAction extends ActionSupport{
	private String shopName;
	private String shopId;
	private String shopPassword;
	private String shopEmail;
	private String shopCode;
	private String randNum;
	private MailSend mail = new MailSend();
	private String title="新店舗出店確認メールです。";

	public String execute(){
		setRandNum(CreateRandCode());
		mail.send(randNum, shopEmail, shopName, title);
		return SUCCESS;
	}


	public String CreateRandCode(){
		Random rand=new Random();
		int[] orderIntArray = new int[6];
		String[] orderStringArray = new String[6];
		String randNum="";
		for(int i=0;orderIntArray.length>i;i++){
			orderIntArray[i] =rand.nextInt(10);
			orderStringArray[i]=String.valueOf(orderIntArray[i]);
			randNum=randNum+orderStringArray[i];
		}
		return randNum;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopPassword() {
		return shopPassword;
	}

	public void setShopPassword(String shopPassword) {
		this.shopPassword = shopPassword;
	}

	public String getShopEmail() {
		return shopEmail;
	}

	public void setShopEmail(String shopEmail) {
		this.shopEmail = shopEmail;
	}

	public String getShopCode() {
		return shopCode;
	}

	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}


	public String getRandNum() {
		return randNum;
	}


	public void setRandNum(String randNum) {
		this.randNum = randNum;
	}
}
