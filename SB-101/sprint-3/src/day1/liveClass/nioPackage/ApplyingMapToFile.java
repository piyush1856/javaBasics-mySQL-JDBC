package day1.liveClass.nioPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ApplyingMapToFile {
	
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("d://a1.txt");
		Stream<String> str= Files.lines(p);
		
		str.map(line -> {
			if(line.contains("admin"))
				return line.replace("admin","Welcome Admin");
			else
				return line;
		}).forEach( line -> System.out.println(line));
		
	}


}
