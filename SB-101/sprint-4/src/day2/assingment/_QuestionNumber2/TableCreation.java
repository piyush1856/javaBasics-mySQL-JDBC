package day2.assingment._QuestionNumber2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TableCreation {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/sb101db";
		
		
		try (Connection conn = DriverManager.getConnection(url, "root", "1856")){
			
			PreparedStatement ps =  conn.prepareStatement("create table product(pid int primary key,pname varchar(12) not null, quantity int, price int)");
			
			boolean x = ps.execute();
			
			if(x == false) {
				System.out.println("not done ..");
			}else {
				System.out.println("done ..");
			}
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
