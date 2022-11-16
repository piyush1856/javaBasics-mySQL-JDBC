package day5.assingment._2QuestionNumber2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("D://abc.txt"));
		
		//String line = br.readLine();
		
//		while(line!=null) {
//			System.out.println(line);
//			line= br.readLine();
//		}
		
		br.lines().forEach(l -> System.out.println(l)); 
	}

}
