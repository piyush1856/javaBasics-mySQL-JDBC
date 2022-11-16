package day2.liveClass;

public class ThreadA /*extends Thread*/ implements Runnable{
	@Override
	public void run() {
		
		for (int i = 0; i < 20; i++) {
			//thread.currectthread() will return currently running thread object
			//on that object calling getName();
			String tname=Thread.currentThread().getName();
			System.out.println(tname +" is running " + i);

		}
		System.out.println("end of Thread A");
	}
	
//	public static void main(String[] args) {
//		
//		ThreadA ta = new ThreadA();
//		
//		Thread tr = new Thread(ta);
//		tr.start();		
//		
//		
//		for(int i=50;i<60;i++) {
//			System.out.println("Inside main of thread A "+ i);
//		}
//	}
}
