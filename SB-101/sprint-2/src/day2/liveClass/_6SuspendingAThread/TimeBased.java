package day2.liveClass._6SuspendingAThread;

import day2.liveClass._5ThreadPriority.Main;

public class TimeBased implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			System.out.println("inside run " + i);
			
			//pausing for one second
			//cannot apply throws method for exception
			//because for run method throws method is not allowed because it is overridden and parent class doesn't throw exception for run
			//but it is allowed in our method 
			
			
			try {
				Thread.sleep(1000);
				//line no 9 will keep on repeating at an interval of 1 second
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("end of run()...");

		
	}
	
	public static void main(String[] args) throws InterruptedException {
		//taking control over execution of run method
		//taking partial control over thread in running state
		
		//based on time : Thread.sleep()
		//This method will suspend the current thread which is under execution with those many millisecond passed as
		//argument(1000ms=1sec).
		//This sleep method is proven to generate checked exception hence it must be called inside try and catch block.
		
		TimeBased job = new TimeBased();
		Thread t1 = new Thread(job);
		
		t1.sleep(5000);
		t1.start();
		//Main.sleep(15000);
		Thread.sleep(15000); //after 5 time running the line 9 line 45 will be printed
		
		System.out.println("end of main()...");
		
		
		
		
		
		
		
		
	}


}
