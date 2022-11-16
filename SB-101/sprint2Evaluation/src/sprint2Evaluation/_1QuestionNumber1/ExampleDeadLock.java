package sprint2Evaluation._1QuestionNumber1;

public class ExampleDeadLock {
	
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		
		ThreadA t1 = new ThreadA(a1,b1);
		ThreadB t2 = new ThreadB(a1, b1);
		
		t1.start();
		t2.start();
		
		//Since both the thread are waiting for one other to exchange the lock keys this is called deadlock
		//If you run this program .. this program will run for infinite time and will not be able to execute all the methods
		
		//if you wany to run the program completely, just remove synchronized keyword for any of the one method ..
	}

}

class A{
	
	public synchronized void firstMethodOfA(B b) {
		System.out.println("starting 1st method of A");
		
		b.secondMethodOfB(); // The thread should have 2 lock : A and B Object level lock
							//Thread t1 acquired a1 lock and needs b1 lock to execute this method completely but b1 lock is with Thread t2.
							//They can't give the lock to each other until the method gets executed and synchronized keyword will not allow to enter any other thread,
							//Hence the deadlock like situation arises
		System.out.println("starting 2nd method of A");
	}
	
	public synchronized void secondMethodOfA() {
		System.out.println("inside 2nd method of A ..");
	} //if you want to run this program complete and break deadlock --> remove synchronized keyword from this method or from any other method ..
}

class B{
	
	public synchronized void firstMethodOfB(A a) {
		System.out.println("starting 1st method of B");
		
		a.secondMethodOfA();// The thread should have 2 lock : A and B Object level lock
							//Thread t2 acquired b1 lock and needs a1 lock to execute this method completely but a1 lock is with Thread t1.
						//They can't give the lock to each other until the method gets executed and synchronized keyword will not allow to enter any other thread,
						//Hence the deadlock like situation arises
		System.out.println("starting 2nd method of B");
	}
	
	public synchronized void secondMethodOfB() {
		System.out.println("inside 2nd method of B ..");
		
	}
}


class ThreadA extends Thread{
	A a1;
	B b1;
	
	public ThreadA(A a1, B b1) {
		this.a1 = a1;
		this.b1 = b1;
	}

	@Override
	public void run() {
		a1.firstMethodOfA(b1);  // t1 thread requires a1 object lock to print
	}	
}


class ThreadB extends Thread{
	A a1;
	B b1;
	
	public ThreadB(A a1, B b1) {
		this.a1 = a1;
		this.b1 = b1;
	}

	@Override
	public void run() {
		b1.firstMethodOfB(a1); //t2 thread requires b1 object lock to execute
	}
}














