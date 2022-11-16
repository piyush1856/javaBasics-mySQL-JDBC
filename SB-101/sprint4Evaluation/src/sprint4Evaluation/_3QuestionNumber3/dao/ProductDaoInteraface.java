package sprint4Evaluation._3QuestionNumber3.dao;

import java.util.List;

import sprint4Evaluation._3QuestionNumber3.exceptions.ProductException;
import sprint4Evaluation._3QuestionNumber3.model.Product;

public interface ProductDaoInteraface {

	
	
	
	public String addProduct(Product product) throws ProductException;
	
	public List<Product> getAllProducts() throws ProductException;
	
	public List<Product> getAllProductQuantityLessThan(int quantity)throws ProductException;

	public String addProductQuantity(int productId, int Quantity)throws ProductException;



}
