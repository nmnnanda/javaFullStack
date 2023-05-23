package com.learning.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {
   public static final String url = "jdbc:mysql://localhost:3306/jdbcData";
   public static final String username = "root";
   public static final String password = "root";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			String query = "insert into stu_registration values(101,'Akshay','JavaEE')";
			
			int i = stmt.executeUpdate(query);
			System.out.println(i+" rows affected");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
