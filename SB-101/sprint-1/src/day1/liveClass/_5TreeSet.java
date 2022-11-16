package day1.liveClass;

import java.util.TreeSet;

public class _5TreeSet {

	public static void main(String[] args) {
		
		
		
		TreeSet<Integer> tsNum = new TreeSet<>(); //set Family --> don't allow duplicate
		
		tsNum.add(10);
		tsNum.add(50);
		tsNum.add(40);
		tsNum.add(30);
		tsNum.add(20);
		tsNum.add(10);
		//ts.add(null); --> null not allowed
		
		System.out.println(tsNum);
		//no duplicate
		//sorted order --> balance tree data structure
		
		
		TreeSet<String> tsString = new TreeSet<>(); 
		
		tsString.add("one");
		tsString.add("two");
		tsString.add("three");
		tsString.add("four");

		System.out.println(tsString);  // also sorted
		
		
		
		StudentMarksComp mcomp = new StudentMarksComp();  
		//StudentRollComp rcomp = new StudentRollComp();
		
		TreeSet<Student> tsStudent = new TreeSet<>(mcomp);  // according to marks
		//TreeSet<Student> tsStudent = new TreeSet<>(rcomp);  // according to roll
		
		tsStudent.add(new Student(10, "N1", 520));
		tsStudent.add(new Student(12, "N2", 550));
		tsStudent.add(new Student(6, "N3", 480));
		tsStudent.add(new Student(5, "N4", 400));
		tsStudent.add(new Student(14, "N5", 600));
		tsStudent.add(new Student(15, "N0", 520));
		
		System.out.println(tsStudent);  //Exception : class caste exception
		//if we try to add any elements inside the TreeSet, that element
		//must be comparable. otherwise we get a ClassCastException.
		//java.lang.Comparable is an interface which have only one method: public int compareTo(Object obj);
		
		//if we try to add any element inside the TreeSet class then that element 
		//class must implements the Comparable interface and define the 
		//sorting logic of that object by overriding compareTo method.
		
		//Note: all the Wrapper classes and String class internally implements
		//Comparable interface.
		//check on command prompt : javap java.lang.String/Integer or any other wrapper class
		
		System.out.println(tsStudent.size()); // 5 --> duplicate will be removed based on marks because of compareTo()
		// Note: to consider the duplicate element, HashSet and LinkedHashSet class uses equal() and hashCode() method internally, 
		//where as TreeSet class uses compareTo or compare() method.
		
		// duplicate will not be removed if we remove s1==s2 condition in compareTo() method of bean class
		
		for(Student student : tsStudent) {
			System.out.println(student);
		}
		

		
		
		

	}

}
