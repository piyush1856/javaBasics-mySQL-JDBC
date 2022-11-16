package day2.liveClass;

public class _6FunctionalInterfaceWithObject {
	public static void main(String[] args) {
		
		//using external class
//		_7StudentInterfaceForFunctional i1 = new _8StudentInterfaceImplement();
//		i1.sayHello(new Student(10,"Piyush",56));
		
		
		//using lambda approach
		
//		_7StudentInterfaceForFunctional i2 = /*(Student student)*/ s -> {
//			System.out.println("Roll is : " + s.getRoll());
//			System.out.println("Roll is : " + s.getMarks());
//			System.out.println("Roll is : " + s.getName());
//		};
//		
//		i2.sayHello(new Student(20, "Piyush Tyagi", 58));
		
		
		
		
		
		
		//Return type
		
		
		/*
		 * LE with return type:
			--if inside the method body only one statement is there then {} is optional, and 
				return keyword is not allowed.
		 * 
		 * */
		
		//external class method
//		_7StudentInterfaceForFunctional i3 = new _8StudentInterfaceImplement();
//		String result = i3.sayHello("Rahul");
//		System.out.println(result);
		
		
		
		//lambda method :
//		_7StudentInterfaceForFunctional i2 = /*(String name)*/ name -> {
//			String result2 = "Welcome : "+name.toUpperCase();
//			return result2;
//		};
		
		//or, in single line -- return keyword is not allowed (automatically take return for return type for single line only)
		// return keyword can only be used with curly brackets
		
//		_7StudentInterfaceForFunctional i2 = name -> "Welcome : "+name.toUpperCase();
//		
//		
//		
//		System.out.println(i2.sayHello("Amit"));
		
		
		
		
		// next example
		
		
		//external class method
		_7StudentInterfaceForFunctional i1 = new _8StudentInterfaceImplement();
		Student s = i1.getStudent(10, "Baklol", 54);
		System.out.println(s);
		
		//lambda expression
		
//		_7StudentInterfaceForFunctional i2 = (int roll, String name, int marks) -> {
//			Student s1 = new Student(roll, name.toUpperCase(), marks+900);
//			return s1;
//		};
		_7StudentInterfaceForFunctional i2 = (roll,name, marks) -> new Student(roll, name.toUpperCase(), marks+900);
		 Student s2 =  i2.getStudent(10, "Bada Baklol", 100);	
		 System.out.println(s2);
	
		
		
		
		
		
		
		
		
		
	}
}
