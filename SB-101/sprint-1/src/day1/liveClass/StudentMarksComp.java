package day1.liveClass;

import java.util.Comparator;

public class StudentMarksComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		//return 0;
		
		//return s1.getMarks()>s2.getMarks() ? +1 : -1;
		
		//if marks are same sort according to name
		if(s1.getMarks() > s2.getMarks())
			return +1;
		else if(s1.getMarks() < s2.getMarks())
			return -1;
		else
			return s1.getName().compareTo(s2.getName());
	}
	

}
