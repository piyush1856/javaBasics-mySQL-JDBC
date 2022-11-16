package day2.liveClass._2MultipleThread;



public class Main extends Thread{
	public void run(){
		System.out.println("Inside run method");
	}
	public static void main(String[] args){
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		ThreadC t3 = new ThreadC();   // 1 thread -- till here only one thread --> main default thread
		
		t1.start();  // 2 thread
		t2.start();	// 3 thread
		t3.start(); // total 4 thread
		
		for (int i = 70; i < 80; i++) {
			System.out.println("inside main of Main " + i);
		}
		System.out.println("end of main");
	}
}
