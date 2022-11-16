package day3.liveClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class _1DRLOperations {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		String url = "jdbc:mysql://localhost:3306/sb101db";
		
		try (Connection conn = DriverManager.getConnection(url, "root", "1856");){
			
			PreparedStatement ps =  conn.prepareStatement("select * from student");
			ResultSet rs =  ps.executeQuery();
			
			while(rs.next()) {
				
				int r = rs.getInt("roll");
				String n= rs.getString("name");
				String a= rs.getString("address");
				int m= rs.getInt("marks");
				
				System.out.println("Roll is :"+r);
				System.out.println("Name is :"+n);
				System.out.println("Address is :"+a);
				System.out.println("Marks is :"+m);
				
				System.out.println("=========================");	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
