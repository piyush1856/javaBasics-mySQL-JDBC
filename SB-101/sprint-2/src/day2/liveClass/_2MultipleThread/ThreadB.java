package day2.liveClass._2MultipleThread;

public class ThreadB extends Thread{
	@Override
	public void run() {
		
		for (int i = 50; i < 60; i++) {
			
			System.out.println("inside run method of Thread B " + i);
			
		}
		System.out.println("end of Thread B");
	}

}
