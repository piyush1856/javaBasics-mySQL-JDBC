package day3.liveClass.FunctionalApplication;

import java.util.function.Function;

import day2.liveClass.Student;

public class DemoFunction {
	public static void main(String[] args) {
		
		Function< Student, String> f1 = new MyFunction();
		String result = f1.apply(new Student(10, "piyush", 600));
		
		System.out.println(result);
		
		
		
		Function<Student, String> f2 = s -> s.getMarks()>500 ? "Pass" : "Fail";
		String result2 = f2.apply(new Student(12, "Tyagi", 400));
		System.out.println(result2);
		
	}
}
