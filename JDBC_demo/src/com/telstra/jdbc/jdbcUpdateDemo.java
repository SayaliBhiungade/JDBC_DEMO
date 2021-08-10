package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUpdateDemo {

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
		String updateCommand = "UPDATE employee SET designation='Sr Manager' WHERE empid=8902";
		int i = 0;
		Connection cn = null;
		Statement st = null;
		try {
			cn=DriverManager.getConnection(url,username,password);
			st = cn.createStatement();
			i = st.executeUpdate(updateCommand);
			System.out.println(i+ " Records updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
