package day4.assingment.dao;

import java.util.List;

import day4.assingment.exceptions.DepartmentException;
import day4.assingment.exceptions.EmployeeException;
import day4.assingment.model.Department;
import day4.assingment.model.Employee;

public interface DepartmentDao {
	public String insertDepartmentData(Department d) throws DepartmentException;
	
	public String deleteDepartment() throws DepartmentException, EmployeeException;
	
	public List<Department> departmentDetail() throws DepartmentException, EmployeeException;
}
