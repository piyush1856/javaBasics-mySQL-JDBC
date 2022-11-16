package day3.liveClass.FunctionalApplication;

import java.util.function.Function;

import day2.liveClass.Student;

public class MyFunction implements Function<Student, String>{

	@Override
	public String apply(Student s) {
		
		if(s.getMarks()>500) {
			return "Pass";		
		}else {
			return "Fail";
		}
	}

}
