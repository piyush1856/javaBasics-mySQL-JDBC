package day3.liveClass._1Sysnchronization;

public class Demo {
	//Internally synchronization concept is implemented by using lock concept
	// in java every concept has a lock and most of the time it is locked
	//object level lock
	
	//if a class has more than one sync, the thread will need the object lock to enter any thread
	//The locks are not per methods basis, instead they are per object basis.
	
	//The thread won't release the lock until it completes the synchronized methods, so while that thread is holding the
	//lock of that object. once a synchronized method execution completed then thread releases the lock automatically.
	
	//**Until the lock is released (completion of synchronized method.)no other threads can enter any of the
	//synchronized methods or blocks of that object.
	
	//So if an object has synchronized methods or blocks, a threads can enter any one of the synchronized methods or
	//block only if the lock of that object is available.
	
	//Acquiring and releasing the lock internally taken care by JVM, programmer are not responsible for this activity.

	/*
	 * Note: while one thread is executing any one synchronized method on the given object then the remaining threads are
		not allowed to execute any other synchronized method simultaneously. but remaining threads are allowed to execute
		any non-synchronized method simultaneously.

	 * */
	
	//class level lock : 
	/*
	 * If a thread try to execute a static synchronized method then it required class level lock.
		
		object lock and class level lock both are independent and there is no link between them.
		While a thread is executing a static synchronized method, the remaining threads are not allowed to execute any other
		static synchronized method of that class simultaneously (**even on the multiple object of that class also)
		but remaining threads are allowed to execute normal static and synchronized non-static methods and normal non-static methods simultaneously
	 * 
	 * 
	 * 
	 */
	
	
	
	
	

}
