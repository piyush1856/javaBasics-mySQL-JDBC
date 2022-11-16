package day2.assingment._1QuestionNumber1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<String> cities = Arrays.asList("delhi","mumbai", "chennai", "kolkata", "bengaluru");
		
		Collections.sort(cities,(o1,o2) -> o2.compareTo(o1));
		
		for(String s : cities) {
			System.out.println(s);
		}
	}
}
