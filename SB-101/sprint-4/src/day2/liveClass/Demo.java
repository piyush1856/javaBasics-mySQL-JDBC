package day2.liveClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Demo {
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
		
		
		//optional but recommended
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//or
//			com.mysql.cj.jdbc.Driver d = new Driver();
//			DriverManager.registerDriver(d);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Couldn't load driver main class ..");
		}
		
		
		
		
		String url = "jdbc:mysql://localhost:3306/sb101db";
		//Connection conn = null;
		try (Connection conn = DriverManager.getConnection(url, "root", "1856");){
			//Connection conn = DriverManager.getConnection(url, "root", "1856");
			
//			if(conn != null) {
//				System.out.println("Connected ..");
//				System.out.println(conn.getClass().getName());
//			}else {
//				System.out.println("Not Connected ..");
//			}
			
			Statement st = conn.createStatement();
			
			
			
			//insertion
			int x = st.executeUpdate("insert into student values("+roll+",'"+name+"','"+address+"',"+marks+")");
			//int x = st.executeUpdate("delete from student where marks >700");
			if(x>0) {
				System.out.println(x + " record inserted ...");
			}else{
				System.out.println("failed ..");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		
		
		
		
	}
}
