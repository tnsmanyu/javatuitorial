package com.manyu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class TestDb {

	public static void main(String[] args) throws Exception {
		
	/* 	Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/msp?useSSL=false","msp","msp");
		
		Statement sqlstmt = conn.createStatement();
		
		ResultSet rs = sqlstmt.executeQuery("Select id, name from STUDENTS");
		
		while(rs!=null && rs.next()) {
		
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		
		}
		rs.close();
		sqlstmt.close();
		
		
		// this is mandatory
		conn.close();
		*/
		
		
		
		
		
		
		
		
		
		
		//registering driver
		Class.forName("com.mysql.jdbc.Driver");
		//		com.mysql.jdbc.Driver driver = new Driver();
		//		DriverManager.registerDriver(new com.mysql.jdbc.Driver());

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/msp?useSSL=false","msp","msp");

		PreparedStatement st1 = conn.prepareStatement("Insert into STUDENTS(id, name, age) value(?,?,?)");
		
		st1.setInt(1, 3);
		st1.setString(2, "rakesh");
		st1.setInt(3, 25);
		
		st1.executeUpdate();

		conn.close();













	}

}
