package day5.assingment._1QuestionNumber1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter Address : ");
		String address = sc.next();
		sc.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\abc.txt"));
		bw.write("Name : "+name);
		bw.newLine();
		bw.write("Address : "+address);
		
		bw.flush();
		bw.close();
		System.out.println("done");
		
	}

}
