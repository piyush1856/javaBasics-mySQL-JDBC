package day4.assingment._1QuestionNumber1;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		calculatorThread ct = new calculatorThread();
		
		Thread t = new Thread(ct);
		t.start();
		
		//ct.start();
		
		synchronized (t) {
			
			//ct.wait();
			t.wait();
			
		}
		
		System.out.println(ct.total);
	}

}
