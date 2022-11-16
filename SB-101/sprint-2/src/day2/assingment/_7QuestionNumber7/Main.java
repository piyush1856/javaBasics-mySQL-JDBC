package day2.assingment._7QuestionNumber7;

public class Main {

	public static void main(String[] args) {
		
		SingleObject singleObj = new SingleObject();
		
		Thread t1 = new Thread(singleObj);
		Thread t2 = new Thread(singleObj);
		
		t1.setName("Dhoni Thread");
		t2.setName("Kohli Thread");
		
		t1.setPriority(8);
		t2.setPriority(10);
		
		t1.start();
		t2.start();

	}

}
