package sprint4Evaluation._3QuestionNumber3.usecases;

import java.util.List;
import java.util.Scanner;

import sprint4Evaluation._3QuestionNumber3.dao.ProductDaoImplementation;
import sprint4Evaluation._3QuestionNumber3.dao.ProductDaoInteraface;
import sprint4Evaluation._3QuestionNumber3.exceptions.ProductException;
import sprint4Evaluation._3QuestionNumber3.model.Product;

public class GetAllProductQuantityLessThanUseCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter quantity");
		int quant = sc.nextInt();

		ProductDaoInteraface dao = new ProductDaoImplementation();
		
		try {
			List<Product> product = dao.getAllProductQuantityLessThan(quant);
			product.forEach(p -> System.out.println(p));
			
			
			
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
