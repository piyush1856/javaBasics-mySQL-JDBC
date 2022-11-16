package sprint2Evaluation._5QuestionNumber5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) throws Exception {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1, "Piyush", 10, "p@a", "123", new Address("UP", "New York", "966987")));	
		students.add(new Student(2, "Bob", 11, "b@a", "128", new Address("MP", "London", "786987")));
		students.add(new Student(3, "Vikash", 12, "v@a", "125", new Address("AP", "Paris", "206987")));
		students.add(new Student(4, "Nirnay", 13, "n@a", "126", new Address("UP", "Moscow", "676987")));
		students.add(new Student(5, "Prashant", 14, "pr@a", "127", new Address("UP", "Tokoyo", "451087")));
		
		FileOutputStream fos = new FileOutputStream("D://studentdata.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(students);
		
		oos.flush();
		oos.close();
		
		//System.out.println("Done");
	
	
	
	
	}

}
