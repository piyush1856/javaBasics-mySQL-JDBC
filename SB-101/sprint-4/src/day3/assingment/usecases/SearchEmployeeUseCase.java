package day3.assingment.usecases;

import java.util.Scanner;

import day3.assingment.Exception.EmployeeException;
import day3.assingment.dao.EmployeeDaoImplementation;
import day3.assingment.dao.EmployeeDaoInterface;
import day3.assingment.model.Employee;

public class SearchEmployeeUseCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eid ..");
		int eid = sc.nextInt();
		
		EmployeeDaoInterface dao = new EmployeeDaoImplementation();
		
		try {
			Employee emp =  dao.searchEmployee(eid);
			System.out.println(emp);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
				
		
		
		
		
	}
}
