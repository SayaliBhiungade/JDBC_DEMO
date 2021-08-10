package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/telstra";
		String username = "root";
		String password = "Sayali@123";
		String deleteCommand = "DELETE from employee WHERE empid=8902";
		int i = 0;
		Connection cn = null;
		Statement st = null;
		try {
			cn=DriverManager.getConnection(url,username,password);
			st = cn.createStatement();
			i = st.executeUpdate(deleteCommand);
			System.out.println(i+ " Records deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
