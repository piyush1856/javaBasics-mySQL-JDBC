package day3.liveClass._1Sysnchronization;

public class Main {
	
	public static void main(String[] args) {
		
		
		Common c1=new Common();
		Common c2 = new Common();
		
		
		ThreadA t1=new ThreadA(c1,"Ram");
		ThreadB t2=new ThreadB(c2,"Shyam");
		//unexpected output because both is the thread is working on different object and both have the lock key
		// if we use static keyword in common class fun1 method we will get expected output
		
		//when a thread needs to enter a non-static sync method it need object level lock
		//when a thread needs to enter a static sync method it need class level lock
		//so by using static keyword t1 takes the class lock .. execute and give lock to t2
		

		t1.start();
		t2.start();
		
		
	}
		/*
		 *class A{
		 *
		 *  A a1 = new A()
		 *  A a2 = new A()
		 *
		 *	syn fun1()  t1 --> obj level lock(a1)
		 *	syn fun2()  t2 --> obj level lock (a2)
		 *	
		 *	static syn fun3()  t2 --> a1.fun3() : class level lock
		 *	static syn fun4()  t3 --> a2.fun4() not possible
		 *
		 *	fun5()  t3 : lock not required
		 *
		 *	static fun6()   t3 : lock not required
		 *
		 *	non-static sync method : -- fun1 and fun2
		 *	static sync method : fun3 and fun4
		 *	non-static normal method : fun5
		 *	static normal method : fun6
		 *
		 *
		 *	
		 *
		 *
		 *
		 *} 
		 * 
		 * If a thread try to execute a static synchronized method then it required class level lock.
			
			object lock and class level lock both are independent and there is no link between them.
			While a thread is executing a static synchronized method, the remaining threads are not allowed to execute any other
			static synchronized method of that class simultaneously (**even on the multiple object of that class also)
			but remaining threads are allowed to execute normal static and synchronized non-static methods and normal non-static methods simultaneously.

		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
}

