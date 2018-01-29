package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.AddressDTO;
import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class AddAddressDAO {

	private DateUtil dateUtil=new DateUtil();
	private List<AddressDTO> addressList = new ArrayList<AddressDTO>();

	public int addAddressSQL(String user_master_id,String zipcode,String prefecture,String city,String address,String building) throws SQLException{
		int resultInt=0;
		DBConnector dbConnector= new DBConnector();
		Connection connection=dbConnector.getConnection();
		String sql="INSERT INTO user_address_transaction(user_master_id,zipcode,prefecture,city,address,building,insert_date) VALUES(?,?,?,?,?,?,?)";;
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,user_master_id);
			preparedStatement.setString(2,zipcode);
			preparedStatement.setString(3,prefecture);
			preparedStatement.setString(4,city);
			preparedStatement.setString(5,address);
			preparedStatement.setString(6,building);
			preparedStatement.setString(7,dateUtil.getDate());
			resultInt = preparedStatement.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return resultInt;
	}

	public List<AddressDTO> selectAddressTable(String user_master_id) throws SQLException{
		DBConnector dbConnector= new DBConnector();
		Connection connection=dbConnector.getConnection();
		String sql="SELECT * FROM user_address_transaction WHERE user_master_id=?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,user_master_id);
		 	ResultSet resultSet = preparedStatement.executeQuery();
		 	while(resultSet.next()){
		 		AddressDTO addressDTO=new AddressDTO();
				addressDTO.setUserId(resultSet.getString("user_master_id"));
				addressDTO.setZipcode(resultSet.getString("zipcode"));
				addressDTO.setPrefecture(resultSet.getString("prefecture"));
				addressDTO.setCity(resultSet.getString("city"));
				addressDTO.setAddress(resultSet.getString("address"));
				addressDTO.setBuilding(resultSet.getString("building"));
				addressList.add(addressDTO);
		 	}

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return addressList;
	}

}
