package day2.liveClass;

public class _5MainFunctional {
	public static void main(String[] args) {
		
		//using external class
//		_3Inter i1 = new _4InterImpl();
//		i1.sayHello("Ram",10);
		
		
		//anonymous inner class
//		_3Inter i2 = new _3Inter() {
//			
//			@Override
//			public void sayHello(String name) {
//				
//				System.out.println("Welcome using anonymous inner class "+name);
//			}
//		};
//		i2.sayHello("Piyush");
		
		
		// Using Lambda
		
//		_3Inter i3 = n -> System.out.println("Welcome using lambda expression "+n);
//		i3.sayHello("Piyush");
		
		
		_3Inter i4 = (/*String name*/n,/* int age*/ a) -> System.out.println("Name is " + n + "Age is "+ a);
			
		i4.sayHello("Piyush", 25);
		
		
		//for no parameter in functional interface: 
		//_3Inter i5 = () -> System.out.println("Welcome ...");

		
		
		
		
		
		
		
		/*
		 * Rules to use lambda Expression :
		 *  1. LE is a implementation of function interface : using LE we can provide the implementation of a FI in much more easier way
		 *  	Their should be only one method
		 *  2. LE comprises 3 things : 
		 *  					1. parameter :  data type is optional to write, and variable name could be anything
		 *  									if only one parameter is their then small bracket is also optional.
		 * 										if zero or more than one parameter is their then small bracket is mandatory
		 * 						2. Lambda Operator : ->
		 * 						3. Method body : if we write one one statement than curly bracket is optional or else it is mandatory
		 * 			NOTE : LE don't care about FI name and method name.						
		 * 
		 */
		
		//Example -- longest implementation
//		Inter i1 = (String name)  -> {
//			System.out.println("Welcome using anonymous inner class "+name);
//
//		}
		
		
		
		
		
	}
}
