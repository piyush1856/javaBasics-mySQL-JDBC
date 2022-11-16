package day5.liveClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class _6Serialization {
	
	public static void main(String[] args) throws IOException {
		
		_7A a1 = new _7A();
		
		a1.i =200;
		
		FileOutputStream fos = new FileOutputStream("D://myObj.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(a1);
		
		oos.writeObject("Welcome"); //String Object
		oos.writeObject(100); // Integer
		
		System.out.println("Done ...");
		
		
	}

}


