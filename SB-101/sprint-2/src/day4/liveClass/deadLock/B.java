package day4.liveClass.deadLock;

public class B {
	
	
	public synchronized void funB(A a1){
		
		System.out.println("funB of B starts");
		
		a1.fun1(); // t2 thread already acquired b1 lock
					// t2 wants b1 lock if fun1 is sync
		
		System.out.println("funB of B ends");
	}
	
	
	
	
	public synchronized void fun2(){
		System.out.println("inside fun1 of B");
	}


}
