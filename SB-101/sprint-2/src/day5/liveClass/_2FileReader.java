package day5.liveClass;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _2FileReader {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\fileWriter");
		
		int ch = fr.read();
		
		while(ch != -1) {
			System.out.print((char)ch);  // cast it char or it will print ascii value
			ch = fr.read();
		}
		
		
		System.out.println("------------------------------------------------------------------");
		//another way
		
		File f = new File("D:\\fileWriter");
		FileReader fr2 = new FileReader(f);
		
		long len = f.length();
		char[] chr = new char[(int)len];
		
		fr2.read(chr);
		
		for(char c : chr) {
			System.out.print(c);
		}
		//this method will also not work of file size is too big beacause file lenght will cross the int range
		//so use buffer reader class
		
		
		
		
		
	}

}
