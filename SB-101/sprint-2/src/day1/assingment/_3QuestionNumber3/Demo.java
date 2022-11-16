package day1.assingment._3QuestionNumber3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		
		List<Integer> x = Arrays.asList(2,3,4,5,6,7,8,9);
		
		List<?> square = x.stream().map(s -> s*s).collect(Collectors.toList());
		
		
		x.forEach(s -> System.out.println(s));
		
		System.out.println("===============================================");
		
		square.forEach(s -> System.out.println(s));
	}
}
