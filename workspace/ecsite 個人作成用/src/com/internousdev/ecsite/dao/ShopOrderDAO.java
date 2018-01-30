package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ShopOrderDAO {
	private DBConnector dbConnector=new DBConnector();
	private DateUtil dateUtil = new DateUtil();

	public int shopOrderResult(
			String shop_name,String item_id,String item_name,String item_price,String item_count,String item_total_price,
			String shop_order_total_price,String order_num,String buy_zipcode,String buy_prefecture,String buy_city,
			String buy_address,String buy_building,String buy_user_name,String buy_user_id) throws SQLException{

		int result = 0;
		Connection connection = dbConnector.getConnection();
		String sql="INSERT INTO shop_order_transaction(shop_name,item_id,item_name,item_count,item_total_price,"
				+ "shop_order_total_price,order_num,buy_zipcode,buy_prefecture,buy_city,buy_address,buy_building,buy_user_name,buy_user_id,buy_date) "
				+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,shop_name);
			preparedStatement.setString(2,item_id);
			preparedStatement.setString(3,item_name);
			preparedStatement.setString(4,item_count);
			preparedStatement.setString(5,item_total_price);
			preparedStatement.setString(6,shop_order_total_price);
			preparedStatement.setString(7,order_num);
			preparedStatement.setString(8,buy_zipcode);
			preparedStatement.setString(9,buy_prefecture);
			preparedStatement.setString(10,buy_city);
			preparedStatement.setString(11,buy_address);
			preparedStatement.setString(12,buy_building);
			preparedStatement.setString(13,buy_user_name);
			preparedStatement.setString(14,buy_user_id);
			preparedStatement.setString(15,dateUtil.getDate());
			result = preparedStatement.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}

		return result;
	}
}
