package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con = null;
	public static Connection createC(){
		
		try {
			// load the driver
//			com.mysql.cj.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create the connection
			String user = "root";
			String password = "Tanu@123#!#";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			
			con = DriverManager.getConnection(url,user,password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}
