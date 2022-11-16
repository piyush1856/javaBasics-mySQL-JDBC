package day5.liveClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _1FileWriter {
	public static void main(String[] args) throws IOException {
		
		//File f = new File("D://fileWriter");
		//FileWriter fw = new FileWriter(f); // we can also create file by passing file object 
		
		FileWriter fw = new FileWriter("D://fileWriter"); //true is to so that it can't override the data
		
		fw.write(100);
		
		fw.write("\n");  //drawback : has to given manually and different operating system have different syntax
		
		fw.write("Piyush");
		fw.write("\n");
		fw.write(100);//d will be added
		fw.write("ramesh\nwelcome");
		fw.write("\n");
		fw.write("india");
		fw.write("\n");
		char ch[]={'a','b','c'};
		fw.write(ch);

		
		System.out.println("Done ...");
		
		fw.flush(); // to get from buffer or it will won't show in file
		fw.close();
		
	}
}
