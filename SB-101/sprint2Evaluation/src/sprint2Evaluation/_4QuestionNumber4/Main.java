package sprint2Evaluation._4QuestionNumber4;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Kohli k = new Kohli();
		Dhoni d = new Dhoni();
		Rohit r = new Rohit();
		
		Thread t1 = new Thread(k);
		Thread t2 = new Thread(d);
		Thread t3 = new Thread(r);
		
		//setting max priority
		t2.setPriority(10);
		
		//setting thread name 
		t1.setName("Kohli");
		t2.setName("Dhoni");
		t3.setName("Rohit");
		
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t1.start();
	}

}
