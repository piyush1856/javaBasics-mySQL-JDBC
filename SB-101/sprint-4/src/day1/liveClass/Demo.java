package day1.liveClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) {
		
		//loading the driver related main class into the memory
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Couldn't load driver main class ..");
		}
		
		
		String url = "jdbc:mysql://localhost:3306/sb101db";
		
		try {
			Connection conn = DriverManager.getConnection(url, "root", "1856");
			
			if(conn != null) {
				System.out.println("Connected ..");
			}else {
				System.out.println("Not Connected ..");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
