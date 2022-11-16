package day5.liveClass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class _12SerializationAndInheritance {
	/*
	 * If the parent class is implementing Serializable interface then automatically every child class implements
Serializable. weather we mention it or not in a child class.
It is a Serializable nature of inheriting parent to child.

*/
	
	
	
	/*If the parent class doesn't implements the Serializable interface still we can serialize the child
objects. if the child class implements Serializable interface.

	 * 
	 * */
	
	public static void main(String[] args) throws Exception {
		//Dog d = new Dog();
		
		FileOutputStream fos=new FileOutputStream("D://file2.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		
		//oos.writeObject(d);
		oos.flush();
		oos.close();
		
		System.out.println("done..");
	}

}

//class Animal implements Serializable{
//	int i=10;
//}
//
//class Dog extends Animal{
//	int j=20;
//}


//Here we have serialized the dog object, even though Dog class has not implemented the Serializable
//interface.

