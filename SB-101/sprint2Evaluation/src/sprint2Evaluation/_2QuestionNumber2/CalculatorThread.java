package sprint2Evaluation._2QuestionNumber2;

public class CalculatorThread implements Runnable{
	
	int total=1;
	
	@Override
	public void run() {
		
		synchronized (this) {
			
			for(int i=1;i<=10;i++) {
				total = total*i;
			}
			this.notify();
		}
		
	}
	

}
