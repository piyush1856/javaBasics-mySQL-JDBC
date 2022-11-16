package day3.assingment.usecases;

import java.util.ArrayList;
import java.util.List;

import day3.assingment.Exception.EmployeeException;
import day3.assingment.dao.EmployeeDaoImplementation;
import day3.assingment.dao.EmployeeDaoInterface;
import day3.assingment.model.Employee;

public class GetAllEmployee {
	
	public static void main(String[] args) {
		
		EmployeeDaoInterface dao = new EmployeeDaoImplementation();
		
		List<Employee> emp = new ArrayList<>();
		
		try {
			emp=dao.getAllEmployee();
			emp.forEach(e -> System.out.println(e));
		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
