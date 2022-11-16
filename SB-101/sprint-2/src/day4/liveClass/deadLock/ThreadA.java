package day4.liveClass.deadLock;

public class ThreadA extends Thread{
	A a1;
	B b1;
	
	public ThreadA(A a1, B b1) {
		this.a1 = a1;
		this.b1 = b1;
	}
	
	@Override
	public void run() {
		a1.funA(b1);  // t1 require a1 obj lock
	}
	
	
	

}
