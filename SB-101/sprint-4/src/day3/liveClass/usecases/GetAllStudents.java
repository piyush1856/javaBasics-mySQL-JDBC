package day3.liveClass.usecases;

import java.util.List;

import day3.liveClass.Dao.StudentDao;
import day3.liveClass.Dao.StudentDaoImpl;
import day3.liveClass.exceptions.StudentException;
import day3.liveClass.model.Student;

public class GetAllStudents {
	
	public static void main(String[] args) {
		
		
		StudentDao dao = new StudentDaoImpl();
		
		
		try {
		 	List<Student> students = dao.getAllStudent();
		 	students.forEach(s -> System.out.println(s));
			 	
		 	
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
