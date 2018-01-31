package com.internousdev.ecsite.util;

public class CreateOrderMailBody {
	public String mailCreate(String[] itemName,String[] itemCount,String[] itemTotalPrice,String[] shopName,String OrderTotalPrice,String allAddress,String[] pay){
		String itemInfo="ご注文ありがとうございます。\n今回の注文内容は以下になります。\n------------------\n";
		for(int i =0;itemName.length > i;i++){
			itemInfo =itemInfo+"商品名:"+itemName[i]+"\n購入個数"+itemCount[i]+"個\n商品合計金額:"+itemTotalPrice[i]+"円\n販売店舗:"+shopName[i]+"\n--------------------\n";
		}
		itemInfo=itemInfo+"合計金額:"+OrderTotalPrice+"円\n"+allAddress;
		return itemInfo;
	}

}
