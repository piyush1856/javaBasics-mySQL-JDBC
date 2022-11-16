package day3.liveClass._3ThreadSynchronization;

public class Demo {
	
	public static void main(String[] args) {
		
		System.out.println("Inside main of main of demo");
		
		Demo d1 = new Demo();
		
		//main thread acquire d1 lock
		synchronized (d1) {
			
			try {
				d1.wait(2000); // can also give time as param
				//main thread release lock and go to waiting state
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("End of main");
		
	}

}
/*
 To call wait() or notify() method on any object we must have that particular object lock otherwise we will get a
runtime exception called IllegalMonitorStateException.

Once a thread calls wait() method on any object, first it releases the lock immediately of that particular object and
then it enters into the waiting state immediately.

Once a thread calls notify() method on any object it also releases the lock of that object but not immediately.

Wait and notify or notifyAll method belongs from Object class because "a thread" can call these methods on any
java object.





*/