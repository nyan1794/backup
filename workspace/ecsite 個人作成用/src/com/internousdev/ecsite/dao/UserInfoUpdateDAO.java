package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class UserInfoUpdateDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil=new DateUtil();
	private String sql="UPDATE login_user_transaction SET login_id=? , login_pass=? , email=? , user_name=? ,"
			+ "zipcode=? , prefecture=? , city=? , address=? , building=? , credit_num=? , credit_date=? , updated_date=? "
			+ "WHERE login_id = ? AND login_pass=?";
	public int userInfoUpdateSQL(String login_id,String login_pass,String email,String user_name,String zipcode,String prefecture,String city,String address,
								String building,String credit_num,String credit_date,String oldLoginId,String oldLoginPass) throws SQLException{
		int result=0;
		try{
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1,login_id);
		preparedStatement.setString(2,login_pass);
		preparedStatement.setString(3,email);
		preparedStatement.setString(4,user_name);
		preparedStatement.setString(5,zipcode);
		preparedStatement.setString(6,prefecture);
		preparedStatement.setString(7,city);
		preparedStatement.setString(8,address);
		preparedStatement.setString(9,building);
		preparedStatement.setString(10,credit_num);
		preparedStatement.setString(11,credit_date);
		preparedStatement.setString(12,dateUtil.getDate());
		preparedStatement.setString(13,oldLoginId);
		preparedStatement.setString(14,oldLoginPass);
		result = preparedStatement.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}

		return result;
	}

}
