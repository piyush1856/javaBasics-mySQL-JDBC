package day4.assingment._1QuestionNumber1;

public class calculatorThread implements Runnable /*extends Thread*/{
	long total =1;

	@Override
	public void run() {
		
		synchronized (this) {
			
			for(int i=1;i<=10;i++) {
				total=total*i;
			}
			
			this.notify();
			
		}
		
	}
	

}
