package day2.liveClass;

public class Demo2 {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("day2.liveClass.A"); //only static method will be printed
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
