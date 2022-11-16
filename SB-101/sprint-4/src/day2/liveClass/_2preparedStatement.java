package day2.liveClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class _2preparedStatement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter roll");
		int roll = sc.nextInt();
		System.out.println("enter name ");
		String name = sc.next();
		System.out.println("enter address ");
		String address = sc.next();
		System.out.println("Enter marks");
		int marks = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		String url = "jdbc:mysql://localhost:3306/sb101db";
		
		try (Connection conn = DriverManager.getConnection(url, "root", "1856");){
			
			PreparedStatement ps =  conn.prepareStatement("insert into student values(?,?,?,?)");
			
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setInt(4, marks);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				System.out.println("done");
			}else {
				System.out.println("Not done");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

	


}
