package day2.liveClass._3Runnable;

public class Main {
	public static void main(String[] args) {
		
		//setting name of thread
		 
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		
		Thread tr1 = new Thread(ta);
		Thread tr2 = new Thread(tb);
		
		tr1.setName("Piyush");   //default name : Thread - 1
		tr2.setName("Krishna");  // default name : Thread - 2
		
		tr1.start();
		tr2.start();
		
		Thread.currentThread().setName("Changed name of main thread");
		
		System.out.println("Inside main method and main default thread is executing : " +Thread.currentThread().getName());
		
	
	}
}
