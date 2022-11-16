package day1.liveClass;

import java.util.Comparator;

public class StudentRollComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		//return 0;
		
		return s1.getRoll()>s2.getRoll() ? -1 : 1;
	}
	

}
