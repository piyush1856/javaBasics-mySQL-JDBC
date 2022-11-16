package day3.liveClass.FunctionalApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import day2.liveClass.Student;

public class DemoPredicate {

	public static void main(String[] args) {
		
//		Predicate<Integer> p1 = new MyPredicate();
//		System.out.println(p1.test(-10));
//		
//		Predicate<Integer> p2 = (Integer i) -> {
//			return i>=0;
//		};
//		System.out.println(p2.test(100));
//		
//		
//		Predicate<Integer> p3 = i -> i>=0;
//		System.out.println(p3.test(0));
		
		
		
		
		//for student class as generic
//		Predicate<Student> p1 = new MyPredicate();
//		System.out.println(p1.test(new Student(10, "N1", 600)));
//		
//		
//		Predicate<Student> p2 = s -> s.getMarks()>=800;
//		System.out.println(p2.test(new Student(10, "N2", 1000)));
		
		
		
		//removeIf
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10,"N1",500));
		students.add(new Student(11,"N2",428));
		students.add(new Student(12,"N3",714));
		students.add(new Student(13,"N4",805));
		students.add(new Student(10,"N1",300));
		
		//students.removeIf(new MyPredicate());  // external class
		
		students.removeIf(s -> s.getMarks()<=500); //lambda way predicate object
		
		for(Student s : students) {
			System.out.println(s);
		}
		
		students.forEach(s -> {
			System.out.println(s.getName());
		});
		
	}

}
