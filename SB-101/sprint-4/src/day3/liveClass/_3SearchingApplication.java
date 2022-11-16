package day3.liveClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class _3SearchingApplication {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll to search");
		int roll = sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		String url = "jdbc:mysql://localhost:3306/sb101db";
		
		try (Connection conn = DriverManager.getConnection(url, "root", "1856");){
			
			PreparedStatement ps =  conn.prepareStatement("select * from student where roll = ?");
			ps.setInt(1, roll);
			
			
			ResultSet rs =  ps.executeQuery();
			
			if(rs.next()) {
				
				int r = rs.getInt("roll");
				String n= rs.getString("name");
				String a= rs.getString("address");
				int m= rs.getInt("marks");
				
				System.out.println("Roll is :"+r);
				System.out.println("Name is :"+n);
				System.out.println("Address is :"+a);
				System.out.println("Marks is :"+m);
				
				System.out.println("=========================");	
			}else {
				System.out.println("No student found ...");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}
