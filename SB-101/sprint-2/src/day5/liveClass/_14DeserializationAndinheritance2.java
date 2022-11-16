package day5.liveClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class _14DeserializationAndinheritance2 {
	
	public static void main(String[] args) throws Exception, IOException {
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D://file3.txt"));
		
		B b2 = (B)ois.readObject();
		
		System.out.println(b2.i); //updated value of parent class is not deserialized
		System.out.println(b2.j);
	}

}
