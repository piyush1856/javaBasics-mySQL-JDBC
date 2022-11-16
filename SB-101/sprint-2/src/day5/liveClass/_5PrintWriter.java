package day5.liveClass;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class _5PrintWriter {
	
	public static void main(String[] args) throws IOException{
		//help to write any kind of primitive data
		//most enhanced writer
		//most enhanced reader bufferedreader
		
		PrintWriter out=new PrintWriter("D://fileWriter");
		
		out.write(100);//d will be added
		out.println(100);
		out.println(true);
		out.println('c');
		out.println("amit");
		
		out.flush(); //need not call the flush method
		out.close();
		
		System.out.println("done..");
	}
}
