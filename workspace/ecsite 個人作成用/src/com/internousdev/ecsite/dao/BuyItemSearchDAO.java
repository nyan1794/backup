package com.internousdev.ecsite.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;


public class BuyItemSearchDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private List<BuyItemDTO> searchItemList = new ArrayList<>();

	private String sql ="SELECT * FROM item_info_transaction WHERE item_name LIKE '%?%'";
	public BuyItemDTO searchBuyItem(String item_name) throws SQLException{
		try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1,item_name);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
			BuyItemDTO buyItemDTO=new BuyItemDTO();
			buyItemDTO.setItemName(resultSet.getString("item_name"));
			buyItemDTO.setItemPrice(resultSet.getInt("item_price"));
			buyItemDTO.setItemStock(itemStock);
		}
		}
	}
}
