package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class ShopCreateConfirmAction extends ActionSupport{
	private String shopName;
	private String shopId;
	private String shopPassword;
	private String shopEmail;
	private String shopCode;
	private List<String> errorMassage=new ArrayList<String>();

	public String execute(){
		String result = SUCCESS;
		if(shopName.equals("")){
			errorMassage.add("店舗名を入力してください");
			result = ERROR;
		}
		if(!(shopId.matches("^[0-9a-zA-Z]{1,20}"))){
			errorMassage.add("店舗IDは半角英数字で20文字以内で入力してください。");
			result = ERROR;
		}
		if(!(shopPassword.matches("^[0-9a-zA-Z]{1,20}"))){
			errorMassage.add("店舗パスワードは半角英数字で20文字以内で入力してください。");
			result = ERROR;
		}
		if(!(shopEmail.matches("^.*@.*$"))){
			errorMassage.add("メールアドレスの形式が間違っています。");
			result = ERROR;
		}
		if(!(shopCode.matches("^[0-9]{4}"))){
			errorMassage.add("店舗コードは4桁の半角数字で入力してください");
			result = ERROR;
		}
		System.out.println(errorMassage.size());
		return result;
	}

	public List<String> getErrorMassage() {
		return errorMassage;
	}

	public void setErrorMassage(List<String> errorMassage) {
		this.errorMassage = errorMassage;
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


}
