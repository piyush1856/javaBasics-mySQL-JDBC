package day5.liveClass;

public class intro {

}
/*
  Files and IO streams:
--------------------------

Reader class (Ac) : It is the super class of all the classes using which we can read 
the data from the source in the form of charecter.

Writer class(Ac) : It is the super class of all the classes using which we write the 
data to the destination in the form of Charecter.

InputStream(Ac)  class : It is the super class of all the classes using which we can read 
the data from the source in the form of bytes.

OutputStream(Ac) class : It is the super class of all the classes using which we write the 
data to the destination in the form of bytes.


FileWriter:
=========

constructor: 
----------------

FileWriter fw = new FileWriter(String fname)throws IOException;

FileWriter fw = new FileWriter(String fname, boolean flag)throws IOException;// file will be open in appending mode.


FileWriter fw = new FileWriter(File file)throws IOException;

FileWriter fw = new FileWriter(File file, boolean flag)throws IOException;// file will be open in appending mode.

***Note: if the specified file is not available then the above constructor will create a new file.


some of the methods of FileWrite class:
-------------------------------------------------

write(int ch); // to write a single charecter to the file // ascii/unicode.

write(char[] ch);// write the array of charecter to the file.

write(String s); // write the string to the file.

flush(); // it gives the guarantee that the last charecter of the data also written to the file.

close(); // close the currently opend file.


Note: the main limitation of the FileWriter class is we need to add line seperator manually which is either 
"\n" or "\r\n" which will depent upon the underlaying OS.


FileReader class :
===============

--we can use this class to read the charecter data from a file to the program.

FileReader fr = new FileReader(String fname);

FileReader fr = new FileReader(File file);


method of FileReader class:
----------------------------------

int read(); // it attempt to read the next charecter from the file and returns it in the 
form of int value (ascii / unicode) value.

--if the next charecter is not available then it will return -1, -1 will represent end of 
the file.

abc 

read() ; 97 98 99 -1


int read(char[] chr); // it will attempts to read the enough charecter from the 
file into the supplied char array and return the number of charecter coppied into
the array.


abcxyxsdfsdfsdfsdfsdafsdafsda

char[] ch=new char[10];

read(ch);  //10
 */