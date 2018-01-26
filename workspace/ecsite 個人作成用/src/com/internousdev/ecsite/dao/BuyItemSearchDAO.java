package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;


public class BuyItemSearchDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();


	public List<BuyItemDTO> searchBuyItem(String item_name) throws SQLException{
		String sql ="SELECT * FROM item_info_transaction WHERE item_name LIKE '%" +item_name+ "%' OR shop_name LIKE '%" +item_name+ "%'";
		List<BuyItemDTO> searchItemList = new ArrayList<>();
		try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
			BuyItemDTO buyItemDTO=new BuyItemDTO();
			buyItemDTO.setId(resultSet.getInt("id"));
			buyItemDTO.setItemName(resultSet.getString("item_name"));
			buyItemDTO.setItemPrice(resultSet.getInt("item_price"));
			buyItemDTO.setItemStock(resultSet.getInt("item_stock"));
			buyItemDTO.setShopName(resultSet.getString("shop_name"));
			searchItemList.add(buyItemDTO);
		}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}

		return searchItemList;
	}
}
