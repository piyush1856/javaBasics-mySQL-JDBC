package day5.liveClass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class _9MultipleOnjectSerialization {
	
	public static void main(String[] args) throws Exception {
		
		List<StudentLive> students = new ArrayList<>();
		
		students.add(new StudentLive(10, "Piyush", 122));
		students.add(new StudentLive(11, "Prashant",496));
		students.add(new StudentLive(12, "Bakra", 895));
		students.add(new StudentLive(13, "Ninay", 124));
		students.add(new StudentLive(14, "Ashish", 114));
		students.add(new StudentLive(15, "Ankit", 100));
		
		FileOutputStream fos = new FileOutputStream("D://myStudent.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(students);
		
		
		
		
		System.out.println("Done ...");
		
	}
}
