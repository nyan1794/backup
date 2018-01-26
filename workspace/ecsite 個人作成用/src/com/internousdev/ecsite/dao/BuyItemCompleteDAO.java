package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class BuyItemCompleteDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO user_buy_item_transaction (item_transaction_id, total_item_price, total_count,shop_name, user_master_id,total_price, pay,order_num, insert_date) VALUES(?,?,?,?,?,?,?,?,?)";

	/**
	 * 商品購入情報登録メソッド
	 *
	 * @param item_transaction_id
	 * @param user_master_id
	 * @param total_price
	 * @param total_count
	 * @param pay
	 * @throws SQLException
	 */
	public int getOrderNumByDB(String orderNum){
		String sql ="SELECT order_num FROM user_buy_item_transaction WHERE order_num=?";
		int findCount=0;
		try{
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setString(1,orderNum);
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()){
				findCount=1;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return findCount;
	}
	public void buyItemeInfo(int item_transaction_id, String user_master_id, int total_item_price, int total_count,int total_price, String pay,String order_num,String shop_name) throws SQLException {

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, item_transaction_id);
			preparedStatement.setInt(2, total_item_price);
			preparedStatement.setInt(3, total_count);
			preparedStatement.setString(4,shop_name);
			preparedStatement.setString(5, user_master_id);
			preparedStatement.setInt(6,total_price);
			preparedStatement.setString(7, pay);
			preparedStatement.setString(8,order_num);
			preparedStatement.setString(9, dateUtil.getDate());

			preparedStatement.execute();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void updateItemInfo(int item_stock,int id)throws SQLException{
		String sql="UPDATE item_info_transaction SET item_stock=? ,update_date=? WHERE id=?";
		try{
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1,item_stock);
		preparedStatement.setString(2,dateUtil.getDate());
		preparedStatement.setInt(3,id);
		int res=preparedStatement.executeUpdate();
		System.out.println(res+"件の変更がありました");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public void buyItemeInfoClose(){
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
