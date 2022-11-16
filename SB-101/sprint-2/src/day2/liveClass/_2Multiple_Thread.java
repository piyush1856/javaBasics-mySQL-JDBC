package day2.liveClass;

public class _2Multiple_Thread {
	public static void main(String[] args) {
		
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		ThreadC t3 = new ThreadC();   // 1 thread -- main default
		
		//t1.start();  // 2 thread
		t2.start();	// 3 thread
		t3.start(); // total 4 thread
		
		for (int i = 70; i < 80; i++) {
			System.out.println("inside main of _2MultipleThread:" + i);
		}
		System.out.println("end of main");
		
		
		

	}
}
