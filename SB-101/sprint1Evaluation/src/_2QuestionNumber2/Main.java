package _2QuestionNumber2;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Main {
	
	public static void printingByMethodReference(List<Product> list) {
		for(Product p : list) {
			System.out.println(p);
		}
	}
	
	
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "Pen", 100, 4));
		productList.add(new Product(2, "Pencil", 50, 1));
		productList.add(new Product(3, "Rubber", 300, 0));
		productList.add(new Product(4, "Sharpener", 200, 2));
		productList.add(new Product(5, "Scale", 20, 3));
		productList.add(new Product(6, "Compass", 1000, 5));
		
		
		//filtering
//		List<Product> filteredproductList = new ArrayList<>();
//		
//		productList.forEach(p -> {
//			if(p.getQuantity()<2) {
//				filteredproductList.add(p);
//			}
//		});
//		
//		for(Product p : filteredproductList) {
//			System.out.println(p);
//		}
		
		productList.removeIf(p -> p.getQuantity() < 2);
		
		
		System.out.println("============================================================");
		
		
		
		
		//sorting
		Collections.sort(productList,(p1,p2) ->{
			return p1.getPrice() > p2.getPrice() ? -1 : 1;
		});
		
//		for(Product p : productList) {
//			System.out.println(p);
//		}
		
		
		
		
		System.out.println("===============================================================");
		//print by method reference
		
		PrintList print = Main :: printingByMethodReference;
		print.printFromInterface(productList);
		
		
		
		
	}
}
