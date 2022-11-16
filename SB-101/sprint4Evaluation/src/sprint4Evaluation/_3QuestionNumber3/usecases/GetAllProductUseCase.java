package sprint4Evaluation._3QuestionNumber3.usecases;

import java.util.List;

import sprint4Evaluation._3QuestionNumber3.dao.ProductDaoImplementation;
import sprint4Evaluation._3QuestionNumber3.dao.ProductDaoInteraface;
import sprint4Evaluation._3QuestionNumber3.exceptions.ProductException;
import sprint4Evaluation._3QuestionNumber3.model.Product;

public class GetAllProductUseCase {
	
	public static void main(String[] args) {
		
		
		ProductDaoInteraface dao = new ProductDaoImplementation();
		
		try {
			List<Product> product = dao.getAllProducts();
			product.forEach(p -> System.out.println(p));
			
			
			
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
	}

}
