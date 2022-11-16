package day3.liveClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import day2.liveClass.Student;

public class _1Lamda {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10,"N1",50000));
		students.add(new Student(11,"N2",52836));
		students.add(new Student(12,"N3",51436));
		students.add(new Student(13,"N4",50536));
		students.add(new Student(10,"N1",50000));
		
		
		//sorting using anonymous inner class
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getMarks()>o2.getMarks()? 1:-1;
			}
			
		});
		
		//sorting using lambda 
		
		Collections.sort(students, (s1,s2) -> {
			return s1.getMarks() > s2.getMarks() ? +1:-1;
		});
		
		//match lambda with inner class method for better understanding
		
		
		
		
	}
}
