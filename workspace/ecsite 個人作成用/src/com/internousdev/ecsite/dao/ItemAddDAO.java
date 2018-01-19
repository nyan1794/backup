package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ItemAddDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil=new DateUtil();

	public int addItem(String item_name,String item_price,String item_stock,String shop_name)throws SQLException{
		int result=0;
		String sql="INSERT INTO item_info_transaction(item_name,item_price,item_stock,shop_name,insert_date) VALUES(?,?,?,?,?)";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,item_name);
			preparedStatement.setString(2,item_price);
			preparedStatement.setString(3,item_stock);
			preparedStatement.setString(4,shop_name);
			preparedStatement.setString(5,dateUtil.getDate());
			result=preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;
	}
}
