package sprint4Evaluation._3QuestionNumber3.usecases;

import java.util.Scanner;

import sprint4Evaluation._3QuestionNumber3.dao.ProductDaoImplementation;
import sprint4Evaluation._3QuestionNumber3.dao.ProductDaoInteraface;
import sprint4Evaluation._3QuestionNumber3.exceptions.ProductException;
import sprint4Evaluation._3QuestionNumber3.model.Product;

public class AddProductUseCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter productId ...");
		int pid= sc.nextInt();
		System.out.println("Enter Product name ...");
		String name  = sc.next();
		System.out.println("Enter price ...");
		int price= sc.nextInt();
		System.out.println("Enter quantity ...");
		int quantity= sc.nextInt();
		
		Product p = new Product(pid, name, price, quantity);
		
		ProductDaoInteraface dao = new ProductDaoImplementation();
		
		try {
			String res = dao.addProduct(p);
			System.out.println(res);
		} catch (ProductException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
