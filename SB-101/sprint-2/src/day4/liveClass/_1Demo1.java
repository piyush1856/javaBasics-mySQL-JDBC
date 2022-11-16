package day4.liveClass;

public class _1Demo1  extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Inside run method");
		
		for(int i=0;i<20;i++) {
			System.out.println("Indside loop of run : " + i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("end of run method");
	}
	
	
	public static void main(String[] args) {
		
		_1Demo1 d1 = new _1Demo1();
		
		d1.start();  //2 thread (main and child)
		
		for(int i=50;i<60;i++) {
			System.out.println("Indside loop of main : " + i);
		}
		
		System.out.println("end of main method");
		
		
		//d1.join() --> by default it is present at last line of main (all thread will be present here
		

	}
	
	//Note: Every thread in Java by default join with main thread as a last statament of the main method. this ensure that untill all the threads get executed completly main thread does not dies.
	

}
