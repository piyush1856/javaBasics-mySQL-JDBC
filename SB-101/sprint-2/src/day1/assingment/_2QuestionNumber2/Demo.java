package day1.assingment._2QuestionNumber2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import day1.liveClass.streamAPI.Student;

public class Demo {
	public static void main(String[] args) {
		
		List<Student> student = new ArrayList<>();
		
		student.add(new Student(10, "Piyush", 32));
		student.add(new Student(11, "Ashish", 62));
		student.add(new Student(12, "Prashant", 72));
		student.add(new Student(13, "Bob", 52));
		student.add(new Student(14, "Gaurav", 12));
		
		Optional<Student> maxMark = student
										.stream()
										.max((s1,s2) -> s1.getMarks() > s2.getMarks() ? 1 : -1);
		
		Student topper = maxMark.get();
		System.out.println(topper);
		
	}
}
