package com.internousdev.webproj2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
		/**
		 * JDBCドライバー名
		 */
	private String driverName="com.mysql.jdbc.Driver";
	/**
	 * データベース接続URL
	 */
	private String url="jdbc:mysql://localhost/testdb";
	/**
	 * データベース接続ユーザー名
	 */
	private String user="root";
	/**
	 * データベース接続パスワード
	 */
	private String password="mysql";

	public Connection getConnection(){
		Connection con=null;
		try{
			Class.forName(driverName);
			con=DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
}
