package sprint2Evaluation._4QuestionNumber4;

public class Kohli implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName() +" is printing " + i);
		}
		
	}

}
