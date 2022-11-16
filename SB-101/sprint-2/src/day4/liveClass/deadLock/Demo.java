package day4.liveClass.deadLock;

public class Demo {

	public static void main(String[] args) {
		
		A a1 = new A();
		B b1 = new B();
		
		ThreadA t1 = new ThreadA(a1, b1);
		ThreadB t2 = new ThreadB(a1, b1);
		
		t1.start(); // 2
		t2.start(); //3 thread are running
		
		//since both the thread are waiting for one other lock this is called deadlock.
		// so make any one of the method non-sync
		

	}

}
