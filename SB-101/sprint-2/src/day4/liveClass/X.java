package day4.liveClass;

public class X implements Runnable {

//	@Override
	public void fun1() {
		for(int i=50;i<60;i++) {
			System.out.println("Inside run method of X : " + i);
		}
		
		
	}
	
	public static void main(String[] args) {
		Thread tr1 = new Thread(new X()::fun1); //treated as runnable object
		
		
		
		//lambda way
//		Thread tr1 = new Thread(()-> {
//			for(int i=50;i<60;i++) {
//				System.out.println("Inside run method of X : " + i);
//			}
//		});
		
		
		tr1.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Inside main of Demo : " + i);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
