package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();



	/**
	 * 商品情報取得メソッド
	 *
	 * @return BuyItemDTO
	 */
	public List<BuyItemDTO> getBuyItemInfo() {

		String sql = "SELECT id, item_name, item_price,item_stock FROM item_info_transaction";
		List<BuyItemDTO> buyItemList=new ArrayList<BuyItemDTO>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				BuyItemDTO buyItemDTO=new BuyItemDTO();
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(Integer.parseInt(resultSet.getString("item_price")));
				buyItemDTO.setItemStock(resultSet.getInt("item_stock"));
				buyItemList.add(buyItemDTO);

			}
		} catch(Exception e) {
			e.printStackTrace();
		}

		return buyItemList;
	}


}