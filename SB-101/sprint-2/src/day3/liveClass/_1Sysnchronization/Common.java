package day3.liveClass._1Sysnchronization;

public class Common {
	
	public static synchronized void fun1(String name){
		System.out.print("Welcome");
		
		try{
			Thread.sleep(1000);
		}
			catch(Exception ee){
		}
		
		System.out.println(name);
		
		
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
