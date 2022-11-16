package day3.liveClass.FunctionalApplication;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import day2.liveClass.Student;

public class DemoConsumer {
	public static void main(String[] args) {
		
//		Consumer<String> c1 = new MyConsumer();
//		c1.accept("Ravi");
//		
//		Consumer<String> c2 = s -> System.out.println("Welcome using lamda " + s);
//		c2.accept("Piyush");
		
		
		
		//example 2
		Consumer<Student> c1 = new MyConsumer();
		c1.accept(new Student(10, "Piyush", 45));
		
		Consumer<Student> c2 = s -> System.out.println("Welcome using lambda "+ s.getName());
		c2.accept(new Student(20, "Tyagi", 50));
		
		
		
		
		//forEach
		List<String> names =  Arrays.asList("Amit","Ravi","Mohit", "Vijay");
		names.forEach(name -> System.out.println(name.toUpperCase()));
		
		names.forEach(System.out :: println); //method reference
		
		
		
	}
}
