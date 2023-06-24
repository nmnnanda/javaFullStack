 package com.learning.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperation {
	   public static final String url = "jdbc:mysql://localhost:3306/jdbcData";
	   public static final String username = "root";
	   public static final String password = "root";
	   static String sql = "select * from stu_registration";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			String query = "delete from stu_registration where id=102";
			int i = stmt.executeUpdate(query);
			System.out.println(i +"row deleted successfully");
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println("ID :"+rs.getInt(1));
				System.out.println("Name :"+rs.getString(2));
				System.out.println("Course :"+rs.getString(3));
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
