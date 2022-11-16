package day4.assingment.usecases;

import java.util.List;

import day4.assingment.dao.DepartmentDao;
import day4.assingment.dao.DepartmentDaoImplementation;
import day4.assingment.exceptions.DepartmentException;
import day4.assingment.exceptions.EmployeeException;
import day4.assingment.model.Department;

public class DepartmentDetailOfMumbai {
	
	public static void main(String[] args) {
		
		
		DepartmentDao dao = new DepartmentDaoImplementation();
		
		try {
			List<Department>dep =	dao.departmentDetail();
			
			dep.forEach(d -> System.out.println(d));
		} catch (DepartmentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
