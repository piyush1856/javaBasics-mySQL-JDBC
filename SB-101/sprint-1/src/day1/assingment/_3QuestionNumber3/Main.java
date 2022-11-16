package day1.assingment._3QuestionNumber3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class Main {

	public static void main(String[] args) {
		
		List<StudentBean> student = new ArrayList<StudentBean>();
		
//		TreeSet<StudentBean> studentTreeSet = new TreeSet<>(student);
		StudentMarksComparision marksComp = new StudentMarksComparision();
//		studentTreeSet = new TreeSet<>(marksComp);
		
		
		student.add(new StudentBean(10, "Piyush1", "Godda2", 451));
		student.add(new StudentBean(11, "Piyush3", "Godd3", 452));
		student.add(new StudentBean(12, "Piyush2", "Godda4", 455));
		student.add(new StudentBean(13, "Piyush5", "Godd4", 4585));
		student.add(new StudentBean(14, "Piyush3", "Godda67", 454));
		student.add(new StudentBean(15, "Piyush", "Godda5", 455));
		student.add(new StudentBean(15, "Piyush", "Godda5", 455));
		student.add(new StudentBean(15, "Piyush", "Godda5", 455));
		
		System.out.println(student.size());
		 
//		//converting to set
//		Set<StudentBean> uniqueStudents = new LinkedHashSet<>(student);
//		System.out.println(uniqueStudents.size());
//		
//		//converting again to list
//		student = new ArrayList<StudentBean>(uniqueStudents);
//		System.out.println(student.size());
		
		
//		//converting list to tree-set
//		
//		
//		for(StudentBean students : studentTreeSet) {
//			System.out.println(students);
//		}
		
		
		TreeSet<StudentBean> uniqueStudents = new TreeSet<>(marksComp);
		uniqueStudents.addAll(student);
		
		System.out.println(uniqueStudents.size());
		
		
		student = new ArrayList<>(uniqueStudents);
//		Collections.sort(student,marksComp);
		
		
		
		for(StudentBean students : student) {
		System.out.println(students);
	}
		 

	}

}
