package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcSelectDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/company";
		String username = "root";
		String password = "Sayali@123";
		String selectCommand = "select * from products ";
		int i = 0;
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			cn=DriverManager.getConnection(url,username,password);
			st = cn.createStatement();
			rs = st.executeQuery(selectCommand);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String cost = rs.getString("cost");
				System.out.println(id+" "+name+" "+cost);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
