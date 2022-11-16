package day5.liveClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class _8Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("D:\\myObj.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		
		_7A a1 = (_7A) obj;
		
		a1.funA();
		
		String s = (String) ois.readObject();
		System.out.println(s);
		
		int x = (Integer) ois.readObject();
		System.out.println(x);
		
		
		
	}
}
