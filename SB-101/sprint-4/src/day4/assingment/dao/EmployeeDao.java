package day4.assingment.dao;

import java.util.List;

import day4.assingment.exceptions.DepartmentException;
import day4.assingment.exceptions.EmployeeException;
import day4.assingment.model.Employee;

public interface EmployeeDao {
	
	public String insertEmployeeData(Employee e) throws EmployeeException;
	
	public List<Employee> detailOfEmployeeOfAcconts()throws EmployeeException;
	
	

}
