package _1QuestionNumber1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		System.out.println("=========== Predicate =============");
		
		Predicate<Student> predicateVariable = (Student s) -> {
			return s.getMarks()<500;
		};
		
		boolean result = predicateVariable.test(new Student(10, "Piyush", 400));
		System.out.println(result);
		
		
		
		System.out.println("=========== Consumer =============");
		
		
		
		Consumer<Student> consumerVariable = (Student s1) -> {
			System.out.println("Roll No : " + s1.getRoll());
			System.out.println("Name : " + s1.getName());
			System.out.println("Marks : " + s1.getMarks());
		};
		
		consumerVariable.accept(new Student(56, "Piyush", 500));
		
		
		
		System.out.println("============== Supplier ================");
		
		
		
		
		Supplier<Student> supplierVariable = () -> {
			return new Student(85, "Tyagi", 895);
		};
		Student s3 = supplierVariable.get();
		System.out.println(s3);
		
		
		
		System.out.println("=============== Function ===============");
		
		
		Function<String, Integer> functionVariable = (String str) -> {
			return Integer.parseInt(str);
		};
		Integer result2 = functionVariable.apply("587");
		System.out.println(result2);
				
	}
}
