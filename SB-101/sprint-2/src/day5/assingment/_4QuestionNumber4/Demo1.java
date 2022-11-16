package day5.assingment._4QuestionNumber4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) throws Exception {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(45, "Piyush1", 890, new Address("UP", "Kanpur", 485621)));
		students.add(new Student(46, "Piyush2", 891, new Address("MP", "Mars", 486621)));
		students.add(new Student(47, "Piyush3", 892, new Address("AP", "Pluto", 003521)));
		students.add(new Student(48, "Piyush4", 893, new Address("J&K", "Wales", 75121)));
		students.add(new Student(49, "Piyush5", 894, new Address("Gujrat", "London", 480051)));
		students.add(new Student(40, "Piyush6", 895, new Address("Bihar", "New York", 965621)));
		
		FileOutputStream fos = new FileOutputStream("D://StudentData.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(students);
		
		oos.flush();
		oos.close();
		
		
		System.out.println("Done ...");
	}

}
