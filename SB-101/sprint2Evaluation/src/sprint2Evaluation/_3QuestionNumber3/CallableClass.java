package sprint2Evaluation._3QuestionNumber3;

import java.util.concurrent.Callable;

public class CallableClass implements Callable<Integer>{
	
	private int num;

	public CallableClass(int num) {
		this.num = num;
	}
	

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName()+" is printing ...");
		
		int product =1;
		
		for(int i=1;i<=num; i++) {
			product = product*i;
		}
		
		return product;
		
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}
	
	

}
