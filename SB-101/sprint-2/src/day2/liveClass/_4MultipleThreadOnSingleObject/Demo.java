package day2.liveClass._4MultipleThreadOnSingleObject;



public class Demo {
	public static void main(String[] args) {
		
		//shared resource
		ThreadA ta = new ThreadA();
		
		Thread one = new Thread(ta);
		Thread two = new Thread(ta);
		
		one.setName("Raj");
		two.setName("Simran");
		
		one.start();
		two.start();
		
		// both thread will do the same task
	}

}
