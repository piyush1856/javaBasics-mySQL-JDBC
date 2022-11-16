package sprint2Evaluation._4QuestionNumber4;

public class Dhoni implements Runnable{

	@Override
	public void run() {
		int sum =0;
		
		for(int i=1;i<=20;i++) {
			sum+=i;
		}
		
		System.out.println(Thread.currentThread().getName() +" is printing " + sum);
		
	}

}
