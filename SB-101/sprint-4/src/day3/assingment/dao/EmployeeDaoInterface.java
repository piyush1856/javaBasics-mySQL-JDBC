package day3.assingment.dao;

import java.util.List;

import day3.assingment.Exception.EmployeeException;
import day3.assingment.model.Employee;

public interface EmployeeDaoInterface {
	
	public int getSalaryByID(int eid); 
	
	public List<Employee> getAllEmployee() throws EmployeeException;
	
	public void updateSalary();
	
	public String insertEmployeeDetail(int eid, String name, int salary);
	
	public Employee searchEmployee(int eid) throws EmployeeException;
	
	public List<Employee> getEmployeeSalaryLessthan80000() throws EmployeeException;
}
