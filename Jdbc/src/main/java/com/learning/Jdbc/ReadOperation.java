package com.learning.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadOperation {
	   public static final String url = "jdbc:mysql://localhost:3306/jdbcData";
	   public static final String username = "root";
	   public static final String password = "root";
	public static void main(String[] args) {
		try {
			Class .forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			String sql = "select * from stu_registration";
			ResultSet resultSet = stmt.executeQuery(sql);
			while(resultSet.next()){
				System.out.println("ID :"+resultSet.getInt(1));
				System.out.println("Name :"+resultSet.getString(2));
				System.out.println("Course :"+resultSet.getString(3));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
