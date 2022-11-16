package day2.liveClass._7ThreadSafety;

public class Main {
	public static void main(String[] args) {
		//The concept of avoiding multiple threads acting upon the same functionality simultaneously is known as Thread safety.
		//If multiple threads are trying to operate simultaneously on the same functionality then there may be a chance of data
		//inconsistency problem.
		
		//Concurrency issue lead to the race-condition. and race-condition lead to the data inconsistency.
		
		//Java is a multi-threaded programming language and there is a higher risk to occur race conditions. Because the
		//same resource may be accessed by multiple threads at the same time and may change the data.
		//In layman terms, a race condition can be defined as, a condition in which two or more threads compete together to
		//get certain shared resources.
		
		//For example, if thread A is reading data from the linked list and another thread B is trying to delete the same data.
		//This process leads to a race condition that may result in run time error
		
		//To solve the data inconsistency problem in java synchronized keyword is used.
		//So the thread-safety is achieved and race condition is avoided by the help of synchronized keyword.

		
		Common c=new Common();
		
		//sharing same Common object to two thread
		ThreadA t1=new ThreadA(c,"Ram");
		ThreadB t2=new ThreadB(c,"Shyam");
		
		t1.start();
		t2.start();
		
		// output : WelcomeWelcomeRamShyam
		// to solve this make sure that one thread will be called at a time fully to complete the thread
		//so use synchronized keyword in common class method name which is called by both the thread
		//so one thread will be called at a time
		// synchronized is applied only with the method and blocks but not on variable and class
		//output : 
		//WelcomeRam
		//WelcomeShyam
		
		
		/*
		 * The main advantage of the synchronized keyword is we can resolve data inconsistency problem. but the main
			disadvantage of the synchronized keyword is it increases waiting time of the threads and creates performance
			problem on it. hence if there is no specific requirement then it is never recommended to use the synchronized
			keyword.
			so, their should be minimum use of synchronized keyword, it will slow down the performance
		*/
	}

		
		
		
}

