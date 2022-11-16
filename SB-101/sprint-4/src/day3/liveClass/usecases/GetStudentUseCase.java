package day3.liveClass.usecases;

import java.util.Scanner;

import day3.liveClass.Dao.StudentDao;
import day3.liveClass.Dao.StudentDaoImpl;
import day3.liveClass.exceptions.StudentException;
import day3.liveClass.model.Student;

public class GetStudentUseCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll :");
		int roll= sc.nextInt();

		StudentDao dao = new StudentDaoImpl();
		
		try {
			Student student= dao.getStudentByRoll(roll);
			System.out.println(student);
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
//		if(student != null)
//			System.out.println(student);
//		else
//			System.out.println("Student does not exist with Roll :"+roll);
		

		
	}
	
	
	

}
