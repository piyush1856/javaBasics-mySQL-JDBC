package day4.assingment.usecases;

import java.util.Scanner;

import day4.assingment.dao.EmployeeDao;
import day4.assingment.dao.EmployeeDaoImplementation;
import day4.assingment.exceptions.EmployeeException;
import day4.assingment.model.Employee;

public class InsertEmployeeDataUseCases {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name :");
		String name= sc.next();
		
		System.out.println("Enter address :");
		String address= sc.next();
		
		System.out.println("Enter phone :");
		long phone= sc.nextLong();
		String num = Long.toString(phone);
		
		System.out.println("Enter deptid ...");
		int deptid = sc.nextInt();
		
		Employee emp = new Employee();
		emp.setName(name);
		emp.setAddress(address);
		emp.setDeptid(deptid);
		emp.setPhone(num);
		
		EmployeeDao dao = new EmployeeDaoImplementation();
		try {
			String result =dao.insertEmployeeData(emp);
			System.out.println(result);
		} catch (EmployeeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
	}

}
