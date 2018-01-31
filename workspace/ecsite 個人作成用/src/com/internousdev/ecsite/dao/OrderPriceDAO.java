package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.OrderPriceDTO;
import com.internousdev.ecsite.util.DBConnector;

public class OrderPriceDAO {
	private DBConnector dbConnector = new DBConnector();
	private List<OrderPriceDTO> orderPriceList = new ArrayList<OrderPriceDTO>();


	public List<OrderPriceDTO> getShopOrderPrice(String user_master_id) throws SQLException{
		Connection connection = dbConnector.getConnection();
		String sql ="SUM(total_item_price) AS shop_order_total_price , shop_name FROM user_buy_item_transaction WHERE user_master_id = ? GROUP BY shop_name";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,user_master_id);
			ResultSet resultSet= preparedStatement.executeQuery();
			while(resultSet.next()){
				OrderPriceDTO orderPriceDTO = new OrderPriceDTO();
				orderPriceDTO.setShopName(resultSet.getString("shop_name"));
				orderPriceDTO.setOrderShopTotalPrice(resultSet.getString("shop_order_total_price"));
//ここに注文番号を持ってくる文を打つ
				orderPriceList.add(orderPriceDTO);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return orderPriceList;
	}
}
