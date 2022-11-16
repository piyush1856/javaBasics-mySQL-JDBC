package day3.liveClass._3ThreadSynchronization;

public class intro {

	//*** A thread which enters into the synchronized area is known as synchronized thread.
	
	/*It means two synchronized threads communicate each other.
Two synchronized thread can communicate each other by using some methods present in Object class, those
methods are wait(), notify(), notifyAll().
By using above methods we can gain partial control on the scheduling mechanism which is supervised by the
thread-scheduler.
To gain this partial control the threads should have a sign of mutual understanding between them .they should be
able to communicate with each other.

Whenever we need to suspend a synchronized thread unconditionally then we use wait() method.
Whenever we need to resume a suspended(waiting) thread then we use notify() method.
	
This is known as thread-synchronization or inter-thread communication.

In the inter-thread communication the thread which require updation it has to call wait() method.

The thread which performing updation it will call notify() method, so that waiting thread will gets the notification
and it continues its execution with those updation.

	 * 
	 * Note:- we can call wait(), notify(),notifyAll() only in the synchronized block or synchronized methods.
		otherwise we will get a runtime exception.

	 * 
	 * Suspend --> wait()
	 * Resume --> notify()
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	








}
