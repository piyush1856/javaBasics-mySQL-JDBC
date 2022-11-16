package day3.liveClass._3ThreadSynchronization;



public class MyThread extends Thread{
	
	int total =0;

	@Override
	public void run() {
		
		
		synchronized (this) {
			
			System.out.println("child thread performing calculation");

			
			for(int i=0;i<=100;i++){
				total+=i;
			}
			
			System.out.println("child thread giving the notification");
			
			this.notify();
			
		}
		
		
		
	}
	
	

}
