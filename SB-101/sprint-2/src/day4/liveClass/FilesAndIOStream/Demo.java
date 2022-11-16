package day4.liveClass.FilesAndIOStream;

import java.io.File;
import java.io.IOException;

public class Demo {
	//	file class
	// belong to java.io package
	//	This class is used to know the characteristics of something present in the hard-disk.
	//	This java.io.File class has many functionalities using which we can identify the features of file or
	//	directory present in the given location.
	
	public static void main(String[] args) throws IOException {
		
		
		File f = new File("D://abc.txt"); //relative path //(d://"abc.txt") for locally
		
		System.out.println(f.exists());
		
		f.createNewFile();  //f.mkdir() for folder
		
		System.out.println(f.exists());
		
		
		/*
		 * The above line will not create a new physical file.
		If the file "abc.txt" is already exist in the current folder then f will point the already existing file. if the file is
		not present the f will represent simply name of the file.
		 * 
		 */
		
		
		/*
		 * 
		 *to create a folder f.mkdir() 
		 * 
		 * directory and sub directory : - File f=new File(String subdir,String fname);
											File f =new File(File subdir,String fname);
import java.io.File;

public class Demo {

	public static void readFiles(File f) {
		
		File[] files= f.listFiles();
		
		for(File file:files) {
			
			if(file.isDirectory())
				readFiles(file);
			else
				System.out.println(file.getName());
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {

		File file= new File("d://xyz");
		
		readFiles(file);
		
	
	}
}
		 * 
		 **/
		
	}

	
}
