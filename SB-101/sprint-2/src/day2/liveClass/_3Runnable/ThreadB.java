package day2.liveClass._3Runnable;

public class ThreadB implements Runnable{
	@Override
	public void run() {
		for (int i = 50; i < 60; i++) {
			//System.out.println("inside run method of Thread B " + i);
		
			String tname=Thread.currentThread().getName();
			System.out.println(tname +" is running : " + i);

		
		}
		System.out.println("end of Thread B");
	}

}
