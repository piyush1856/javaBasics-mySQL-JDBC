package day5.liveClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4BufferedReader {
	
	public static void main(String[] args) throws IOException {
		//System.in --> address of keyboard
		//System.out --> address of monitor
		
		BufferedReader br = new BufferedReader(new FileReader("d:\\fileWriter"));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
//		while(line!=null) {
//			System.out.println(line);
//			line= br.readLine();
//		}
		
		br.lines().forEach(l -> System.out.println(l));  //functional style of programming
		
		
		//another way to take data from keyboard in JAVA core(Traditional way): Scanner/Bufferedclass/CommandLineArgument
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Name ");
		String name = br2.readLine();
		
		System.out.println("Enter age ");
		int age = Integer.parseInt(br2.readLine());
		
		System.out.println("Welcome " + name + " age " + age );
		
		
		
		
	
	
	
	
	}
}
