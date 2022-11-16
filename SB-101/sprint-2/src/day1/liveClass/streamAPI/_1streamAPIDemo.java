package day1.liveClass.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _1streamAPIDemo {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("One","two","three","four");
		
		Stream<String> str1 = list.stream();  //can be called on any collection
		
		//str1.forEach(s -> System.out.println(s.toUpperCase()));  // terminal method
		 // stream will be consumed in terminal method
		
		str1.forEach(s -> System.out.println(s)); //throw exception because stream is consumed
	
		
		//intermiadiate method : 
		//filter() method : this method takes a predicate object as an argument and filter the stream based on the predicate condition and returns 
		// the filtered element in another stream object
		// it will not give the final output
		
		List<Student> students =new ArrayList<>();
		students.add(new Student(10, "Piyush1", 145));
		students.add(new Student(11, "Piyush5", 500));
		students.add(new Student(12, "Piyush4", 480));
		students.add(new Student(13, "Piyush8", 600));
		students.add(new Student(14, "Piyush9", 300));
		students.add(new Student(15, "N6", 256));
		
		//from the above list get another list of student whose marks is less than 500.
		
//		Stream<Student> s1 = students.stream();
//		Stream<Student> filtereds1 =   s1.filter(s -> s.getMarks() < 500);
//		
//		filtereds1.forEach(s -> System.out.println(s));
		
		//OR
		students.stream()
				.filter(s -> s.getMarks()<500)
				.forEach(s -> System.out.println(s));
		
		
		System.out.println("===================================================");
		
		//creating another list based on filtered element instead of printing them on the console : 
		
//		Stream<Student> s1 = students.stream();
//		Stream<Student> filtereds1 =   s1.filter(s -> s.getMarks() < 500);
//		
//		List<Student> filteredList =  filtereds1.collect(Collectors.toList());
		//OR
		
		List<Student> filteredList =students
										.stream()
										.filter(s -> s.getMarks() < 500)
										.collect(Collectors.toList()); //toSet is also their
		
		filteredList.forEach(s -> System.out.println(s));
		
		
	}
}
