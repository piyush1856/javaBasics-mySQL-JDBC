package day1.liveClass.nioPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadingAndWritingToDifferentFile {
	
	public static void main(String[] args) throws IOException {
		
		Path sourcePath = Paths.get("d://a1.txt");
		Path dPath = Paths.get("ab.txt");
		
		Files.createFile(dPath);
		List<String> list = Files.readAllLines(sourcePath);
		
		Files.write(dPath, list);
		System.out.println("done");
	}


}
