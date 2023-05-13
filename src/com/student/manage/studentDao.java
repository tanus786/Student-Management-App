package com.student.manage;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class studentDao {
	public static boolean insertStudentToDB(student st) {
		//JDBC code
		boolean f = false;
		try {
			Connection con = CP.createC();
			String q = "insert into student(sname,sphone,sage,scity) values(?,?,?,?)"; 
			//PreparedStatement
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//set the value of parameter
			
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setInt(3, st.getStudentAge());
			pstmt.setString(4, st.getStudentCity());
			
			//execute query
			
			pstmt.executeUpdate();
			f = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userID) {
		boolean f = false;
		try {
			Connection con = CP.createC();
			String q = "delete from student where sid = ?"; 
			//PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the value of parameter
			pstmt.setInt(1, userID);
			//execute query
			pstmt.executeUpdate();
			f = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void displayStudent() {
		try {
			Connection con = CP.createC();
			String q = "select * from student"; 
			Statement stmt = con.createStatement();
			ResultSet set= stmt.executeQuery(q);
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				int age = set.getInt(4);
				String city = set.getString(5);
				
				System.out.println("Id:"+id);
				System.out.println("Name:"+name);
				System.out.println("Phone:"+phone);
				System.out.println("Age:"+age);
				System.out.println("City:"+city);
				System.out.println("-------------------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
}
