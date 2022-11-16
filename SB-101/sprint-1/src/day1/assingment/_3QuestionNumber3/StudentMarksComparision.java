package day1.assingment._3QuestionNumber3;

import java.util.Comparator;

public class StudentMarksComparision implements Comparator<StudentBean>{

	@Override
	public int compare(StudentBean s1, StudentBean s2) {
		if(s1.getMarks() > s2.getMarks())
			return -1;
		else if(s1.getMarks() < s2.getMarks())
			return +1;
		else
			return s1.getName().compareTo(s2.getName());
	}

}
