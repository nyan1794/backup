package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;







public class UserCreateCompleteDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil= new DateUtil();

	private String sql="INSERT INTO login_user_transaction(login_id,login_pass,user_name,insert_date) VALUES(?,?,?,?)";

	public void cerateUser(String loginUserId,String loginPassword,String userName) throws SQLException{
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,loginUserId);
			preparedStatement.setString(2,loginPassword);
			preparedStatement.setString(3,userName);
			preparedStatement.setString(4,dateUtil.getDate());

			ResultSet resultSet=preparedStatement.executeQuery();
			System.out.println(resultSet);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}
