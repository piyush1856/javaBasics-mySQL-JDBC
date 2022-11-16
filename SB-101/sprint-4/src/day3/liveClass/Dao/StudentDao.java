package day3.liveClass.Dao;

import java.util.List;

import day3.liveClass.exceptions.StudentException;
import day3.liveClass.model.Student;

public interface StudentDao {
	
	public String insertStudentDetails(int roll,String name,String address,int marks);
	
	public String insertStudentDetails2(Student student);
	
	public int getMarksByRoll(int roll)throws StudentException;
	
	public Student getStudentByRoll(int roll) throws StudentException; 
	
	public List<Student> getAllStudent()throws StudentException;

}
