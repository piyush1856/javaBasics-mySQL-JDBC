package sprint2Evaluation._2QuestionNumber2;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		CalculatorThread ct = new CalculatorThread();
		Thread t = new Thread(ct);
		
		t.start();
		
		synchronized (t) {
			t.wait();
		}
		System.out.println(ct.total);
	}

}
