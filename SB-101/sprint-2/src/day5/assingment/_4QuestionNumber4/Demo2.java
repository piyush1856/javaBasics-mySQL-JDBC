package day5.assingment._4QuestionNumber4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import day5.liveClass.StudentLive;

public class Demo2 {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D://StudentData.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		
		List<Student> a1 = (List<Student>)obj;
		
		a1.forEach(s -> System.out.println(s));
		
		
		
	}

}
