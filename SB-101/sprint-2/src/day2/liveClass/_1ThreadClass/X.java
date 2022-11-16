package day2.liveClass._1ThreadClass;

public class X extends Thread{
	
	@Override
	public void run() {
		System.out.println("Inside run method of _1Multithreading");
		
		for(int i=0;i<10;i++) {
			System.out.println("inside run method of _1 " + i);
		}
		
		System.out.println("end of run method");
	}
	
	public static void main(String[] args) {
		//---> main default thread is their (only on thread)...
		System.out.println("indide the main of _1MultiThreading");
		
		X x1 = new X();
		//x1.run(); // no new thread just like  a non static method of  X class
	
		x1.start(); // new thread generated and now two thread -- messed up output
					//run method get call automatically
		
		//x1.start(); // exception -- one thread cannot be started again
	
		for(int i=30;i<40;i++) {
			System.out.println("Indide main of miltithreading "+i);
		}
		
		System.out.println("End of main");
		
	}
}
