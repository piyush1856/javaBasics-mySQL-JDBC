package day4.liveClass.deadLock;

public class A {
	
	
	public synchronized void funA(B b1){
		
		System.out.println("funA of A starts");
		
		b1.fun2(); //the thread should have 2 locks : A and B obj level lock
					// t1 already acquired a1 obj lock and needs b1 lock
		System.out.println("funA of A ends");
	}
	
	
	public /*synchronized*/ void fun1(){
		System.out.println("inside fun1 of A");
	}


}
