package day4.assingment._6QuestionNumber6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	public static void main(String[] args) throws Exception, ExecutionException {
		
		CallableClass[] nums= {
				new CallableClass(10),
				new CallableClass(11),
				new CallableClass(12),
				new CallableClass(13),
				new CallableClass(14),
				new CallableClass(15),
		};
		
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		String result;
		
		for(CallableClass num : nums) {
			Future<Boolean> f= service.submit(num);
			
			if(f.get()) {
				result = "Even Number";
				
			}else {
				result = "Odd Number";
			}
			
			System.out.println(num.getNum()+ " is " + result);
		}
		service.shutdown();
		
	}
}
