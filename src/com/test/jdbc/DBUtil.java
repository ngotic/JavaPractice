package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	public static Connection open() { // DB 연결하기 
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pw = "java1234";
		
		try {
			Connection conn = null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			return conn;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null; 
	} 
	
	public static Connection open(String server, String id, String pw) { // DB 연결하기 
		
		String url = "jdbc:oracle:thin:@"+server+":1521:xe";
		
		
		try {
			Connection conn = null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			return conn;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null; 
	} 
	
}
