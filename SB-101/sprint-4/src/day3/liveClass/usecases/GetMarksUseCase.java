package day3.liveClass.usecases;

import java.util.Scanner;

import day3.liveClass.Dao.StudentDao;
import day3.liveClass.Dao.StudentDaoImpl;
import day3.liveClass.exceptions.StudentException;

public class GetMarksUseCase {
	
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll :");
		int roll= sc.nextInt();

		StudentDao dao = new StudentDaoImpl();
		
		try {
			int marks= dao.getMarksByRoll(roll);
			System.out.println(marks);
		} catch (StudentException e) {
		
			e.printStackTrace();
		}
		
//		if(marks >= 0)
//			System.out.println("Marks is :"+marks);
//		else
//			System.out.println("Student does not exist with Roll :"+roll);
		
		
	}

}
