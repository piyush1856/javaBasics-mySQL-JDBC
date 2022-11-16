package day2.liveClass._2MultipleThread;

public class ThreadC extends Thread {
	@Override
	public void run() {
		
		for (int i = 20; i < 30; i++) {
			System.out.println("inside run method of Thread C " + i);
		}
		System.out.println("end of Thread C");
	}
}
