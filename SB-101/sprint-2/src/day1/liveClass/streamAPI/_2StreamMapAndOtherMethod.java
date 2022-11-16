package day1.liveClass.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _2StreamMapAndOtherMethod {
	public static void main(String[] args) {
		// map() method : it is also intermediate method
		//this method is used to transform the object
		// this method takes java.util.function.Function(I) object as an argument and map/transform the element to a new element and returns
		//map element in another stream.
		
		List<Student> students =new ArrayList<>();
		
		students.add(new Student(10, "Piyush1", 145));
		students.add(new Student(11, "Piyush5", 500));
		students.add(new Student(12, "Piyush4", 480));
		students.add(new Student(13, "Piyush8", 600));
		students.add(new Student(14, "Piyush9", 300));
		students.add(new Student(15, "N6", 256));
		
		//from the above list give the 50 grace marks to all the students and get the another list of updated students.
		
		Stream<Student> str1 = students.stream();
		
//		Stream<Student> str2 = str1.map(s -> {
//			Student s2 = new Student(s.getRoll(), s.getName(), s.getMarks()+50);
//			return s2;
//		});
		//OR
		Stream<Student> str2 =  str1.map(s -> new Student(s.getRoll(), s.getName(), s.getMarks()+50));
		List<Student> modifiedList =  str2.collect(Collectors.toList());
		
		
		//functional style :
		
		List<Student> modifiedList2 =  students
											.stream()
											.map(s -> new Student(s.getRoll(), s.getName(), s.getMarks()+50))
											.collect(Collectors.toList());
		
		modifiedList2.forEach(s -> System.out.println(s));
		
		System.out.println("=================================================");
		
		//only less than 500
		List<Student> modifiedList3 =  students
											.stream()
											.filter(s -> s.getMarks()<500)
											.map(s -> new Student(s.getRoll(), s.getName(), s.getMarks()+50))
											.collect(Collectors.toList());
		
		modifiedList3.forEach(s -> System.out.println(s));
		
		System.out.println("   ===========================================================================");
		
		
		//min-max method
		//this method is also terminal method which will take a comparator object, using which we can decide max and min element
		// these method will return min and max object in the form of java.util.Optional class object
		//this class is introduced in java 1.8 version, and it is basically used to avoid null pointer exception
		// to get element from optional call we need to call get method
		
		//if(opt.isPresent())
		
		Optional<Student> opt = students.stream().max((s1,s2) -> s1.getMarks() > s2.getMarks() ? +1 : -1);
		Student max = opt.get();
		System.out.println(max);
		
		
		System.out.println("======================================================");
		
		
		//count method -- terminal method
		long count = students.stream().filter(s -> s.getMarks() < 500).count();
		System.out.println(count);
		
		
		System.out.println("======================================================");
		
		
		//allMatch(), anyMatch(), noneMatch()
		
		boolean b = students.stream().allMatch(s -> s.getMarks()<500);
		System.out.println(b);
		
		boolean b1 = students.stream().anyMatch(s -> s.getMarks()<500);
		System.out.println(b1);
		
		boolean b2 = students.stream().noneMatch(s -> s.getMarks()<500);
		System.out.println(b2);
		
		
		System.out.println("==========================================================");
		
		
		//add marks of all students
		int x =students.stream().collect(Collectors.summingInt(s -> s.getMarks()));
		System.out.println(x);
	}
}
