package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ShopItemUpdateDAO {
	public int updateItem(String newItemName,String newItemPrice,String newItemStock,String oldItemName,String oldItemPrice,String oldItemStock) throws SQLException{
	DBConnector dbConnector=new DBConnector();
	Connection connection= dbConnector.getConnection();
	DateUtil dateUtil=new DateUtil();
	int result = 0;

	String sql= "UPDATE item_info_transaction SET item_name = ? ,item_price = ? ,item_stock = ?,update_date=? WHERE item_name=? AND item_price = ? AND item_stock = ?";
	try{
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1,newItemName);
		preparedStatement.setString(2,newItemPrice);
		preparedStatement.setString(3,newItemStock);
		preparedStatement.setString(4,dateUtil.getDate());
		preparedStatement.setString(5,oldItemName);
		preparedStatement.setString(6,oldItemPrice);
		preparedStatement.setString(7,oldItemStock);
		result= preparedStatement.executeUpdate();
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		connection.close();
	}
	return result;
	}
}
