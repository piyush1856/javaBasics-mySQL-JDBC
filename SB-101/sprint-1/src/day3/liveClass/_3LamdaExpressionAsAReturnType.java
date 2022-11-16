package day3.liveClass;

import day2.liveClass.Intr;

public class _3LamdaExpressionAsAReturnType {
	
	Intr fun1() {
		System.out.println("Inside fun1");
		
		//return null;  // null or any implementation class object
		
		//return new IntrImpl();
		
//		Intr i1 = new IntrImpl();
//		return i1;
		
		
		//lambda
		
//		Intr i1 = (String s) -> {
//			System.out.println("Welcome using LE " + s);
//			
//		};
//		return i1;
		
		return s -> System.out.println("Welcome to LE " + s);
	}
	
	
	public static void main(String[] args) {
		_3LamdaExpressionAsAReturnType d1 = new _3LamdaExpressionAsAReturnType();
		
		//int x = d1.fun1(); //store in int or bigger than int
		
		Intr i2 =d1.fun1();
		
		i2.printSomething("Piyush");
		
		
		/*
		 * Some functional Interface in JAVA to perform functional programming :
		 * 
		 * these Interface belongs to "java.util.function" package
		 * 
		 * 1. Predicate(I);
		 * 2. Consumer(I);
		 * 3. Supplier(I);
		 * 4. Function(I);
		 * 
		 * These interfaces are generic type : 
		 *  1. Predict<T> : 
		 *  		This Interface has only one abstract method :
		 *  			public Predicate<T> {
		 *  				public boolean test(T t);
		 *  			};
		 *  			This test method checks whether supplied object id satisfying a condition or not.
		 *  			eg : test a Student if marks >=800
		 * 
		 * */
		
	}
}
