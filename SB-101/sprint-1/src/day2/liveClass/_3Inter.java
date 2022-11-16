package day2.liveClass;

@FunctionalInterface
public interface _3Inter {
	
	/*public static final*/ int x=100;
	
	/*public abstract*/ void sayHello(String name, int age);
	
	public default void fun2() {
		
	}
	public static void fun3() {
		
	}
	
	public /*abstract*/ String toString(); // object class method could be there(even abstract)
	
	//hashCode method or any object class method
	
	//some pre-defined functional interface : java.lang.Comparable/Comparator/Iterable
	//java.lang.Runnable 
	
	
	//**Note : with the help of functional interface we achieve functional programming using Lamda expression
	
	
	
	
}
