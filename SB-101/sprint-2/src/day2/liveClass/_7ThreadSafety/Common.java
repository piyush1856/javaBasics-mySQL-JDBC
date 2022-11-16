package day2.liveClass._7ThreadSafety;

public class Common {
	public synchronized void fun1(String name){
		System.out.print("Welcome");
		
		try{
			Thread.sleep(1000);
		}
			catch(Exception ee){
		}
		
		System.out.println(name);
		
		//the thread working on fun1 should print welcome , pause for 1 second and print the name
	
		//Now what will happen if two threads acts on this fun simultaneously.

	}
}

class ThreadA extends Thread{
	
	Common c;
	String name;
	
	public ThreadA(Common c,String name) {
		this.c=c;
		this.name=name;
	}
	
	@Override
	public void run() {
		c.fun1(name);
	}
}


class ThreadB extends Thread{
	Common c;
	String name;
	public ThreadB(Common c,String name) {
		this.c=c;
		this.name=name;
	}
	
	@Override
	public void run() {
		c.fun1(name);
	}
}
