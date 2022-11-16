package day5.liveClass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class _11ObjectGraphHasArelationship {
	/*
	 * Whenever we are serializing an object, the set of all the objects which are reachable from that object will
be serialized automatically. this group of object is nothing but object-graph..
In object-graph every object should be serializable otherwise we will get a Runtime exception
NotSerializableException.
*/
	
	public static void main(String[] args) throws Exception {
		Dog d=new Dog();
		
		FileOutputStream fos=new FileOutputStream("D://file1.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(d);
		oos.flush();
		oos.close();
		
		System.out.println("done");
	}

}

class Dog implements Serializable{
	Cat c=new Cat();
}

class Cat implements Serializable{
Rat r=new Rat();
}

class Rat implements Serializable {
	
}




