package sprint2Evaluation._5QuestionNumber5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D://studentdata.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		List<Student> list = (List<Student>)obj;
		
		//Previous List
		//list.forEach(s -> System.out.println(s));
		
		
		//adding one student
		Student newStudent = new Student(56, "Gaurav", 567, "g@a", "789", new Address("Gujrat", "alps", "785416"));
		list.add(newStudent);
		
		//overwriting the file again / serializing it again
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D://studentdata.txt"));
		oos.writeObject(list);
		oos.flush();
		oos.close();
		
		
		//De-serializing
		ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("D://studentdata.txt"));
		Object obj2 = ois2.readObject();
		List<Student> updatedList = (List<Student>)obj2;
		
		//printing the updated list
		updatedList.forEach(l -> System.out.println(l));
		
		ois.close();
		ois2.close();
	}

}
