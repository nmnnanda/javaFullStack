package com.learning.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RuntimeInsertion {
	   public static final String url = "jdbc:mysql://localhost:3306/jdbcData";
	   public static final String username = "root";
	   public static final String password = "root";
	   
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			String sql = "insert into stu_registration values (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the registration id :");
			int id = sc.nextInt();
			System.out.println("Enter the name :");
			String name = sc.next();
			System.out.println("Enter the course :");
			String course = sc.next();
			
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, course);
			int i = stmt.executeUpdate();
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
