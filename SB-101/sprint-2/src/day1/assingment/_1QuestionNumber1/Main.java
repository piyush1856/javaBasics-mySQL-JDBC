package day1.assingment._1QuestionNumber1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		
		List<Product> product=new ArrayList<>();
		
		product.add(new Product(31,"laptop",90000,2));
		product.add(new Product(31,"Jacket",5000,15));
		product.add(new Product(62,"pencil",400,30));
		product.add(new Product(86,"rubber",700,20));
		product.add(new Product(12,"clip",300,4));
		
		
		//filtering
		List<Product> filterByQuantity =  product
											  .stream()
											  .filter(p -> p.getQuantity() > 10)
											  .collect(Collectors.toList());
		
		//sorting
		
		Collections.sort(filterByQuantity, (p1,p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1);
		
		//printing
		
		product.forEach(p -> System.out.println(p));
		
		System.out.println("=========================================================");
		
		filterByQuantity.forEach(p -> System.out.println(p));
	}
}
