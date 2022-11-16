package day2.assingment._QuestionNumber2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/sb101db";
		
		
		
		
		int entry = 5;
		
		try (Connection conn = DriverManager.getConnection(url, "root", "1856");){
			
			//Write a Jdbc application to insert 5 different types of Products by taking input from the User
			while(entry -- !=0) {
				
				
				System.out.println("Enter Product ID");
				int pid = sc.nextInt();
				System.out.println("enter Product Name ");
				String name = sc.next();
				System.out.println("enter Quantity ");
				int quant = sc.nextInt();
				System.out.println("Enter price");
				int price = sc.nextInt();

				PreparedStatement ps =  conn.prepareStatement("insert into product values(?,?,?,?)");
				
				ps.setInt(1, pid);
				ps.setString(2, name);
				ps.setInt(3, quant);
				ps.setInt(4, price);
				
				int x = ps.executeUpdate();
				
				if(x>0) {
					System.out.println("done");
				}else {
					System.out.println("Not done");
				}	
			}
			
			
//			//Write a Jdbc application to insert a new Product without quantity and price by taking input from the user.
			System.out.println("Enter Product ID");
			int pid2 = sc.nextInt();
			System.out.println("enter Product Name ");
			String name2 = sc.next();
			
			PreparedStatement ps2 =  conn.prepareStatement("insert into product(pid,pname) values(?,?)");
			ps2.setInt(1, pid2);
			ps2.setString(2, name2);
			
			int y = ps2.executeUpdate();
			
			if(y>0) {
				System.out.println("done");
			}else {
				System.out.println("Not done");
			}
			
			
			//Write a Jdbc application to update the price and quantity of a product by taking the input from the user.
			System.out.println("enter Quantity ");
			int quant2 = sc.nextInt();
			System.out.println("Enter price");
			int price2 = sc.nextInt();
			
			
			PreparedStatement ps3 =  conn.prepareStatement("update product set quantity = ?, price = ? where pid =6");
			ps3.setInt(1, quant2);
			ps3.setInt(2, price2);
			
			int z = ps3.executeUpdate();
			
			if(z>0) {
				System.out.println("updated");
			}else {
				System.out.println("Not updated");
			}
			
			
			
//			Write a Jdbc application to delete all the Products whose quantity is less than 2.
			PreparedStatement ps4 =  conn.prepareStatement("delete from product where quantity < 2");
			int w = ps4.executeUpdate();
			if(w>0) {
				System.out.println("deleted ..");
			}else {
				System.out.println("not deleted ..");
			}
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}

}
