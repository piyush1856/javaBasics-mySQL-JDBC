package day1.liveClass.nioPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Writing {
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("d://a1.txt");
		String msg="welcome to java";
		//writing a normal string
		Files.write(p, msg.getBytes());
		
		List<String> list= Arrays.asList("delhi","mumbai","kolkata","chennai");
		//writing a List of String
		//Files.write(p, list);
		//In append mode
		
		Files.write(p, list,StandardOpenOption.APPEND); // it will append not overwrite
			System.out.println("done...");
		}

}
