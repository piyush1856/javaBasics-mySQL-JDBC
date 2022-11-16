package day2.assingment._4QuestionNumber4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
		
		productList.add(new Product(1, "Shoes", 10, 4999));
		productList.add(new Product(2, "Jeans", 11, 3999));
		productList.add(new Product(3, "Jacket", 12, 7999));
		productList.add(new Product(4, "Shirt", 13, 1999));
		productList.add(new Product(5, "Sunglasses", 14, 5999));
		
		
		Collections.sort(productList,(p1,p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1);
		
		for(Product p : productList) {
			System.out.println(p);
		}
	}
}
