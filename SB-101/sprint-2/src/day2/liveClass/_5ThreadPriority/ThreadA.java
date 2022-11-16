package day2.liveClass._5ThreadPriority;

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

	

}
