package day2.liveClass._6SuspendingAThread;

public class Conditionally {
	//join()
	public static void main(String[] args) throws InterruptedException {
		//If we want to suspend a running thread conditionally then we should use join() method of the Thread class.

		//The join() method is a non-static method.

		//If a thread wants to wait until completion of other thread then we should use join() method.

		//If a thread t1 calls join() method on another thread t2, like t2.join() then t1 thread will be enter into waiting state
		//until t2 thread completes.
		
		A a1 = new A();
		//A a1 = new A(Thread.currentThread());
		Thread t = new Thread(a1);
		
		t.start();  //2nd thread calculate sum
		
		t.join();		//Here main thread will wait until the t thread completes
						//if we comment t.join then we will get incorrect value.
						// main thread go to waiting state because main thread is calling t.join
		
		//Thread.sleep(1000);  // it print the sum because men thread go to sleep but, time will be waste eg. calculation will take 1 nanosecond
								//also if task is huge you will get a partial value
		int result = a1.sum;
		
		//main thread
		for (int i = 0; i < 10; i++) {
			System.out.println("inside main thread....");
			System.out.println(result);
		}

	}
}

class A implements Runnable{
	int sum;
	
	
//	Thread th;
//	
//	public A(Thread th) {
//		this.th = th;
//	}
	
	
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
//			try {
//				th.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			System.out.println("inside A thread");
			sum = sum + i;
		}
	}
}
