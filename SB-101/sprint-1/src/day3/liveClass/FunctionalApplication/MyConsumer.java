package day3.liveClass.FunctionalApplication;

import java.util.function.Consumer;

import day2.liveClass.Student;

//public class MyConsumer implements Consumer<String>{
//
//	@Override
//	public void accept(String t) {
//		
//		System.out.println("Welcome " + t);
//		
//	}
//
//}

public class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student s) {
		
		System.out.println("Welcome " + s.getName() +" your marks is "+ s.getMarks());;
		
	}

}

