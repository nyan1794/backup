package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ShopCreateDAO {
	private DBConnector dbConnector = new DBConnector();
	private DateUtil dateUtil=new DateUtil();
	private Connection connection = dbConnector.getConnection();
	private String sql = "INSERT INTO shop_login_transaction(shop_id,shop_pass,shop_name,shop_email,shop_code,create_date) VALUES(?,?,?,?,?,?)";
	public int createShopSQL(String shop_id,String shop_pass,String shop_name,String shop_email,String shop_code) throws SQLException{
		int result =0;
		try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1,shop_id);
		preparedStatement.setString(2,shop_pass);
		preparedStatement.setString(3,shop_name);
		preparedStatement.setString(4,shop_email);
		preparedStatement.setString(5,shop_code);
		preparedStatement.setString(6,dateUtil.getDate());
		result = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;
	}
}
