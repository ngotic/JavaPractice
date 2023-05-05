package com.test.jdbc;

import java.sql.Connection;

import com.test.my.DBUtil;

public class Ex02 {
	public static void main(String[] args) {
		//Connection conn = DBUtil.open();
		Connection conn = DBUtil.open("192.168.10.11", "team", "java1234");
		try {
			System.out.println(conn.isClosed());
			conn.close(); // 자동으로 닫히긴 하는데 최대한 빨리 닫는게 좋음 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
