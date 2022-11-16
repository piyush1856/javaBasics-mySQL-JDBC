package day5.liveClass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class _13SerializationAndInheritance2 {
/*
 * If the parent class doesn't implements the Serializable interface still we can serialize the child
objects. if the child class implements Serializable interface.
At the time of serialization JVM will ignores the updated values of instance variables which are
inherited from the parent.
At the time of Deserialization JVM will check if the parent class is serializable or not. if the parent
class is non-serializable then JVM will creates an object for non-serializable parent class by
executing default constructor of the parent class and share its default instance variable value to
the child objects.
*/
	
	public static void main(String[] args) throws Exception {
		B b1 = new B();
		b1.i = 200;
		b1.j = 500;
		
		FileOutputStream fos=new FileOutputStream("D://file3.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(b1);;
		System.out.println("serialized the Child object ");
		
	}
}
