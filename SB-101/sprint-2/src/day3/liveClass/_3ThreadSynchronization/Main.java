package day3.liveClass._3ThreadSynchronization;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		//1
		MyThread mt = new MyThread();
		
		mt.start();//2 --> two threads are running 
		
		//Thread.sleep(1000);  //first way : will waste time
		
		//mt.join();  // second way : will make main thread wait
		
		
		synchronized (mt) {
			System.out.println("Main thread call the wait method");

			mt.wait(); //main releases the lock and go waiting
			
			System.out.println("Main thread got the notification");
			
		}
		
		
		
		
		System.out.println(mt.total);
	}
/*
 Note:-In the above example most of the time main thread gets the chance first but if we call Thread.sleep()
method after the mt.start() then child thread gets the chance and the main thread will go to the waiting state
forever, to solve this problem we can use wait(5000) i.e.wait till 5sec.
*/
}
