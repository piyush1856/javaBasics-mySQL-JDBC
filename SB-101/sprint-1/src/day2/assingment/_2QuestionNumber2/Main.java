package day2.assingment._2QuestionNumber2;

public class Main {
	
	public static int forMethodreference(String num) {
		return Integer.parseInt(num);
	}
	
	public static void main(String[] args) {
		
		X convertstringToNum = Main :: forMethodreference;
		int result = convertstringToNum.convetStringToNumber("100");
		System.out.println(result);
		
		//OR,
		
		X convertstringToNum2 = Integer :: parseInt;
		int result2 = convertstringToNum2.convetStringToNumber("200");
		System.out.println(result2);
		
		
	}
}
