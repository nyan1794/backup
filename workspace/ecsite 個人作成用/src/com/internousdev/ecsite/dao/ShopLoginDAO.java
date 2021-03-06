package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.ShopLoginDTO;
import com.internousdev.ecsite.dto.ShopSellItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ShopLoginDAO {
	private DBConnector dbConnector=new DBConnector();

	private ShopLoginDTO shopLoginDTO=new ShopLoginDTO();

	public ShopLoginDTO shopLoginSQL(String shopLoginId,String shopLoginPassword){
		String sql ="SELECT * FROM shop_login_transaction WHERE shop_id= ? AND shop_pass= ? ";
		Connection connection=dbConnector.getConnection();
			try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,shopLoginId);
			preparedStatement.setString(2,shopLoginPassword);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				shopLoginDTO.setShopLoginId(resultSet.getString("shop_id"));
				shopLoginDTO.setShopLoginPassword(resultSet.getString("shop_pass"));
				shopLoginDTO.setShopName(resultSet.getString("shop_name"));
				shopLoginDTO.setShopCode(resultSet.getString("shop_code"));
				shopLoginDTO.setShopLoginFlg(true);

			}else{
				shopLoginDTO.setShopLoginFlg(false);
			}
			}catch(SQLException e){
				e.printStackTrace();
			}
			try{
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			return shopLoginDTO;
	}
	public List<ShopSellItemDTO> getShopItemInfo(String shopName) throws SQLException{
		String sql="SELECT * FROM item_info_transaction WHERE shop_name=?";
		Connection connection=dbConnector.getConnection();
		List<ShopSellItemDTO> shopSellItemList =new ArrayList<ShopSellItemDTO>();
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,shopName);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				ShopSellItemDTO shopSellItemDTO=new ShopSellItemDTO();
				shopSellItemDTO.setId(resultSet.getInt("id"));
				shopSellItemDTO.setItemName(resultSet.getString("item_name"));
				shopSellItemDTO.setItemPrice(resultSet.getInt("item_price"));
				shopSellItemDTO.setItemStock(resultSet.getInt("item_stock"));
				shopSellItemDTO.setShopName(resultSet.getString("shop_name"));
				shopSellItemDTO.setInsertDate(resultSet.getString("insert_date"));
				shopSellItemDTO.setUpdateDate(resultSet.getString("update_date"));
				shopSellItemList.add(shopSellItemDTO);


			}

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return shopSellItemList;
	}

}
