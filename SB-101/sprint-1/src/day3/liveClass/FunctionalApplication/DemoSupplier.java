package day3.liveClass.FunctionalApplication;

import java.util.function.Supplier;

import day2.liveClass.Student;

public class DemoSupplier {
	
	public static int getNum() {
		return 1000;
	}
	
	
	public static void main(String[] args) {
		
		Supplier<String> s1 = new MySupplier();
		String s = s1.get();
		System.out.println(s);
		
		
		Supplier<String> string1 = () -> {
			return "message from labmda";
		};
		
		System.out.println(string1.get());
		
		
		Supplier<Student> student = () -> new Student(10, "Poyush", 69);
		System.out.println(student.get());
		
		
		Supplier<Integer> s4 = DemoSupplier :: getNum;
		System.out.println(s4.get());
		
	}
}
