package day3.liveClass._2SysnchronizedBlock;

//import day2.liveClass._1ThreadClass.X;

public class Common {
	
	public void fun1(String name){
		
		//object level lock
//		synchronized (this) {
//			
//			System.out.print("Welcome");
//			
//			try{
//				Thread.sleep(1000);
//			}
//				catch(Exception ee){
//			}
//			
//			System.out.println(name);
//		}
		
		//class level lock
		synchronized (Common.class) {
			//we can take any class in above syntax but key will be required for that class
			//to execute code over here as well as static method of that particular class
			
			//if a thread gets the lock of a1 object of A class
			//(not a2 obj of A class) then only it is allowed
			//to execute the following block of code (if A class obj is parameter)
				
			
			
			System.out.print("Welcome");
			
			try{
				Thread.sleep(1000);
			}
				catch(Exception ee){
			}
			
			System.out.println(name);
		}
		
		
		
		
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
