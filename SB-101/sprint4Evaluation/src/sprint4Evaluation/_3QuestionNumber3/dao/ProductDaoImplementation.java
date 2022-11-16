package sprint4Evaluation._3QuestionNumber3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sprint4Evaluation._1QuestionNumber1.utility.DBUtility;
import sprint4Evaluation._3QuestionNumber3.exceptions.ProductException;
import sprint4Evaluation._3QuestionNumber3.model.Product;

public class ProductDaoImplementation implements ProductDaoInteraface{

	@Override
	public String addProduct(Product product) throws ProductException {
		String result = "Not added";
		
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setInt(3, product.getPrice());
			ps.setInt(4, product.getQuatity());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				result = "inserted";
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new ProductException("Cannot Insert ..");
		}
		
		
		return result;
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		List<Product> product = new ArrayList<>();
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from product");
			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int d = rs.getInt("productId");
				String n = rs.getString("productName");
				int p = rs.getInt("price");
				int q = rs.getInt("quantity");
				
				Product pro = new Product(d, n, p, q);
				product.add(pro);
				
				
			}

			
			
			
			
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new ProductException("No product ..");
		
		}
		
		
		
		if(product.size()==0){
			throw new ProductException("No product found ..");
		}
		
		
		
		
		return product;
	}

	@Override
	public List<Product> getAllProductQuantityLessThan(int quantity) throws ProductException {
		
		List<Product> product = new ArrayList<>();
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from product where quantity < ?");
			ps.setInt(1, quantity);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int d = rs.getInt("productId");
				String n = rs.getString("productName");
				int p = rs.getInt("price");
				int q = rs.getInt("quantity");
				
				Product pro = new Product(d, n, p, q);
				product.add(pro);
				
				
			}

			
			
			
			
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new ProductException("No product ..");
		
		}
		
		
		
		if(product.size()==0){
			throw new ProductException("No product found ..");
		}
		
		
		
		
		return product;
		
		
		
	}

	@Override
	public String addProductQuantity(int productId, int Quantity) throws ProductException {

		String result = "Not updated ..";
		
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update product set quantity = ? where  productid = ?");
			ps.setInt(1, Quantity);
			ps.setInt(2, productId);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				result = "updated ..";
			}
			
			
			
			
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
			throw new ProductException("Nor Updated ...");
		}
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	

}
