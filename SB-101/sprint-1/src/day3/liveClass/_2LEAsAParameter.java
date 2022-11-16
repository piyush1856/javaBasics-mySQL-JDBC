package day3.liveClass;

import day2.liveClass.Intr;

public class _2LEAsAParameter {
	
	void fun1(Intr i1) {
		
		if(i1!=null) {
			System.out.println("Inside fun1 of demo");
		
			i1.printSomething("Amit"); // method inside Intr i1
		}else {
			System.out.println("Get Lost ..");
		}
		
		//if/else is used for nullPointerException
		
	}
	
	public static void main(String[] args) {
		
		_2LEAsAParameter d1 = new _2LEAsAParameter();
//		long x= 100;
//		d1.fun1((int)x);
		
		//Interface as a parameter
		// null can be passed or any implementation object
		
		//d1.fun1(new IntrImpl()); // null can also be passed and acceptable but illegal to use
		//null will also give nullPointerException at line no. 12, but function will be invoked
		
		
		//with lambda 
		//Intr i1 =(String s) -> System.out.println("Welcome  " +s);
		//d1.fun1(i1);
		
		d1.fun1(s -> System.out.println("Welcome " + s));
	}
}
