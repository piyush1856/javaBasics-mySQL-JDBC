package day1.liveClass.nioPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyingAFile {
	
	public static void main(String[] args) throws IOException {
		
		Path source=Paths.get("D://a1.txt");
		
		Path dest =Paths.get("ab2.txt");
		
		Files.copy(source,dest);
		System.out.println("done");

	}
}

//Note : If we use move() method in place of copy() method then from the source the files will be
//removed(like cut and paste option).