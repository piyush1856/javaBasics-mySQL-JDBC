package day3.assingment._2QuestionNumber2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import day2.liveClass.Student;

public class Demo {

	public static void main(String[] args) {
		
		
		Predicate<Student> predicate = (Student s) -> {
			return s.getMarks()>=100;
		};
		boolean result =predicate.test(new Student(10, "Piyush", 60));
		System.out.println(result);
		
		System.out.println("==============================================");
		
		Supplier<Student> supplier = () -> {
			return new Student(20, "Tyagi", 89);
			
		};
		Student s =supplier.get();
		System.out.println(s);
		
		
		System.out.println("==============================================");
		
		Consumer<Student> consumer = (Student s1) -> {
			System.out.println("Hello from Consumer : " + s1.getName());
		};
		consumer.accept(new Student(54, "Piyush Tyagi", 230));
		
		System.out.println("==============================================");
		
		Function<Student, String> function = (Student s3) -> {
			return s3.getMarks()>= 500 ? "Pass" : "Fail";
		};
		String status = function.apply(new Student(89, "Piyush", 7000));
		System.out.println(status);

	}

}
