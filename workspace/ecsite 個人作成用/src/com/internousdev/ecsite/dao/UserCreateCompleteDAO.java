package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class UserCreateCompleteDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO login_user_transaction (login_id, login_pass,email, user_name,zipcode,prefecture,city,address,building,credit_num,credit_date, insert_date) "
			+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

	public int cerateUser(String loginUserId, String loginUserPassword,String email, String userName,String zipcode,String prefecture,String city,String address,String building,String credit_num,String credit_date) throws SQLException {

		int updateNum=0;
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginUserPassword);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, userName);
			preparedStatement.setString(5, zipcode);
			preparedStatement.setString(6, prefecture);
			preparedStatement.setString(7, city);
			preparedStatement.setString(8, address);
			preparedStatement.setString(9, building);
			preparedStatement.setString(10, credit_num);
			preparedStatement.setString(11, credit_date);
			preparedStatement.setString(12, dateUtil.getDate());

			updateNum=preparedStatement.executeUpdate();


		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return updateNum;
	}
}
