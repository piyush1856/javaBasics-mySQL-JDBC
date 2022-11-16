package day3.liveClass.FunctionalApplication;

import java.util.function.Predicate;

import day2.liveClass.Student;

//public class MyPredicate implements Predicate<Integer>{
//
//	@Override
//	public boolean test(Integer i) {
//		
//		if(i>=0) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	
//	
//}



//Student Object/Class as parameter
public class MyPredicate implements Predicate<Student>{

	@Override
	public boolean test(Student s) {
		
		if(s.getMarks() < 500) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
