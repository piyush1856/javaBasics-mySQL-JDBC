package day3.assingment.usecases;

import java.util.Scanner;

import day3.assingment.dao.EmployeeDaoImplementation;
import day3.assingment.dao.EmployeeDaoInterface;

public class GetSalaryByEidUsecase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eid ..");
		int eid = sc.nextInt();
		
		EmployeeDaoInterface dao = new EmployeeDaoImplementation();
		int salary = dao.getSalaryByID(eid);
		
		if(salary > 0) {
			System.out.println(salary);
		}else {
			System.out.println("Not found ..");
		}
		
	}

}
