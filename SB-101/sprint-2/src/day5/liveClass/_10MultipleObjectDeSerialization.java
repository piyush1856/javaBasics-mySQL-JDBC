package day5.liveClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class _10MultipleObjectDeSerialization {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\myStudent.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		
		List<StudentLive> a1 = (List<StudentLive>) obj;
		
		//adding new student
//		Student newStudent = new Student(47	,"Shivam",1000);
//		a1.add(newStudent);
//		
//		//over writing (replacing the existing object) in the file again
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D://myStudent.txt"));
//		oos.writeObject(a1);
		
		
		a1.forEach(s -> {
			System.out.println(s);
		});
	}
	
	
	
	
	


}
