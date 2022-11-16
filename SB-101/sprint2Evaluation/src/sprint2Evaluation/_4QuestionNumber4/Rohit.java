package sprint2Evaluation._4QuestionNumber4;

public class Rohit implements Runnable{

	@Override
	public void run() {
		int product =1;
		
		for(int i=1;i<=10;i++) {
			product = product*i;
		}
		
		System.out.println(Thread.currentThread().getName() +" is printing " + product);
		
	}

}
