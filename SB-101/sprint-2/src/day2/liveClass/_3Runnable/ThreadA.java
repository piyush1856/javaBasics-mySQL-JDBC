package day2.liveClass._3Runnable;

//runnable is best approach because in extend class we cannot extend two class simultaneously
//and main advantages of object oriented programming was getting compromised
//in case of implement a door is opened to extend a class

public class ThreadA implements Runnable{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 20; i++) {
			//thread.currectthread() will return currently running thread object
			//on that object calling getName();
			String tname=Thread.currentThread().getName();
			System.out.println(tname +" is running " + i);

		}
		System.out.println("end of Thread A");
	}
	//write your task in run method and hand over the task to your servant(thread in main class)
	//starting thread with runnable interface
	public static void main(String[] args){
		
		ThreadA ta =new ThreadA();
		Thread tr =new Thread(ta); //passing Runnable object to the constructor of Thread class
		
		tr.start();
		
		for(int i=20;i<40;i++){
			System.out.println("inside main of ThreadA : "+i);
		}
	}
	

}
