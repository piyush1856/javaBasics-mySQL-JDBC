package day2.liveClass;

public class _10MethodreferanceDemo {
	
	public static void fun1(String s) {
		System.out.println("Inside static fun1 of demo");
		System.out.println("The value of s is : " + s);
	}
	
	public void fun2(String s) {
		System.out.println("Inside non-static fun2 of demo");
		System.out.println("The value of s is : " + s.toUpperCase());
	}
	
	
	public _10MethodreferanceDemo(String s) {
		System.out.println("Inside constructor of demo class");
		System.out.println("The value of s is : " + s.toUpperCase());
	}

	public static void main(String[] args) {
//		_11InterfaceForMR i1 = (String message) -> {
//			System.out.println(message);
//		};
		
		//OR,
		
//		_11InterfaceForMR i1 =  message -> System.out.println(message);
//		i1.sayHello("Welcome to lamda");
		
		//fun1 and interface method sayHello() is matching -- return type, parameter
		//So,
		
		//static function reference
		_11InterfaceForMR i1 =  _10MethodreferanceDemo :: fun1;
		i1.sayHello("Welcome to lamda");
		
		
		//non-static reference
		_10MethodreferanceDemo d1 = new _10MethodreferanceDemo("just to resolve constructor");
		_11InterfaceForMR i2 = d1 :: fun2;
		i2.sayHello("Welcome");
		
		
		//constructor reference
		_11InterfaceForMR i3 = _10MethodreferanceDemo :: new;
		i3.sayHello("Constructor calling referance");
		
		
		
	}

	
}
