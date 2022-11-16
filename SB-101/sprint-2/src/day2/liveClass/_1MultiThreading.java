package day2.liveClass;

public class _1MultiThreading extends Thread{
	
	@Override
	public void run() {
		System.out.println("Inside rum method of _1Multithreading");
		
		for(int i=0;i<10;i++) {
			System.out.println("inside rum methof of _1 " + i);
		}
		
		System.out.println("end of run method");
	}
	
	public static void main(String[] args) {
		//---> main default thread is their (only on thread)...
		System.out.println("indide the main of _1MultiThreading");
		
		_1MultiThreading x1 = new _1MultiThreading();
		//x1.run(); // no new thread
	
		x1.start(); // new thread generated and now two thread -- messed up output
		
		//x1.start(); // exception -- one thread cannot be started again
	
		for(int i=30;i<40;i++) {
			System.out.println("Indide main of miltithreading "+i);
		}
		
		System.out.println("End of main");
		
	}
}
