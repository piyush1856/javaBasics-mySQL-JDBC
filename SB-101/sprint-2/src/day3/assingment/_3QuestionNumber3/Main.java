package day3.assingment._3QuestionNumber3;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		OddThread odd = new OddThread();
		EvenThread even = new EvenThread();
		
		Thread oddThread = new Thread(odd);
		Thread evenThread = new Thread(even);
		
		oddThread.start();
		oddThread.join();
		evenThread.start();
	}

}
