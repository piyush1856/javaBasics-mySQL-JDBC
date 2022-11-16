package day4.assingment._6QuestionNumber6;

import java.util.concurrent.Callable;

public class CallableClass implements Callable<Boolean>{
	
	private int num;
	

	public CallableClass(int num) {
		this.num = num;
	}


	@Override
	public Boolean call() throws Exception {
		
		System.out.println(Thread.currentThread().getName() + " if printing the result ...");
		
		if(num %2 == 0) {
			return true;
		}else {
			return false;
		}
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}
	
	

}
