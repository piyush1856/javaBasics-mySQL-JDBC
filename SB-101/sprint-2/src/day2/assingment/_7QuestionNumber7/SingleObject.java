package day2.assingment._7QuestionNumber7;

public class SingleObject implements Runnable{

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName(); 
		int threadPriority = Thread.currentThread().getPriority();
		
		for(int i=0;i<10;i++) {
			System.out.println(threadName);
			System.out.println(threadPriority);
		}
		
		System.out.println("End of " + threadName);
		
		
			
	}

}
