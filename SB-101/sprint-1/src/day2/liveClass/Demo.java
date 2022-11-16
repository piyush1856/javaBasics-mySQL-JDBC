package day2.liveClass;

public class Demo {
	public static void main(String[] args) {
		
//		Intr i1 = (String number) -> {
//			
//			int result = Integer.parseInt(number);
//			return result;
//		};
//		
//		System.out.println(i1.getTheNumber("100")+50);
		
		
		//method reference
		//Intr i2 = Integer::parseInt; //Referring to parseInt method of Integer class
		
		
		//example 2 
		
//		Intr i3 = (String s) -> {
//			System.out.println(s);
//		};
		//using lamda expression
		Intr i3 = s -> System.out.println(s);
		i3.printSomething("Hello");
		
		//method reference
		Intr i4 = System.out::println; //Referring println method of PrintStream object
		i4.printSomething("Welcome");
		
	}
}
