package day5.liveClass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _3BufferedWriter {
	public static void main(String[] args) throws IOException {
		
//		FileWriter fw = new FileWriter("D:\\fileWriter");
//		BufferedWriter bw = new BufferedWriter(fw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\fileWriter"));
		
		bw.write(100);//d will be added
		
		bw.newLine(); //inserting a new line --> advantage of buffer writer
		
		bw.write("ramesh");
		bw.newLine();
		bw.write("india");
		bw.newLine();
		char ch[]={'a','b','c'};
		bw.write(ch);
		bw.flush();
		bw.close();
		System.out.println("done");
		
		
	}
}
