package day4.assingment.usecases;

import java.util.List;

import day4.assingment.dao.EmployeeDao;
import day4.assingment.dao.EmployeeDaoImplementation;
import day4.assingment.exceptions.EmployeeException;
import day4.assingment.model.Employee;

public class detailOfEmployeeOfAccontsUseCase {
	
	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImplementation();
		
		try {
			List<Employee> emp = dao.detailOfEmployeeOfAcconts();
			emp.forEach(s -> System.out.println(s));
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
