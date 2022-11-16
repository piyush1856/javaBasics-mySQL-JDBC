package day1.assingment._4QuestionNumber4;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import day1.liveClass.streamAPI.Student;

public class Demo {

	public static void main(String[] args) {
		
		Set<Student> student = new LinkedHashSet<>();
		
		student.add(new Student(10, "Piyush", 320));
		student.add(new Student(10, "Piyush", 320));
		student.add(new Student(11, "Ashish", 220));
		student.add(new Student(12, "Prashant", 720));
		student.add(new Student(12, "Prashant", 720));
		student.add(new Student(13, "Bob", 520));
		student.add(new Student(14, "Gaurav", 120));
		
		Set<Student> filtredSet = student
										.stream()
										.filter(s -> s.getMarks() < 500)
										.collect(Collectors.toSet());
		
		filtredSet.forEach(s -> System.out.println(s));
		
	}
}
