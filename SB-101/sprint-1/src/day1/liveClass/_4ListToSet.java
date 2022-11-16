package day1.liveClass;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class _4ListToSet {

	public static void main(String[] args) {
		
		//remove duplicate from list
		
		 List<Student> students = new ArrayList<Student>(); 

		 students.add(new Student(10,"N1",50000));
		 students.add(new Student(11,"N2",52836));
		 students.add(new Student(12,"N3",51436));
		 students.add(new Student(13,"N4",50536));
		 students.add(new Student(10,"N1",50000));
		 
		 //remove duplicate from list
		 //convert list to set
		 System.out.println(students.size());
		 
		 Set<Student> uniqueStudents = new LinkedHashSet<>(students);
		 //use for loop
		 //or
		 //use constructor and pass list in set *(RHS) and convert list to set
		 
		 System.out.println(uniqueStudents.size());
		 //but still duplicate is not removed from the List, just an another new set is created which does not allow duplicate by property
		 //so
		 //time complexity --> O(N) --> uses loop internally
		 //again convert to list
		 students = new ArrayList<Student>(uniqueStudents);
		 System.out.println(students.size());
		 
		 //**All collection classes are mutually inclusive i.e we can convert any type of
		 //collection to any other collection very easily:
		 
		 // Always remember to override equal and hashCode method or, set will not identify duplicate
	}

}
