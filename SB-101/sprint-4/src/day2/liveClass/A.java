package day2.liveClass;

public class A {
	
	{
		System.out.println("Inside non-static ..");
	}
	
	static {
		System.out.println("Inside static ..");
	}
	
	
	public A() {
		System.out.println("Inside constructor of A ...");
	}
	
	public A(int a) {
		System.out.println("Inside constructor of A ...");
	}
	
	public void funA() {
		System.out.println("Inside funA of A ...");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Inside main method ...");
		
		A a1 = new A();
		a1.funA();
	}
}
