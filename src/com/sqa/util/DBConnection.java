package com.sqa.util;

import java.sql.Connection;
import java.sql.DriverManager;
//dung rôi o ơi
// sao bi nullpointer nhi
public class DBConnection {
	public static Connection createConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/managescore?autoReconnect=true&useSSL=false";
		String userName = "root";
		String password = "nhu01655230422";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		return con;
	}	
	
}
