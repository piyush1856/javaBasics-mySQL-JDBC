package day3.assingment.usecases;

import java.util.Scanner;

import day3.assingment.dao.EmployeeDaoImplementation;
import day3.assingment.dao.EmployeeDaoInterface;

public class InsertEmployeeUsecase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter eid :");
		int eid= sc.nextInt();
		
		System.out.println("Enter Name :");
		String name= sc.next();
		
		System.out.println("Enter Salary :");
		int salary= sc.nextInt();
		
		
		EmployeeDaoInterface emp = new EmployeeDaoImplementation();
		String res =emp.insertEmployeeDetail(eid, name, salary);
		
		System.out.println(res);
		
	}

}
