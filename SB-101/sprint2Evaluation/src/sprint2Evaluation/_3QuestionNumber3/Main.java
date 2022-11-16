package sprint2Evaluation._3QuestionNumber3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	
	public static void main(String[] args) throws Exception, ExecutionException {
		
		CallableClass[] nums = {
			new CallableClass(5),	
			new CallableClass(6),
			new CallableClass(7),
			new CallableClass(8),
			new CallableClass(9),
			new CallableClass(10),
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		Integer	result;
		
		for(CallableClass c : nums) {
			Future<Integer> f = service.submit(c);
			result= f.get();
			
			System.out.println(result);
				
		}
		service.shutdown();
		
		
		
	}

}
