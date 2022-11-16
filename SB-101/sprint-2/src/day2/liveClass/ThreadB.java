package day2.liveClass;

public class ThreadB extends Thread{
	@Override
	public void run() {
		for (int i = 50; i < 60; i++) {
			//System.out.println("inside run mehod of Thread B " + i);
		
			String tname=Thread.currentThread().getName();
			System.out.println(tname +" is running ");

		
		}
		System.out.println("end of Thread B");
	}

}
