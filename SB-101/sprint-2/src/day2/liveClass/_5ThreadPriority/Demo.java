package day2.liveClass._5ThreadPriority;

import day2.liveClass._4MultipleThreadOnSingleObject.ThreadA;

public class Demo {
	
	public static void main(String[] args) {
		// 1 to 10 : least to highest
		
		//main thread is parent thread : priority --> 5
		//thread started by parent are child thread
		//priority will also be inherited by child
		
		//speed of running will be same but chance of getting run will be determined by priority
		
		//thread priority will work in blocked state : when thread are waiting
		
		ThreadA ta = new ThreadA();
		
		Thread one = new Thread(ta);
		Thread two = new Thread(ta);
		
		one.setName("Raj");
		two.setName("Simran");
		
		
		two.setPriority(10);
		
		//Thread.currentThread().setPriority(8); //for main thread
		
		one.start();
		two.start();
		
	}
}
