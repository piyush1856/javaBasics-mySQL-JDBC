package day2.assingment._3QuestionNumber3;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("delhi","mumbai", "chennai", "kolkata", "bengaluru");
		
		PrintList printList =  city ->{
			for(String c : cities) {
				System.out.println(c);
			}
		};
			
		
		
		printList.display(cities);

	}
}
