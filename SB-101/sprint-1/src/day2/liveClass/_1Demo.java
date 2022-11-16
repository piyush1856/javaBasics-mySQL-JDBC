package day2.liveClass;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import day1.liveClass.Student;
import day1.liveClass.StudentMarksComp;

public class _1Demo {
	// In collection f/w we have two utility classes :
	// Arrays : it is used for normal array
	// Collection : it is used for collection framework relates classes
	
	// both classes provides lots of static method to perform utility operations.
	public static void main(String[] args) {
		
		int[] arr = {1,20,3,5,-1,-4,0};
		//System.out.println(arr);// [@jk4455
		
		//System.out.println(Arrays.toString(arr)); // print array
		
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr)); //internally use quick sort
		
		//int index = Arrays.binarySearch(arr, 5); // it will work on sorted array
		//System.out.println(index); // if element is not there it will give negative number
		
		List<String> cities = Arrays.asList("delhi","mumbai", "chennai", "kolkata", "delhi"); //shortcut to create a list
		
		List<Object> nums = Arrays.asList(1,2,3,4,"five");
		
		int result = Collections.frequency(cities, "delhi");
		System.out.println(result);
		
		//Collections.sort(cities);
		
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10, "n1", 780));
		students.add(new Student(8, "n2", 680));
		students.add(new Student(12, "n3", 880));
		students.add(new Student(14, "n4", 980));
		students.add(new Student(7, "n5", 180));
		
//		TreeSet<Student> ts = new TreeSet<>(students);
//		
//		System.out.println(ts);
		
		Collections.sort(students, new StudentMarksComp());
		System.out.println(students);
		
		
		Student minMarks =Collections.min(students, new StudentMarksComp());
		System.out.println(minMarks);
		// is same marks than it will give first element it will encounter
		
		
		
		
		
		
		

		
		
	}
}
