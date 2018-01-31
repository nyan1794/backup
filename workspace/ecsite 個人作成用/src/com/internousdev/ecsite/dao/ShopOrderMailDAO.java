package com.internousdev.ecsite.dao;

import com.internousdev.ecsite.util.DBConnector;

public class ShopOrderMailDAO {
	private DBConnector dbConnector=new DBConnector();
	public selectShopOrderForMail(){
		Connection connection = dbConnector.getConnection();
		String sql="SELECT * FROM shop_order_transaction WHERE "
	}
}
