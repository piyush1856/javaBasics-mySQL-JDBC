package day2.liveClass;

public class _3GetName {
	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		//ThreadB tb = new ThreadB();
		
		Thread t1=new Thread(ta);
		//Thread t2=new Thread(tb);
		Thread t2=new Thread(ta);  // giving same task to different thread
		
		//default name - Thread-1 , Thread-2 .....
		
		t2.setPriority(10);
		
		t1.setName("Raj");
		t2.setName("simran");
		
		t1.start();
		t2.start();
		
		
		//name changing
		//Thread.currentThread().setName("XYZ thread");
		//System.out.println("Inside main method "+ Thread.currentThread().getName());
		
		// thread priority : 
	}
}
