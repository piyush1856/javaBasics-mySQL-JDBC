package day1.liveClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class _1Demo {
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 
	 Set<Student> students = new HashSet<>();
	 
	 //List<Student> students = new ArrayList<Student>(); // much more polymorphic way -- can return any kind of implementation
	 //family specific
	 //list is an interface and arrayList is a class
	 
	 //ArrayList<Student> students = new ArrayList<>();  // bounded with arrayList only -- to much specific
	 //It is always better to use interface based programming
	 
	 //Collection<Student> students = new ArrayList<>();
	
	  //Object students = new ArrayList<>(); // to much generic --> down-casting needed to use methods
	 //ArrayList<Student> al = (ArrayList<Student>) students;
	 
	 students.add(new Student(10,"N1",50000));
	 students.add(new Student(11,"N2",52836));
	 students.add(new Student(12,"N3",51436));
	 students.add(new Student(13,"N4",50536));
	 students.add(new Student(10,"N1",50000));
	 
	 System.out.println(students.size()); //list will consider the duplicate //5
	 //set will not allow duplicate but the output is still 5 because equals and hashCode method is not overridden
	 
	 
//	 Note: in order to identify the duplicate elements HashSet and LinkedHashSet
//	 class uses equals() and hashCode() method.
 }
 
 
 
 //imagination and understanding List/ArrayList
 
// public List<Student> getStudentsList(){
//	 ArrayList<Student> students = new ArrayList<>(); // we can also use linked list

//	 students.add(new Student(10,"N1",546));
//	 
//	 return students;
 // you can list or ArrayList as return type
 // list will return anything linkedList/ arrayList ... more polimorphic
// }
}
